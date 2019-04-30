package com.pers.yefei.supper.stock.controllers;

import com.alibaba.fastjson.JSONObject;
import com.pers.yefei.supper.stock.biz.StockScoreConllectBiz;
import com.pers.yefei.supper.stock.biz.StockTacticsBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/11/19 00:08
 */
@RestController
@Slf4j
public class IndexController {


    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private ResponseAdapter responseAdapter;

    @Autowired
    private StockScoreConllectBiz stockScoreConllectBiz;

    @Autowired
    private IStockStatisticService stockStatisticService;
    private JSONObject success;


    @RequestMapping(value = "/stock/score/get")
    @ResponseBody
    public Object getStockScore(String stockCode) {
        try {
            TblStockInfo stockInfo = stockDataService.getStockInfo(stockCode);
            TblStockScore stockScore = stockScoreConllectBiz.conllectStockScore(stockInfo);

            return responseAdapter.success(stockScore);


        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }

    }

    @RequestMapping(value = "/stock/collect/start/full")
    @ResponseBody
    public Object startCollectJob() {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stockScoreConllectBiz.batchConllectStockScore();
                }
            }).start();

            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }

    }

    @RequestMapping(value = "/stock/collect/start/patch")
    @ResponseBody
    public Object patchStartCollectJob() {
        try {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    stockScoreConllectBiz.patchConllectStockScore();
                }
            }).start();

            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


    @RequestMapping(value = "/stock/unactive/collect")
    @ResponseBody
    public Object collectUnActiveStock() {
        try {
            List<TblStockInfo> unActiveStockList = stockDataService.getUnActiveStockList();
            List<TblStockInfo> activeStockList = new ArrayList<>();
            unActiveStockList.forEach(stockInfo->{
                stockScoreConllectBiz.conllectStockScore(stockInfo);
                if (stockInfo.getIsActive() == true){
                    activeStockList.add(stockInfo);
                }
            });

            return success;

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }



    /**
     * 计算当日变化并保存
     * @return
     */
    @RequestMapping(value = "/stock/calculate/start")
    @ResponseBody
    public Object calculateStockScoreChangeByDay() {
        try {
            stockScoreConllectBiz.calculateStockScoreChangeByDay();

            List<TblStockScoreChange> stockScoreChanges = stockStatisticService.queryStockScoreChangeByDate(DateUtils.getZeroDate(new Date()));
            return responseAdapter.success(stockScoreChanges);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


}
