package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockScoreConllectBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/11/19 00:08
 */
@RestController
@Slf4j
public class StatisticController {


    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private ResponseAdapter responseAdapter;


    @Autowired
    private IStockStatisticService stockStatisticService;


    @RequestMapping(value = "/stock/score/change")
    @ResponseBody
    public Object getStockScore(String date) {
        try {

            List<TblStockScoreChange> stockScoreChanges = stockStatisticService.queryStockScoreChangeByDate(DateUtils.parseDate(date));
            return responseAdapter.success(stockScoreChanges);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }

    }

}
