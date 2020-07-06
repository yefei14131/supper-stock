package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.dao.*;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeInfo;
import com.pers.yefei.supper.stock.model.bean.StockScoreChangeSummary;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import com.pers.yefei.supper.stock.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:14
 */
@Slf4j
@Service
public class StockStatisticServiceImpl implements IStockStatisticService {


    @Autowired
    private IStockStatisticDao stockStatisticDao;

    @Autowired
    private IStockScoreChangeDao stockScoreChangeDao;

    @Autowired
    private IStockScoreDao stockScoreDao;

    @Autowired
    private IStockInfoDao stockInfoDao;

    @Autowired
    private IStockTransDao stockTransDao;

    @Override
    public List<TblStockScoreChange> queryStockScoreChangeByDate(Date date){

        return stockStatisticDao.queryStockScoreChangeByDate(DateUtils.getZeroDate(date));
    }

    @Override
    public StockScoreChangeSummary queryStockScoreChangeInfoByDate(Date date){
        log.info("开始查询{}的评分变化", date);
        date = DateUtils.getZeroDate(date);
        StockScoreChangeSummary stockScoreChangeSummary = new StockScoreChangeSummary();
        stockScoreChangeSummary.setDate(date);

        List<TblStockScoreChange> tblStockScoreChanges = stockStatisticDao.queryStockScoreChangeByDate(date);

        tblStockScoreChanges.sort(new Comparator<TblStockScoreChange>() {
            @Override
            public int compare(TblStockScoreChange o1, TblStockScoreChange o2) {
                return o1.getChangeValue() - o2.getChangeValue();
            }
        });

        tblStockScoreChanges.forEach(tblStockScoreChange->{

            StockScoreChangeInfo stockScoreChangeInfo = new StockScoreChangeInfo();
            stockScoreChangeInfo.from(tblStockScoreChange);
            TblStockInfo stockInfo = stockInfoDao.getStockInfo(tblStockScoreChange.getStockCode());
            stockScoreChangeInfo.from(stockInfo);

            if( tblStockScoreChange.getChangeValue() > 0) {

                stockScoreChangeSummary.getIncreaseList().add(0, stockScoreChangeInfo);
            } else {
                stockScoreChangeSummary.getReduceList().add(stockScoreChangeInfo);
            }
        });
        log.info("评分新增数量：{}, 减少数量：{}", stockScoreChangeSummary.getIncreaseList().size(), stockScoreChangeSummary.getReduceList().size());

        return stockScoreChangeSummary;
    }

    @Override
    public HashMap collectProgress(){
        long activeStockTotal = stockInfoDao.countActiveStock();
        long stockScoreTotalToday = stockScoreDao.countStockScoreByDate(new Date());

        HashMap data = new HashMap<>();
        data.put("activeStockTotal", activeStockTotal);
        data.put("stockScoreTotalToday", stockScoreTotalToday);
        data.put("finishRate", stockScoreTotalToday * 100 / activeStockTotal + "%");

        return data;
    }

    @Override
    public List<TblStockTrans> queryStockTransByDay(Date date){
        return stockTransDao.queryTblStockTransByDate(date);
    }

    @Override
    public boolean isHolidays(Date date){
        return stockStatisticDao.isHolidays(date);
    }
}
