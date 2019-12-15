package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockPublicNoticeBiz;
import com.pers.yefei.supper.stock.biz.StockScoreConllectBiz;
import com.pers.yefei.supper.stock.biz.StockTacticsBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
import com.pers.yefei.supper.stock.model.bean.EastMoneyPublicNoticeInfo;
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
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/11/19 00:08
 */
@RestController
@Slf4j
public class PublicNoticeController {

    @Autowired
    private StockPublicNoticeBiz stockPublicNoticeBiz;


    @Autowired
    private ResponseAdapter responseAdapter;

    /**
     * 采集所有股票当前价格并更新
     * @return
     */
    @RequestMapping(value = "/stock/public_notice/collect")
    @ResponseBody
    public Object collectStockPrice(@RequestParam("date") String date) {
        try {
            Date d = DateUtils.parseDate(date, "yyyy-MM-dd");
            int recordTotal = stockPublicNoticeBiz.fetchStockPublicNoticeByDate(d);
            HashMap resp = new HashMap();
            resp.put("recordTotal", recordTotal);
            return responseAdapter.success(resp);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }

    /**
     * 推送订阅的公告消息
     * @return
     */
    @RequestMapping(value = "/stock/public_notice/push")
    @ResponseBody
    public Object pushStockPublicNotice(@RequestParam("date") String date) {
        try {
            Date d = DateUtils.parseDate(date, "yyyy-MM-dd");
            stockPublicNoticeBiz.publishStockNotice(d);
            HashMap resp = new HashMap();
            resp.put("date", date);
            return responseAdapter.success(resp);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }



}
