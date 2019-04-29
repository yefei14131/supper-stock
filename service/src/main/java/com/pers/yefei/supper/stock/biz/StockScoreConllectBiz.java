package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.script.ScriptException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:23
 */
@Component
@Slf4j
public class StockScoreConllectBiz {

    @Autowired
    private IStockDataService stockDataService;

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
                conllectStockScore(tblStockInfo);
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
                conllectStockScore(tblStockInfo);
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
     * @desc 更新股票得分，取最近被更新为无效的
     *
     */
    public void conllectStockScoreByNewUnActiveStock(){
        try {

            // 获取昨天到今天被更新成无效的股票
            List<TblStockInfo> stockListNeedConllectScore = stockDataService.getNewUnActiveStockList(DateUtils.getZeroDate(DateUtils.getDateAfterDays(-1)));

            stockListNeedConllectScore.forEach( tblStockInfo -> {
                conllectStockScore(tblStockInfo);
            });

            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }

    }



    public TblStockScore conllectStockScore(TblStockInfo stockInfo){
        try {

            TblStockScore stockScore = stockDataService.getStockScoreToday(stockInfo.getStockCode());
            if (stockScore == null){
                stockScore = new TblStockScore();
                stockScore.setStockCode(stockInfo.getStockCode());
            }

            stockScoreService.getCurrentStockScore(stockScore);

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

                stockDataService.saveStockInfo(stockInfo);

            }

            Thread.sleep((long)(RandomUtils.nextInt(1000, 8000)));
            return stockScore;

        } catch (ScriptException e) {
            log.error(ExceptionUtils.getStackTrace(e));

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
        }
        return null;
    }


    public void calculateStockScoreChangeByDay(){

        log.info("开始计算股票得分变化");
        int dayForWeek = DateUtils.dayForWeek(new Date());
        if (dayForWeek > 5 ){
//            return;
        }

        Date prevDate = stockDataService.queryPrevDate();
        log.info("查询前一天记录 {}", DateUtils.transformDate2Y_M_DStr(prevDate));

        if(prevDate == null){
            return;
        }

        List<TblStockScore> todayStockScores = stockDataService.queryStockScoreByDate(new Date());
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

                    TblStockScoreChange stockScoreChange = stockDataService.getStockScoreChangeByDate(todayStockScore.getStockCode(), new Date());

                    if (stockScoreChange == null){
                        stockScoreChange = new TblStockScoreChange();
                    }

                    stockScoreChange.setChangeValue(diffOrganizationHoldScore);
                    stockScoreChange.setDate(new Date());
                    stockScoreChange.setFieldName("organizationHoldScore");
                    stockScoreChange.setPreValue(prevDayStockScore.getOrganizationHoldScore());
                    stockScoreChange.setTodayValue(todayStockScore.getOrganizationHoldScore());
                    stockScoreChange.setStockCode(todayStockScore.getStockCode());
                    stockScoreChange.setStockName(todayStockScore.getStockName());

                    stockDataService.saveStockScoreChange(stockScoreChange);
                }
            }
        });


        log.info("计算股票得分变化完成");
    }


}
