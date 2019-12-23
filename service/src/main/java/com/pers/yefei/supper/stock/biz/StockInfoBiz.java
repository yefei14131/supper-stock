package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.model.bean.EastMoneyNewStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.third.stock.info.NewStockCollector;
import com.pers.yefei.supper.stock.third.stock.info.StockInfoCollector;
import com.pers.yefei.supper.stock.utils.RandomSleep;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:23
 */
@Component
@Slf4j
public class StockInfoBiz {
    private static final int pageSize = 20;

    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private StockInfoCollector stockInfoCollector;

    @Autowired
    private NewStockCollector newStockCollector;

    private boolean collectorRunning = false;

    /**
     * @desc 批量更新股票基本信息, 全量更新
     *
     */
    public void batchConllectStock(){
        try {

            if (collectorRunning == true){
                log.error("采集任务正在执行，不可重复执行");
                return;
            }

            collectorRunning = true;

            // 获取需要更新的股票列表，目前取全量
            // TODO 调整取的策略
            List<TblStockInfo> stockListNeedConllectScore = stockDataService.getActiveStockInfoList();

            stockListNeedConllectScore.forEach( tblStockInfo -> {
                conllectStockScoreAndSleep(tblStockInfo);
            });


            log.info("采集任务执行完成");

        }catch (Exception e){
            log.error(ExceptionUtils.getStackTrace(e));
        }finally {
            collectorRunning = false;
        }

    }

    private void conllectStockScoreAndSleep(TblStockInfo tblStockInfo) {
        stockInfoCollector.fetchStockInfo(tblStockInfo);
        stockDataService.saveStockInfo(tblStockInfo);
        RandomSleep.sleep(500, 3500);
    }

    /**
     * 采集新的股票
     */
    public void fetchNewStock()  {

        int page = 1;
        int pageTotal = 20;
        int maxRepeat = 20;
        int stockRepeatCount = 0;

        while (page < pageTotal) {

            // 随机延时 1s - 30s 执行
            RandomSleep.sleep(1000, 30 * 1000);

            log.info("获取 新股, page:{}, pageTotal:{}", page, pageTotal);

            EastMoneyNewStockInfo eastMoneyNewStockInfo = newStockCollector.fetchNewStock(pageSize, page);
            pageTotal = eastMoneyNewStockInfo.getPageTotal();

            for (TblStockInfo tblStockInfo : eastMoneyNewStockInfo.getStockInfoList()) {
                TblStockInfo stockInfo = stockDataService.getStockInfo(tblStockInfo.getStockCode());
                if (stockInfo == null) {
                    log.info("采集到新股：{}, {}", tblStockInfo.getStockCode(), tblStockInfo.getStockName());
                    stockDataService.saveStockInfo(tblStockInfo);
                } else {
                    stockRepeatCount++;
                    if (stockRepeatCount >= maxRepeat) {
                        continue;
                    }
                }
            }
            if (stockRepeatCount >= maxRepeat) {
                log.info("采集新股，累计重叠数：{}, 自动退出", maxRepeat);
                break;
            }
            page++;
        }
        log.info("获取 新股完成");
    }

    /**
     * 根据日期获取新股，只取前50条记录，时间太旧的获取不到
     * @param date
     * @return
     */
    public List<TblStockInfo> fetchNewStockByDay(Date date) {
        return newStockCollector.fetchNewStockByDay(date);
    }
}
