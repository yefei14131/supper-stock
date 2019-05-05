package com.pers.yefei.supper.stock.biz;

import com.pers.yefei.supper.stock.dao.IStockTransDao;
import com.pers.yefei.supper.stock.enums.StockTransType;
import com.pers.yefei.supper.stock.model.bean.SinaStock;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTransExample;
import com.pers.yefei.supper.stock.service.IStockBaseInfoService;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockScoreService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/30 17:08
 * @desc: 股票策略业务服务，包括模拟交易、评估交易策略
 */
@Component
@Slf4j
public class StockTacticsBiz {

    @Autowired
    private IStockTransDao stockTransDao;

    @Autowired
    private IStockDataService stockDataService;

    @Autowired
    private IStockScoreService stockScoreService;

    @Autowired
    private IStockBaseInfoService stockBaseInfoService;


    public void mockTrans(){
        log.info("开始执行模拟交易");

        List<TblStockScoreChange> tblStockScoreChanges = stockDataService.queryScoreChangeByDay(DateUtils.getZeroDate(new Date()));
        log.info("当日变化股票数量为：{}", tblStockScoreChanges.size());

        List<String> stockCodeList = new ArrayList<>();
        List<TblStockTrans> stockTransList = new ArrayList<>();

        tblStockScoreChanges.stream().filter(stockScoreChange-> stockScoreChange.getChangeValue() == 100 || stockScoreChange.getChangeValue() <= -60 ).forEach(stockScoreChange->{
            stockCodeList.add(stockScoreChange.getStockCode());

            TblStockTrans tblStockTrans = new TblStockTrans();
            tblStockTrans.setStockCode(stockScoreChange.getStockCode());
            tblStockTrans.setStockName(stockScoreChange.getStockName());
            tblStockTrans.setTransType(stockScoreChange.getChangeValue() > 0 ? StockTransType.BUY.getType() : StockTransType.SELL.getType());

            stockTransList.add(tblStockTrans);

        });

        log.info("需要执行模拟交易的股票数量为：{}", stockTransList.size());

        HashMap<String, SinaStock> sinaStockHashMap = stockBaseInfoService.batchFetchStockInfo(stockCodeList);
        String shCompositeStockPrice = stockBaseInfoService.fetchSHCompositeStockPrice();
        stockTransList.forEach(tblStockTrans->{
            SinaStock sinaStock = sinaStockHashMap.get(tblStockTrans.getStockCode());
            tblStockTrans.setTransPrice(new BigDecimal(sinaStock == null ? "0" : sinaStock.getCurrentPrice()));
            tblStockTrans.setShCompositeStockPrice(new BigDecimal(shCompositeStockPrice == null ? "0" : shCompositeStockPrice));
            tblStockTrans.setDate(DateUtils.getZeroDate(new Date()));
            stockDataService.saveStockTrans(tblStockTrans);
        });

        log.info("模拟交易执行结束");
    }

    public void repareTransPrice(){
        //queryScoreChange
        TblStockTransExample example = new TblStockTransExample();
        example.createCriteria().andDateEqualTo(DateUtils.getZeroDate(DateUtils.getDateAfterDays(0)))
                .andTransPriceEqualTo(new BigDecimal(0));
        ;
        List<TblStockTrans> stockTransList = stockTransDao.queryTblStockTrans(example);

        log.info("repare trans : {}", stockTransList.size());
        List<String> stockCodeList = new ArrayList<>();

        stockTransList.forEach(stockTrans->{
            stockCodeList.add(stockTrans.getStockCode());
        });

        HashMap<String, SinaStock> sinaStockHashMap = stockBaseInfoService.batchFetchStockInfo(stockCodeList);
        stockTransList.forEach(tblStockTrans->{
            SinaStock sinaStock = sinaStockHashMap.get(tblStockTrans.getStockCode());
            tblStockTrans.setTransPrice(new BigDecimal(sinaStock == null ? "0" : sinaStock.getCurrentPrice()));

            stockDataService.saveStockTrans(tblStockTrans);
        });
    }


    public void collectStockPrice(){
        List<TblStockInfo> activeStockInfoList = stockDataService.getActiveStockInfoList();
        List<String> stockCodeList = new ArrayList<>();
        activeStockInfoList.forEach(stockInfo->{
            stockCodeList.add(stockInfo.getStockCode());
        });
        log.info("需要采集价格的股票数：{}", stockCodeList.size());
        HashMap<String, SinaStock> sinaStockHashMap = stockBaseInfoService.batchFetchStockInfo(stockCodeList);
        log.info("已采集价格的股票数：{}", sinaStockHashMap.size());
        activeStockInfoList.forEach(stockInfo->{
            if (sinaStockHashMap.containsKey(stockInfo.getStockCode())){
                SinaStock sinaStock = sinaStockHashMap.get(stockInfo.getStockCode());
                stockInfo.setPrice(Double.valueOf(sinaStock.getCurrentPrice()));
                stockDataService.saveStockInfo(stockInfo);
            }
        });

        stockDataService.updateStockTransCurrentPrice();
    }
}
