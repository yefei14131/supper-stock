package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.constant.SystemConstant;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockSoreChangeObserver;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import com.pers.yefei.supper.stock.model.bean.StockScorePushInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.service.IPushConfigService;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import com.pers.yefei.supper.stock.third.message.MessageSender;
import com.pers.yefei.supper.stock.third.stock.info.StockInfoCollector;
import com.pers.yefei.supper.stock.third.stock.score.StockScoreCollector;
import com.pers.yefei.supper.stock.utils.DateUtils;
import com.pers.yefei.supper.stock.utils.RandomSleep;
import com.pers.yefei.supper.stock.utils.StockBaseInfoUtils;
import com.pers.yefei.supper.stock.utils.StockScoreUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:23
 */
@Component
@Slf4j
public class StockScoreBiz {

    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private StockScoreCollector stockScoreCollector;

    @Autowired
    private StockInfoCollector stockInfoCollector;

    @Autowired
    private MessageSender messageSender;


    @Autowired
    private IPushConfigService pushConfigService;

    @Autowired
    private IStockScoreService stockScoreService;

    private boolean collectorRunning = false;

    /**
     * @desc 批量更新股票得分, 全量更新
     *
     */
    public void batchConllectStockScore(){
        try {

            if (collectorRunning == true){
                log.error("采集任务正在执行，不可重复执行");
                return;
            }

            collectorRunning = true;

            // 获取需要更新的股票列表，目前取全量
            // TODO 调整取的策略
            List<TblStockInfo> stockListNeedConllectScore = stockDataService.getActiveStockInfoList();

            stockListNeedConllectScore.forEach( tblStockInfo -> {
                conllectStockScoreAndSleep(tblStockInfo);
            });

            this.conllectStockScoreByNewUnActiveStock();

            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }finally {
            collectorRunning = false;
        }

    }

    /**
     * @desc 增量更新股票得分
     *
     */
    public void patchConllectStockScore(){
        try {

            if (collectorRunning == true){
                log.error("采集任务正在执行，不可重复执行");
                return;
            }

            collectorRunning = true;

            // 获取需要更新的股票列表，排除当天已经更新的
            List<TblStockInfo> stockListNeedConllectScore = stockDataService.getStockListNeedConllectScore();

            stockListNeedConllectScore.forEach( tblStockInfo -> {
                conllectStockScoreAndSleep(tblStockInfo);
            });

            this.conllectStockScoreByNewUnActiveStock();

            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }finally {
            collectorRunning = false;
        }

    }


    /**
     * @desc 更新股票得分，取无效状态的股票
     *
     */
    public void fetchUnActiveStockScore(){
        try {

            List<TblStockInfo> unActiveStockList = stockDataService.getUnActiveStockList();
            unActiveStockList.forEach( tblStockInfo -> {
                conllectStockScoreAndSleep(tblStockInfo);
            });

            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }

    }



    /**
     * @desc 更新股票得分，取最近被更新为无效的
     *
     */
    public void conllectStockScoreByNewUnActiveStock(){
        try {

            // 获取昨天到今天被更新成无效的股票
            List<TblStockInfo> stockListNeedConllectScore = stockDataService.getNewUnActiveStockList(DateUtils.getZeroDate(DateUtils.getDateAfterDays(-1)));

            stockListNeedConllectScore.forEach( tblStockInfo -> {
                conllectStockScoreAndSleep(tblStockInfo);
            });

            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }

    }


    /**
     * 获取股票的评分，保存至tbl_stock_score和tbl_stock_info
     * @param stockInfo
     * @return
     */
    public TblStockScore conllectStockScoreAndSleep(TblStockInfo stockInfo){
        try {
            TblStockScore stockScore = stockDataService.getStockScoreToday(stockInfo.getStockCode());
            if (stockScore == null){
                stockScore = new TblStockScore();
                stockScore.setStockCode(stockInfo.getStockCode());
            }

            stockScoreCollector.fetchStockScore(stockScore);
            stockInfoCollector.fetchStockInfo(stockScore);

            if(stockScore.getTotalScore() == null){
                log.info("{}, {} 接口没有评分数据", stockInfo.getStockCode(), stockInfo.getStockName());
                stockInfo.setIsActive(false);
                stockDataService.saveStockInfo(stockInfo);
//                    return;
            }else{

                stockDataService.saveStockScore(stockScore);

                // 得分
                stockInfo.setTotalScore(stockScore.getTotalScore());

                // 机构持仓
                stockInfo.setOrganizationHoldScore(stockScore.getOrganizationHoldScore());

                // 全市场情绪
                stockInfo.setBusinessPreferenceScore(stockScore.getBusinessPreferenceScore());

                // 全市场排名
                stockInfo.setMarketRank(stockScore.getMarketRank());

                // 行业排名
                stockInfo.setIndustryRank(stockScore.getIndustryRank());

                // 行业名称
                stockInfo.setIndustryName(stockScore.getIndustryDetail());
                stockInfo.setIsActive(true);

                // 市净率
                stockInfo.setPriceNetAssetRatio(stockScore.getPriceNetAssetRatio());

                // 市盈率
                stockInfo.setPriceProfitAssetRatio(stockScore.getPriceProfitAssetRatio());

                // 总市值
                stockInfo.setTotalValue(stockScore.getTotalValue());

                // 流通市值
                stockInfo.setFlowValue(stockScore.getFlowValue());

                // 价格
                stockInfo.setPrice(stockScore.getPrice());

                stockDataService.saveStockInfo(stockInfo);

            }

            RandomSleep.sleep(500, 3500);
            return stockScore;

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
        }
        return null;
    }


