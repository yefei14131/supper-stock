package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.dao.IStockScoreChangeDao;
import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.dao.IStockTransDao;
import com.pers.yefei.supper.stock.model.gen.pojo.*;
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

    @Autowired
    private IStockScoreChangeDao stockScoreChangeDao;

    @Autowired
    private IStockTransDao stockTransDao;

    @Override
    public List<TblStockInfo> getStockListNeedConllectScore(){
        return stockInfoDao.getStockListNeedConllectScore();
    }

    @Override
    public List<TblStockInfo> getActiveStockInfoList(){
        return stockInfoDao.getActiveStockInfoList();
    }

    @Override
    public TblStockInfo getStockInfo(String stockCode){
        return stockInfoDao.getStockInfo(stockCode);
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

    @Override
    public List<TblStockScore> queryStockScoreByDate(Date date){
        return stockScoreDao.queryStockScoreByDate(date);
    }

    @Override
    public void saveStockScoreChange(TblStockScoreChange stockScoreChange){
        if (stockScoreChange.getId() == null || stockScoreChange.getId() <= 0){
            stockScoreChangeDao.updateStockScoreChange(stockScoreChange);
        }else{
            stockScoreChangeDao.insertStockScoreChange(stockScoreChange);
        }
    }

    @Override
    public TblStockScoreChange getStockScoreChangeByDate(String stockCode, Date date){
        return stockScoreChangeDao.getStockScoreChangeByDate(stockCode, date);
    }

    @Override
    public Date queryPrevDate(){
        return stockScoreDao.queryPrevDate();
    }

    @Override
    public List<TblStockInfo> getNewUnActiveStockList(Date lessDate){
        return stockInfoDao.getNewUnActiveStockList(lessDate);
    }


    @Override
    public void saveStockTrans(TblStockTrans tblStockTrans){
        if (tblStockTrans.getId() == null || tblStockTrans.getId() == 0){
            stockTransDao.insertStockTrans(tblStockTrans);
        }else{
            stockTransDao.updateStockTrans(tblStockTrans);
        }
    }

    @Override
    public List<TblStockTrans> queryTblStockTransByDate(Date date){
        return stockTransDao.queryTblStockTransByDate(date);
    }


    @Override
    public List<TblStockScoreChange> queryScoreChangeByDay(Date date){
        return stockScoreChangeDao.queryScoreChangeByDay(date);
    }
}
