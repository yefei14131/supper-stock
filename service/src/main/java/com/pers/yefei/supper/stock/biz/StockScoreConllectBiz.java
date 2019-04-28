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
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

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


    /**
     * @desc 批量更新股票得分
     *
     *
     */
    public void batchConllectStockScore(){

        // 获取需要更新的股票列表，目前取全量
        // TODO 调整取的策略
        List<TblStockInfo> stockListNeedConllectScore = stockDataService.getStockListNeedConllectScore();


        stockListNeedConllectScore.forEach( tblStockInfo -> {
            try {

                TblStockScore stockScore = stockDataService.getStockScoreToday(tblStockInfo.getStockCode());
                if (stockScore == null){
                    stockScore = new TblStockScore();
                    stockScore.setStockCode(tblStockInfo.getStockCode());
//                    stockScore.setStockName(tblStockInfo.getStockName());
                }

                stockScoreService.getCurrentStockScore(stockScore);

                if(stockScore.getTotalScore() == null){
                    log.info("{}, {} 接口没有评分数据", tblStockInfo.getStockCode(), tblStockInfo.getStockName());
                    tblStockInfo.setIsActive(false);
                    stockDataService.saveStockInfo(tblStockInfo);
//                    return;
                }else{

                    stockDataService.saveStockScore(stockScore);

                    // 得分
                    tblStockInfo.setTotalScore(stockScore.getTotalScore());

                    // 机构持仓
                    tblStockInfo.setOrganizationHoldScore(stockScore.getOrganizationHoldScore());

                    // 全市场情绪
                    tblStockInfo.setBusinessPreferenceScore(stockScore.getBusinessPreferenceScore());

                    // 全市场排名
                    tblStockInfo.setMarketRank(stockScore.getMarketRank());

                    // 行业排名
                    tblStockInfo.setIndustryRank(stockScore.getIndustryRank());

                    // 行业名称
                    tblStockInfo.setIndustryName(stockScore.getIndustryDetail());

                    stockDataService.saveStockInfo(tblStockInfo);
                }

                Thread.sleep((long)(RandomUtils.nextInt(1000, 10000)));
            } catch (ScriptException e) {
                log.error(ExceptionUtils.getStackTrace(e));

            } catch (Exception e) {
                log.error(ExceptionUtils.getStackTrace(e));
            }

        });

        log.info("采集任务执行完成");
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
                    TblStockScoreChange tblStockScoreChange = new TblStockScoreChange();

                    tblStockScoreChange.setChangeValue(diffOrganizationHoldScore);
                    tblStockScoreChange.setDate(new Date());
                    tblStockScoreChange.setFieldName("organizationHoldScore");
                    tblStockScoreChange.setPreValue(prevDayStockScore.getOrganizationHoldScore());
                    tblStockScoreChange.setTodayValue(todayStockScore.getOrganizationHoldScore());
                    tblStockScoreChange.setStockCode(todayStockScore.getStockCode());
                    tblStockScoreChange.setStockName(todayStockScore.getStockName());

                    stockDataService.insertStockScoreChange(tblStockScoreChange);
                }
            }
        });


        log.info("计算股票得分变化完成");
    }


}