    /**
     * 计算股票的评分变化情况
     * @param date
     */
    public void calculateStockScoreChangeByDay(Date date){

        log.info("开始计算股票得分变化, {}", DateUtils.transformDate2Y_M_DStr(date));
        int dayForWeek = DateUtils.dayForWeek(date);
        if (dayForWeek > 5 ){
//            return;
        }

        Date prevDate = stockDataService.queryPrevDate(date);
        log.info("查询前一天记录 {}", DateUtils.transformDate2Y_M_DStr(prevDate));

        if(prevDate == null){
            return;
        }

        List<TblStockScore> todayStockScores = stockDataService.queryStockScoreByDate(date);
        List<TblStockScore> prevDayStockScores = stockDataService.queryStockScoreByDate(prevDate);

        HashMap<String, TblStockScore> prevDayStockScoreMap = new HashMap<>();
        prevDayStockScores.forEach(stockScore -> {
            prevDayStockScoreMap.put(stockScore.getStockCode(), stockScore);
        });

        todayStockScores.forEach(todayStockScore ->{
            TblStockScore prevDayStockScore = prevDayStockScoreMap.get(todayStockScore.getStockCode());
            if (prevDayStockScore != null ){
                int diffOrganizationHoldScore = todayStockScore.getOrganizationHoldScore() - prevDayStockScore.getOrganizationHoldScore();

                if (diffOrganizationHoldScore != 0) {
                    log.info("{} {} 机构持仓变化：{}", todayStockScore.getStockCode(), todayStockScore.getStockName(), diffOrganizationHoldScore);

                    TblStockScoreChange stockScoreChange = stockDataService.getStockScoreChangeByDate(todayStockScore.getStockCode(), DateUtils.getZeroDate(new Date()));

                    if (stockScoreChange == null){
                        stockScoreChange = new TblStockScoreChange();
                    }

                    stockScoreChange.setChangeValue(diffOrganizationHoldScore);
                    stockScoreChange.setDate(date);
                    stockScoreChange.setFieldName("organizationHoldScore");
                    stockScoreChange.setPreValue(prevDayStockScore.getOrganizationHoldScore());
                    stockScoreChange.setTodayValue(todayStockScore.getOrganizationHoldScore());
                    stockScoreChange.setStockCode(todayStockScore.getStockCode());
                    stockScoreChange.setStockName(todayStockScore.getStockName());
                    stockScoreChange.setTotalScore(todayStockScore.getTotalScore());
                    stockScoreChange.setUpdateTime(new Date());

                    stockDataService.saveStockScoreChange(stockScoreChange);
                }
            }
        });

        log.info("计算股票得分变化完成");
    }


    /**
     * 从tbl_stock_info查询股票信息，如果查询不到，则重新获取数据并保存
     *
     * @param stockCode
     * @return
     */

    public TblStockInfo forceGetStock(String stockCode){
        TblStockInfo stockInfo = stockDataService.getStockInfo(stockCode);

        if (stockInfo == null){
            stockInfo = new TblStockInfo();
            stockInfo.setStockCode(stockCode);
            this.conllectStockScoreAndSleep(stockInfo);
        }

        return stockInfo;
    }


