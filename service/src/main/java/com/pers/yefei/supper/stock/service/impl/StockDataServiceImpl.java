package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.service.IStockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:14
 */
@Service
public class StockDataServiceImpl implements IStockDataService {

    @Autowired
    private IStockInfoDao stockInfoDao;

    @Autowired
    private IStockScoreDao stockScoreDao;


    @Override
    public List<TblStockInfo> getStockListNeedConllectScore(){
        return stockInfoDao.getStockListNeedConllectScore();
    }

    @Override
    public TblStockScore getStockScoreToday(String stockCode){
        return stockScoreDao.getStockScoreToday(stockCode);
    }

    @Override
    public void saveStockScore(TblStockScore tblStockScore){
        tblStockScore.setUpdateTime(new Date());

        if(tblStockScore.getId() != null && tblStockScore.getId() > 0){
            stockScoreDao.updateStockScore(tblStockScore);
        }else{
            stockScoreDao.insertStockScore(tblStockScore);
        }
    }

    @Override
    public void saveStockInfo(TblStockInfo tblStockInfo){
        tblStockInfo.setUpdateTime(new Date());
        if (tblStockInfo.getId() != null && tblStockInfo.getId() > 0){
            stockInfoDao.updateStockInfo(tblStockInfo);
        }else{
            stockInfoDao.insertStockInfo(tblStockInfo);
        }
    }

}
