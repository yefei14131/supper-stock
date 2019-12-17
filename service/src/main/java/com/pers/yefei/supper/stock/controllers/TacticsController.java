package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockScoreBiz;
import com.pers.yefei.supper.stock.biz.StockTacticsBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.service.IStockDataService;
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
@RequestMapping(value = "/supper_stock/tactics")
public class TacticsController {


    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private ResponseAdapter responseAdapter;


    @Autowired
    private StockScoreBiz stockScoreConllectBiz;


    @Autowired
    private StockTacticsBiz stockTacticsBiz;


    @Autowired
    private IStockStatisticService stockStatisticService;


    /**
     * 根据当天变化数据，模拟交易
     * @param date
     * @return
     */
    @RequestMapping(value = "/mock/trans")
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


}
