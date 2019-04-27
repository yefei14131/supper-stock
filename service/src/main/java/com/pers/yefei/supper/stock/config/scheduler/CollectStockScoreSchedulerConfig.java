package com.pers.yefei.supper.stock.config.scheduler;


import com.pers.yefei.supper.stock.biz.StockScoreConllectBiz;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
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
    private IStockScoreService stockScoreService;


    @Autowired
    private StockScoreConllectBiz stockScoreConllectBiz;

//
//    @Scheduled(fixedRate = 24 * 60 * 60 * 1000, initialDelay =  1 * 1000)
//    private void process(){
//        log.info("spring boot scheduler running: CollectStockScoreSchedulerConfig ");
//        stockScoreConllectBiz.batchConllectStockScore();
//        stockScoreConllectBiz.calculateStockScoreChangeByDay();
//    }


    @Scheduled(cron = "0 0 19 * * 2-6")
    public void conllectStockScoreByCron() throws InterruptedException {
        // 随机延时 1s - 5min 执行
        int delay = RandomUtils.nextInt(1000, 5 * 60 * 1000);
        log.info("开始执行定时任务，延时 {}s 执行", delay / 1000);
        Thread.sleep((long)delay);

        stockScoreConllectBiz.batchConllectStockScore();
        stockScoreConllectBiz.calculateStockScoreChangeByDay();
    }

//
//    @Scheduled(cron = "0 */1 * * * * ")
//    public void reportCurrentByCron(){
//        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat().format (new Date()));
//    }
//
//    private SimpleDateFormat dateFormat(){
//        return new SimpleDateFormat ("HH:mm:ss");
//    }

}
