package com.pers.yefei.supper.stock.controllers;

import com.pers.yefei.supper.stock.biz.StockPublicNoticeBiz;
import com.pers.yefei.supper.stock.config.ResponseAdapter;
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

/**
 * @author: yefei
 * @date: 2018/11/19 00:08
 */
@RestController
@Slf4j
@RequestMapping(value = "/supper_stock/public_notice")
public class PublicNoticeController {

    @Autowired
    private StockPublicNoticeBiz stockPublicNoticeBiz;


    @Autowired
    private ResponseAdapter responseAdapter;

    /**
     * 推送订阅的公告消息
     * @return
     */
    @RequestMapping(value = "/push")
    @ResponseBody
    public Object pushStockPublicNotice(@RequestParam(value = "date", defaultValue = "") String date) {
        try {
            Date d = StringUtils.isEmpty(date) ? new Date() : DateUtils.parseDate(date);
            stockPublicNoticeBiz.publishStockNotice(d);
            HashMap resp = new HashMap();
            resp.put("date", date);
            return responseAdapter.success(resp);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }





    /**
     * 采集所有公告
     * @return
     */
    @RequestMapping(value = "/fetch")
    @ResponseBody
    public Object collectStockPrice(@RequestParam(value = "date", defaultValue = "") String date) {
        try {
            Date d = StringUtils.isEmpty(date) ? new Date() : DateUtils.parseDate(date);

            int recordTotal = stockPublicNoticeBiz.fetchStockPublicNoticeByDate(d);
            HashMap resp = new HashMap();
            resp.put("recordTotal", recordTotal);
            return responseAdapter.success(resp);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return responseAdapter.failure(ExceptionUtils.getStackTrace(e));
        }
    }

}
