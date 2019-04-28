package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockScoreConllectBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

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
    private IStockScoreService stockScoreService;


    @Autowired
    private StockScoreConllectBiz stockScoreConllectBiz;


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

}
