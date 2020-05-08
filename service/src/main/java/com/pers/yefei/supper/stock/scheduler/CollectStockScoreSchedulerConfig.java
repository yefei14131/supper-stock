package com.pers.yefei.supper.stock.scheduler;


import com.pers.yefei.supper.stock.biz.StockInfoBiz;
import com.pers.yefei.supper.stock.biz.StockPublicNoticeBiz;
import com.pers.yefei.supper.stock.biz.StockScoreBiz;
import com.pers.yefei.supper.stock.biz.StockTacticsBiz;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import com.pers.yefei.supper.stock.utils.RandomSleep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

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

    @Autowired
    private StockInfoBiz stockInfoBiz;

//    @Scheduled(fixedRate = 60 * 60 * 1000, initialDelay =  1 * 1000)
//    private void process(){
//        log.info("spring boot scheduler running: stockInfoBiz.fetchNewStock() ");
//        stockInfoBiz.fetchNewStock();
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
        RandomSleep.sleep(1000L, 5 * 60 * 1000L);

        stockScoreConllectBiz.batchConllectStockScore();
        stockScoreConllectBiz.calculateStockScoreChangeByDay(date);

        stockTacticsBiz.mockTrans();
        stockTacticsBiz.repareTransPrice();

        StockScoreChangeSummary stockScoreChangeSummary = stockStatisticService.queryStockScoreChangeInfoByDate(date);
        stockScoreBiz.pushStockScoreChangeSummary(stockScoreChangeSummary);


        RandomSleep.sleep(60000L, 60010L);
        List<StockScoreInfoObserver> stockScoreInfoObservers = stockScoreBiz.queryStockObserversFromDB(date);
        stockScoreBiz.pushStockScoreInfoObserver(stockScoreInfoObservers);

    }



    @Scheduled(cron = "1 10 6 * * *")
    public void conllectStockPublicNoticeByCron() {
        /**
         * 定时拉取公告
         */
        Date lessTime = new Date();
        log.info("开始定时拉取公告");
        stockPublicNoticeBiz.fetchStockPublicNotice();
        log.info("开始定时推送公告");
        stockPublicNoticeBiz.publishStockNoticeByLessDate(lessTime);

        /**
         * 获取新股票
         */
        stockInfoBiz.fetchNewStock();
    }


    /**
     * 定时拉取公告
     */
    @Scheduled(cron = "1 10 22 * * *")
    public void conllectStockPublicNoticeByCron2() {
        Date lessTime = new Date();
        log.info("开始定时拉取公告");
        stockPublicNoticeBiz.fetchStockPublicNoticeByDate(new Date());
        log.info("开始定时推送公告");
        stockPublicNoticeBiz.publishStockNoticeByLessDate(lessTime);
    }

}
