package com.pers.yefei.supper.stock.scheduler;


import com.pers.yefei.supper.stock.biz.StockPublicNoticeBiz;
import com.pers.yefei.supper.stock.biz.StockScoreBiz;
import com.pers.yefei.supper.stock.biz.StockTacticsBiz;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: yefei
 * @date: 2018/9/10 00:36
 * @desc: 定时任务配置
 */

@Slf4j
@Component
@Configurable
@EnableScheduling
public class CollectStockScoreSchedulerConfig {

    @Autowired
    private IStockStatisticService stockStatisticService;

    @Autowired
    private StockScoreBiz stockScoreConllectBiz;

    @Autowired
    private StockTacticsBiz stockTacticsBiz;

    @Autowired
    private StockPublicNoticeBiz stockPublicNoticeBiz;

    @Autowired
    private StockScoreBiz stockScoreBiz;

//
//    @Scheduled(fixedRate = 60 * 60 * 1000, initialDelay =  1 * 1000)
//    private void process(){
//        log.info("spring boot scheduler running: CollectStockScoreSchedulerConfig ");
//        stockTacticsBiz.repareTransPrice();
//
//    }


    @Scheduled(cron = "0 0 16 * * 1-5")
//    @Scheduled(fixedRate = 60 * 60 * 1000, initialDelay =  1 * 1000)
    public void conllectStockScoreByCron() throws InterruptedException {

        Date date = new Date();
        if (stockStatisticService.isHolidays(date)){
            log.info("节假日休市，不执行定时任务");
            return;
        }
        // 随机延时 1s - 5min 执行
        int delay = RandomUtils.nextInt(1000, 5 * 60 * 1000);
//        delay = 1;
        log.info("开始执行定时任务，延时 {}s 执行", delay / 1000);
        Thread.sleep((long)delay);

        stockScoreConllectBiz.batchConllectStockScore();
        stockScoreConllectBiz.calculateStockScoreChangeByDay(date);

        stockTacticsBiz.mockTrans();
        stockTacticsBiz.repareTransPrice();

        StockScoreChangeSummary stockScoreChangeSummary = stockStatisticService.queryStockScoreChangeInfoByDate(date);
        stockScoreBiz.pushStockScoreChangeSummary(stockScoreChangeSummary);
    }


    /**
     * 定时拉取公告
     * @throws InterruptedException
     */
    @Scheduled(cron = "1 10 6,22 * * ?")
//    @Scheduled(fixedRate = 60 * 60 * 1000, initialDelay =  1 * 1000)
    public void conllectStockPublicNoticeByCron() {
        Date lessTime = new Date();
        stockPublicNoticeBiz.fetchStockPublicNotice();
        stockPublicNoticeBiz.publishStockNoticeByLessDate(lessTime);
    }





}
