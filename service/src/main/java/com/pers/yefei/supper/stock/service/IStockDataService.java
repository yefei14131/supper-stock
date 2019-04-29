package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:12
 * @desc: 股票数据存取服务
 */
public interface IStockDataService {

    List<TblStockInfo> getStockListNeedConllectScore();

    List<TblStockInfo> getActiveStockInfoList();

    TblStockInfo getStockInfo(String stockCode);

    TblStockScore getStockScoreToday(String stockCode);

    void saveStockScore(TblStockScore tblStockScore);

    void saveStockInfo(TblStockInfo tblStockInfo);

    List<TblStockScore> queryStockScoreByDate(Date date);

    void saveStockScoreChange(TblStockScoreChange stockScoreChange);

    TblStockScoreChange getStockScoreChangeByDate(String stockCode, Date date);

    Date queryPrevDate();

    List<TblStockInfo> getNewUnActiveStockList(Date lessDate);

    void insertStockTrans(TblStockTrans tblStockTrans);

    List<TblStockTrans> queryTblStockTransByDate(Date date);
}
