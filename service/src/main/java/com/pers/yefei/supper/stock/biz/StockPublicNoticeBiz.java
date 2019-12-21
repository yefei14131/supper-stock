package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.model.bean.EastMoneyPublicNoticeInfo;
import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockPublicNoticeObserver;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNotice;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockPublicNoticeObserver;
import com.pers.yefei.supper.stock.service.IPushConfigService;
import com.pers.yefei.supper.stock.service.IStockPublicNoticeService;
import com.pers.yefei.supper.stock.third.message.MessageSender;
import com.pers.yefei.supper.stock.third.public_notice.PublicNoticeCollector;
import com.pers.yefei.supper.stock.utils.DateUtils;
import com.pers.yefei.supper.stock.utils.StockBaseInfoUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author yefei
 * @date: 2019/12/15
 */
@Component
@Slf4j
public class StockPublicNoticeBiz {

    private static final int pageSize = 50;

    @Autowired
    private PublicNoticeCollector publicNoticeCollector;

    @Autowired
    private IStockPublicNoticeService stockPublicNoticeService;

    @Autowired
    private MessageSender messageSender;

    @Autowired
    private StockScoreBiz stockScoreConllectBiz;

    @Autowired
    private IPushConfigService pushConfigService;


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
            eastMoneyPublicNoticeInfo = publicNoticeCollector.fetchNotice(pageSize, page, date);
            pageTotal = eastMoneyPublicNoticeInfo.getPageTotal();
            stockPublicNoticeService.savePublicNotice(eastMoneyPublicNoticeInfo.getPublicNoticeList());

            page++;

        }
        log.info("获取 {} 公告完成, 总计 {} 条公告",  DateFormatUtils.format(date, "yyyy-MM-dd"), eastMoneyPublicNoticeInfo.getRecordTotal());
        return eastMoneyPublicNoticeInfo.getRecordTotal();
    }

    /**
     * 查询指定时间之后系统中订阅的公告，并推送给订阅者
     */
    public void publishStockNoticeByLessDate(Date lessTime) {
        List<StockPublicNoticeObserver> stockPublicNoticeObservers = queryStockPublicNoticeObserver( (keywords, tblStockPublicNotices) -> {
            stockPublicNoticeService.queryStockPublicNoticeByLessTime(keywords, lessTime);
        });
        pushToObservers(stockPublicNoticeObservers);
    }

    /**
     * 指定日期查询系统中订阅的公告，并推送给订阅者
     */
    public void publishStockNotice(Date date) {
        List<StockPublicNoticeObserver> stockPublicNoticeObservers = queryStockPublicNoticeObserver( (keywords, tblStockPublicNotices) -> {
            tblStockPublicNotices.addAll(stockPublicNoticeService.queryStockPublicNoticeByDate(keywords, DateUtils.getZeroDate(date)));
        });
        pushToObservers(stockPublicNoticeObservers);
    }

    /**
     * 推送给订阅者
     * @param stockPublicNoticeObservers
     */
    private void pushToObservers(List<StockPublicNoticeObserver> stockPublicNoticeObservers) {
        for (StockPublicNoticeObserver stockPublicNoticeObserver : stockPublicNoticeObservers) {
            messageSender.sendStockPublicNotice(stockPublicNoticeObserver);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                log.error("sleep error", e);
            }
        }
    }


    /**
     * 查询公告订阅者，及相关公告
     * @param queryNoticeAction 根据关键字查询公告的方法，由调用方实现
     * @return
     */
    private List<StockPublicNoticeObserver> queryStockPublicNoticeObserver(BiConsumer<String, List<TblStockPublicNotice>> queryNoticeAction) {
        if (queryNoticeAction == null){

        }
        List<StockPublicNoticeObserver> stockPublicNoticeObserverList = new ArrayList<>();
        // 查询公告订阅者
        List<TblStockPublicNoticeObserver> tblStockPublicNoticeObservers = stockPublicNoticeService.queryStockPublicNoticeObserver();

        tblStockPublicNoticeObservers.forEach(tblStockPublicNoticeObserver->{

            //实体对象转换
            StockPublicNoticeObserver stockPublicNoticeObserver = new StockPublicNoticeObserver(tblStockPublicNoticeObserver);
            stockPublicNoticeObserver.setDate(new Date());

            // 设置推送配置
            stockPublicNoticeObserver.setPushConfig(pushConfigService.getPushConfig(tblStockPublicNoticeObserver.getPushConfigID()));

            stockPublicNoticeObserverList.add(stockPublicNoticeObserver);


            // 查询公告
            List<TblStockPublicNotice> tblStockPublicNotices = new ArrayList<>();
            queryNoticeAction.accept(tblStockPublicNoticeObserver.getKeywords(), tblStockPublicNotices);


            // 添加公告并转换成需要推送的公告对象
            stockPublicNoticeObserver.addStockPublicNoticeList(tblStockPublicNotices);

            // 补全股票基本信息
            stockPublicNoticeObserver.getStockPublicNoticeInfoList().forEach(stockPublicNoticeInfo->{
                TblStockInfo stockInfo = stockScoreConllectBiz.forceGetStock(stockPublicNoticeInfo.getStockCode());

                stockPublicNoticeInfo.from(stockInfo);
            });

            // 过滤
            StockBaseInfoUtils.filterTotalValeTop10AndTotalScoreTop10(stockPublicNoticeObserver.getStockPublicNoticeInfoList());

        });


        return stockPublicNoticeObserverList;
    }



}
