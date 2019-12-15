package com.pers.yefei.supper.stock.biz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.model.bean.EastMoneyPublicNoticeInfo;
import com.pers.yefei.supper.stock.model.bean.StockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockPublicNoticeEastMoneyService;
import com.pers.yefei.supper.stock.service.IStockPublicNoticeService;
import com.pers.yefei.supper.stock.third.DingTalk.DingTalkMessageSender;
import com.pers.yefei.supper.stock.third.MessageSender;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Component
@Slf4j
public class StockPublicNoticeBiz {

    private static final int pageSize = 50;

    @Autowired
    private IStockPublicNoticeEastMoneyService stockPublicNoticeEastMoneyService;

    @Autowired
    private IStockPublicNoticeService stockPublicNoticeService;

    @Autowired
    private MessageSender messageSender;

    @Autowired
    private StockScoreConllectBiz stockScoreConllectBiz;


    /**
     * 从三方系统获取当天和前一天的公告，并写入DB
     */
    public void fetchStockPublicNotice() {
        Date prevDate = DateUtils.getDateAfterDays(-1);

        fetchStockPublicNoticeByDate(prevDate);
        fetchStockPublicNoticeByDate(( new Date()));

    }


    /**
     *  按天从三方系统获取公告，并写入DB
     * @param date
     * @return
     */
    public int fetchStockPublicNoticeByDate(Date date) {
        int page = 1;
        int pageTotal = 50;
        EastMoneyPublicNoticeInfo eastMoneyPublicNoticeInfo = null;

        while (page < pageTotal) {

            // 随机延时 1s - 30s 执行
            int delay = RandomUtils.nextInt(1000, 30 * 1000);
            log.info("随机延时 {}s 执行", delay / 1000);
            try {
                Thread.sleep((long)delay);

            } catch (InterruptedException e) {
                log.error("", e);
            }

            log.info("获取 {} 公告, page:{}, pageTotal:{}", DateFormatUtils.format(date, "yyyy-MM-dd"), page, pageTotal);
            eastMoneyPublicNoticeInfo = stockPublicNoticeEastMoneyService.fetchPrevDayNotice(pageSize, page, date);
            pageTotal = eastMoneyPublicNoticeInfo.getPageTotal();
            stockPublicNoticeService.savePublicNotice(eastMoneyPublicNoticeInfo.getPublicNoticeList());

            page++;

        }
        log.info("获取 {} 公告完成, 总计 {} 条公告",  DateFormatUtils.format(date, "yyyy-MM-dd"), eastMoneyPublicNoticeInfo.getRecordTotal());
        return eastMoneyPublicNoticeInfo.getRecordTotal();
    }

    /**
     * 查询系统中订阅的公告，并推送给订阅者
     */
    public void publishStockNotice() {
        publishStockNotice(new Date());
    }


 /**
     * 查询系统中订阅的公告，并推送给订阅者
     */
    public void publishStockNotice(Date date) {
        List<StockPublicNoticeObserver> stockPublicNoticeObservers = queryStockPublicNoticeObserver(date);

        for (StockPublicNoticeObserver stockPublicNoticeObserver : stockPublicNoticeObservers) {
            messageSender.sendStockPublicNotice(stockPublicNoticeObserver);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                log.error("sleep error", e);
            }
        }
    }





    private List<StockPublicNoticeObserver> queryStockPublicNoticeObserver(Date date) {

        List<StockPublicNoticeObserver> stockPublicNoticeObserverList = new ArrayList<>();
        List<TblStockPublicNoticeObserver> tblStockPublicNoticeObservers = stockPublicNoticeService.queryStockPublicNoticeObserver();
        tblStockPublicNoticeObservers.forEach(tblStockPublicNoticeObserver->{
            // 查询公告
            StockPublicNoticeObserver stockPublicNoticeObserver = new StockPublicNoticeObserver(tblStockPublicNoticeObserver);
            List<TblStockPublicNotice> tblStockPublicNotices = stockPublicNoticeService.queryStockPublicNotice(tblStockPublicNoticeObserver.getKeywords(), date);
            stockPublicNoticeObserverList.add(stockPublicNoticeObserver);

            stockPublicNoticeObserver.setDate(date);
            stockPublicNoticeObserver.addStockPublicNoticeList(tblStockPublicNotices);

            // 补全股票基本信息
            stockPublicNoticeObserver.getStockPublicNoticeInfoList().forEach(stockPublicNoticeInfo->{
                TblStockInfo stockInfo = stockScoreConllectBiz.forceGetStock(stockPublicNoticeInfo.getStockCode());

                stockPublicNoticeInfo.setField(stockInfo);
            });
        });


        return stockPublicNoticeObserverList;
    }


}
