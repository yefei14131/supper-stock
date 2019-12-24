package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockInfoBiz;
import com.pers.yefei.supper.stock.biz.StockPublicNoticeBiz;
import com.pers.yefei.supper.stock.biz.StockScoreBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
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
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/16
 */
@RestController
@Slf4j
@RequestMapping(value = "/supper_stock/stock_info")
public class StockInfoController {

    @Autowired
    private StockScoreBiz stockScoreConllectBiz;

    @Autowired
    private ResponseAdapter responseAdapter;

    @Autowired
    private IStockStatisticService stockStatisticService;

    @Autowired
    private StockInfoBiz stockInfoBiz;

    /**
     * 采集所有股票基本信息并更新
     * @return
     */
    @RequestMapping(value = "/fetch_all")
    @ResponseBody
    public Object collectStockInfo() {
        try {
            stockInfoBiz.batchConllectStock();
            return responseAdapter.success();

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


    /**
     * 从获取股票基本信息，并更新
     * @return
     */
    @RequestMapping(value = "/get")
    @ResponseBody
    public Object getStockInfo(String stockCode) {
        try {
            TblStockInfo tblStockInfo = stockScoreConllectBiz.forceGetStock(stockCode);
            return responseAdapter.success(tblStockInfo);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }


    /**
     * 根据日期获取新股，只取前50条记录，时间太旧的获取不到
     * @param date
     * @return
     */
    @RequestMapping(value = "/new_stock")
    @ResponseBody
    public Object getStockScoreChange(@RequestParam(name = "date", defaultValue = "") String date) {
        try {

            Date d = StringUtils.isEmpty(date) ? new Date() : DateUtils.parseDate(date);
            List<TblStockInfo> tblStockInfoList = stockInfoBiz.fetchNewStockByDay(d);
            return responseAdapter.success(tblStockInfoList);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }

}
