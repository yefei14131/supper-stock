package com.pers.yefei.supper.stock.controllers;

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

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/11/19 00:08
 */
@RestController
@Slf4j
public class TacticsController {


    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private ResponseAdapter responseAdapter;


    @Autowired
    private IStockScoreService stockScoreService;


    @Autowired
    private StockScoreConllectBiz stockScoreConllectBiz;


    @Autowired
    private StockTacticsBiz stockTacticsBiz;


    @Autowired
    private IStockStatisticService stockStatisticService;


    /**
     * 根据当天变化数据，模拟交易
     * @param date
     * @return
     */
    @RequestMapping(value = "/stock/mock/trans")
    @ResponseBody
    public Object mockTransToday(@RequestParam(name = "date", defaultValue = "") String date) {
        try {
            Date queryDate = date.equals("") ? DateUtils.getZeroDate(new Date()) : DateUtils.parseDate(date);

            stockTacticsBiz.mockTrans();
            List<TblStockTrans> stockTrans = stockStatisticService.queryStockTransByDay(queryDate);
            return responseAdapter.success(stockTrans);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }

    /**
     * 采集所有股票当前价格并更新
     * @return
     */
    @RequestMapping(value = "/stock/collect/price")
    @ResponseBody
    public Object collectStockPrice() {
        try {
            stockTacticsBiz.collectStockPrice();
            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }



}
