package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.third.stock.info.StockInfoCollector;
import com.pers.yefei.supper.stock.utils.RandomSleep;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:23
 */
@Component
@Slf4j
public class StockInfoBiz {

    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private StockInfoCollector stockInfoCollector;


    private boolean collectorRunning = false;

    /**
     * @desc 批量更新股票基本信息, 全量更新
     *
     */
    public void batchConllectStock(){
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


            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }finally {
            collectorRunning = false;
        }

    }

    private void conllectStockScoreAndSleep(TblStockInfo tblStockInfo) {
        stockInfoCollector.fetchStockInfo(tblStockInfo);
        stockDataService.saveStockInfo(tblStockInfo);
        RandomSleep.sleep(500, 3500);
    }

}
