package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockScoreBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yefei
 * @date: 2018/11/19 00:08
 */
@RestController
@Slf4j
@RequestMapping(value = "/supper_stock/query")
public class QueryController {

    @Autowired
    private StockScoreBiz stockScoreConllectBiz;

    @Autowired
    private ResponseAdapter responseAdapter;


    @Autowired
    private IStockStatisticService stockStatisticService;


//
//
//    @RequestMapping(value = "/stock/trans/list")
//    @ResponseBody
//    public Object mockTransToday(@RequestParam(name = "date", defaultValue = "") String date) {
//        try {
//            Date queryDate = date.equals("") ? new Date() : DateUtils.parseDate(date);
//
//            List<TblStockTrans> stockTrans = stockStatisticService.queryStockTransByDay(queryDate);
//            return responseAdapter.success(stockTrans);
//
//        } catch (Exception e) {
//            log.error(ExceptionUtils.getStackTrace(e));
//            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
//        }
//    }

}
