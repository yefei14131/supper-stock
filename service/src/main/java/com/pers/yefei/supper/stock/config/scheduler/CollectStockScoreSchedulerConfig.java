package com.pers.yefei.supper.stock.config.scheduler;


import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: yefei
 * @date: 2018/9/10 00:36
 * @desc: 定时任务配置
 */

@Slf4j
@Component
public class CollectStockScoreSchedulerConfig {

    @Autowired
    private IStockScoreService stockScoreService;


    @Scheduled(fixedRate = 60 * 1000, initialDelay =  1 * 1000)
    private void process(){

        log.info("spring boot scheduler running: CollectStockScoreSchedulerConfig ");
//        String stockCode = "002563";
//        TblStockScore stockScore = stockScoreService.getStockScore(stockCode);
//        log.info("stockScore: {}",stockScore);
    }


}
