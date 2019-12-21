package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockScoreBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * @author yefei
 * @date: 2019/12/16
 */
@RestController
@Slf4j
@RequestMapping(value = "/supper_stock/stock_score")
public class StockScoreController {

    @Autowired
    private StockScoreBiz stockScoreBiz;

    @Autowired
    private ResponseAdapter responseAdapter;

    @Autowired
    private IStockStatisticService stockStatisticService;

    /**
     * 全量采集评分和基本信息
     * @return
     */
    @RequestMapping(value = "/fetch_all")
    @ResponseBody
    public Object startCollectJob() {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stockScoreBiz.batchConllectStockScore();
                }
            }).start();

            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }

    }


    /**
     * 增量采集评分和基本信息
     * @return
     */
    @RequestMapping(value = "/fetch_patch")
    @ResponseBody
    public Object patchStartCollectJob() {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stockScoreBiz.patchConllectStockScore();
                }
            }).start();

            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


    @RequestMapping(value = "/fetch_unactive")
    @ResponseBody
    public Object collectUnActiveStock() {
        try {

            stockScoreBiz.fetchUnActiveStockScore();
            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }

    /**
     * 查看当天采集任务执行进度
     * @return
     */
    @RequestMapping(value = "/job/progress")
    @ResponseBody
    public Object collectProgress() {
        try {
            HashMap data = stockStatisticService.collectProgress();
            return responseAdapter.success(data);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


    /**
     * 计算当日变化并保存
     * @return
     */
    @RequestMapping(value = "/calculate")
    @ResponseBody
    public Object calculateStockScoreChangeByDay(@RequestParam(name = "date", defaultValue = "") String date, @RequestParam(name = "push", defaultValue = "false") Boolean push) {
        try {
            Date d = StringUtils.isEmpty(date) ? new Date() : DateUtils.parseDate(date);

            stockScoreBiz.calculateStockScoreChangeByDay(d);
            StockScoreChangeSummary stockScoreChangeSummary = stockStatisticService.queryStockScoreChangeInfoByDate(d);
            if (push) {
                stockScoreBiz.pushStockScoreChangeSummary(stockScoreChangeSummary);
            }            return responseAdapter.success(stockScoreChangeSummary);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


    @RequestMapping(value = "/change_list")
    @ResponseBody
    public Object getStockScoreChange(@RequestParam(name = "date", defaultValue = "") String date, @RequestParam(name = "push", defaultValue = "false") Boolean push) {
        try {

            Date queryDate = StringUtils.isEmpty(date) ? new Date() : DateUtils.parseDate(date);
            StockScoreChangeSummary stockScoreChangeSummary = stockStatisticService.queryStockScoreChangeInfoByDate(queryDate);
            if (push) {
                stockScoreBiz.pushStockScoreChangeSummary(stockScoreChangeSummary);
            }
            return responseAdapter.success(stockScoreChangeSummary);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }



    @RequestMapping(value = "/stock_score/get")
    @ResponseBody
    public Object getStockScore(String stockCode) {
        try {
            TblStockInfo stockInfo = stockScoreBiz.forceGetStock(stockCode);
            TblStockScore stockScore = stockScoreBiz.conllectStockScoreAndSleep(stockInfo);

            return responseAdapter.success(stockScore);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }

    }



    @RequestMapping(value = "/push_industry")
    @ResponseBody
    public Object pushStockScoreByObserver(@RequestParam(name = "date", defaultValue = "") String date,
                                           String industryKeywords,
                                           @RequestParam(name ="orderBy", defaultValue = "totalValue") String orderBy
    ) {
        try {

            Date d = StringUtils.isEmpty(date) ? new Date() : DateUtils.parseDate(date);

            List<StockScoreInfoObserver> stockScoreInfoObservers;

            if(orderBy.equals("totalValue")) {
                stockScoreInfoObservers = stockScoreBiz.genStockObserversByIndustryTopTotalValue(industryKeywords, d);

            } else {
                stockScoreInfoObservers = stockScoreBiz.genStockObserversByIndustryTopTotalScore(industryKeywords, d);

            }
            stockScoreBiz.pushStockScoreInfoObserver(stockScoreInfoObservers);

            return responseAdapter.success(stockScoreInfoObservers);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }

    }



}
