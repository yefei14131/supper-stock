package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.script.ScriptException;
import java.io.IOException;
import java.util.Date;
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
                }

                stockScoreService.getCurrentStockScore(stockScore);
                stockDataService.saveStockScore(stockScore);

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

                Thread.sleep((long)(RandomUtils.nextInt(1000, 4000)));
            } catch (ScriptException e) {
                log.error(ExceptionUtils.getStackTrace(e));

            } catch (Exception e) {
                log.error(ExceptionUtils.getStackTrace(e));
            }

        });
    }

}
