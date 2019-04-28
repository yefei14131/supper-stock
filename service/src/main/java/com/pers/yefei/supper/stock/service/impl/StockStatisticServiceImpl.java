package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.dao.IStockScoreChangeDao;
import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.dao.IStockStatisticDao;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.service.IStockDataService;
import com.pers.yefei.supper.stock.service.IStockStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:14
 */
@Service
public class StockStatisticServiceImpl implements IStockStatisticService {


    @Autowired
    private IStockStatisticDao stockStatisticDao;

    @Autowired
    private IStockScoreChangeDao stockScoreChangeDao;

    @Override
    public List<TblStockScoreChange> queryStockScoreChangeByDate(Date date){

        return stockStatisticDao.queryStockScoreChangeByDate(date);
    }
}