    public void pushStockScoreChangeSummary(StockScoreChangeSummary stockScoreChangeSummary) {
        StockSoreChangeObserver stockSoreChangeObserver = new StockSoreChangeObserver();
        stockSoreChangeObserver.fromStockScoreChangeSummary(stockScoreChangeSummary);

        stockSoreChangeObserver.setPushConfig(pushConfigService.getPushConfig(SystemConstant.Default_PushConfigID));

        // 过滤
        StockBaseInfoUtils.filterTotalValeTop10AndTotalScoreTop10(stockSoreChangeObserver.getStockScoreChangeSummary().getIncreaseList());
        StockBaseInfoUtils.filterTotalValeTop10AndTotalScoreTop10(stockSoreChangeObserver.getStockScoreChangeSummary().getReduceList());

        messageSender.sendStockScoreChange(stockSoreChangeObserver);
    }


    /**
     * 查询股票基本信息的订阅者，并查询评分和详细信息
     * @param date
     * @return
     */
    public List<StockScoreInfoObserver> queryStockObserversFromDB(Date date) {

        List<StockScoreInfoObserver> stockScoreInfoObservers = stockScoreService.queryStockObserversFromDB(date);

        int observerLength = stockScoreInfoObservers.size();
        for (int observerIndex=0; observerIndex<observerLength; observerIndex++) {

            StockScoreInfoObserver stockScoreInfoObserver = stockScoreInfoObservers.get(observerIndex);
            List<StockScorePushInfo> stockScorePushInfoList = stockScoreInfoObserver.getStockScorePushInfoList();
            int pageSize = 15;

            if (stockScorePushInfoList.size() > pageSize) {
                int pageTotal = stockScorePushInfoList.size() % pageSize == 0 ? stockScorePushInfoList.size() / pageSize : stockScorePushInfoList.size() / pageSize + 1;

                // 前面的页，拆分为新的对象
                for (int i=0; i < pageTotal-1; i++){
                    StockScoreInfoObserver infoObserver = new StockScoreInfoObserver();
                    infoObserver.setDate(stockScoreInfoObserver.getDate());
                    infoObserver.setTitle(stockScoreInfoObserver.getTitle());
                    infoObserver.setMemo(stockScoreInfoObserver.getMemo());
                    infoObserver.setPushConfig(stockScoreInfoObserver.getPushConfig());

                    infoObserver.getStockScorePushInfoList().addAll(stockScoreInfoObserver.getStockScorePushInfoList().subList(i*pageSize, (i+1)*pageSize));
                }

                // 最后一页赋值给当前对象
                List<StockScorePushInfo> stockScorePushInfos = new ArrayList<>();
                stockScorePushInfos.addAll(stockScorePushInfoList.subList((pageTotal - 1) * pageSize, stockScorePushInfoList.size())) ;
                stockScoreInfoObserver.setStockScorePushInfoList(stockScorePushInfos);
            }
        }
        
        
        return stockScoreInfoObservers;
    }


    /**
     * 根据行业关键字，查询评分及相关信息, 按市值排序，取前10
     * @param industryKeywords
     * @param date
     * @return
     */
    public List<StockScoreInfoObserver> genStockObserversByIndustryTopTotalValue(String industryKeywords, Date date) {
        List<StockScoreInfoObserver> stockScoreInfoObservers = stockScoreService.queryStockObservers(industryKeywords, date);
        stockScoreInfoObservers.forEach(stockScoreInfoObserver -> {
            List<StockScorePushInfo> totalValeTop10 = StockScoreUtils.getTotalValeTop10(stockScoreInfoObserver.getStockScorePushInfoList(), 5);
            stockScoreInfoObserver.setStockScorePushInfoList(totalValeTop10);
        });
        return stockScoreInfoObservers;
    }

    /**
     * 根据行业关键字，查询评分及相关信息, 按评分排序，取前10
     * @param industryKeywords
     * @param date
     * @return
     */
    public List<StockScoreInfoObserver> genStockObserversByIndustryTopTotalScore(String industryKeywords, Date date) {
        List<StockScoreInfoObserver> stockScoreInfoObservers = stockScoreService.queryStockObservers(industryKeywords, date);
        stockScoreInfoObservers.forEach(stockScoreInfoObserver -> {
            List<StockScorePushInfo> totalValeTop10 = StockScoreUtils.getTotalScoreTop10(stockScoreInfoObserver.getStockScorePushInfoList(), 5);
            stockScoreInfoObserver.setStockScorePushInfoList(totalValeTop10);
        });
        return stockScoreInfoObservers;
    }


    /**
     * 推送股票评分及基本信息
     * @param stockScoreInfoObservers
     */
    public void pushStockScoreInfoObserver(List<StockScoreInfoObserver> stockScoreInfoObservers){
        for (StockScoreInfoObserver stockScoreInfoObserver : stockScoreInfoObservers) {
            messageSender.sendStockScore(stockScoreInfoObserver);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                log.error("sleep error", e);
            }
        }

    }



}
