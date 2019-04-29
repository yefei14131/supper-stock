package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;

import java.util.Date;

/**
 * @author: yefei
 * @date: 2019/4/27 01:31
 */
public interface IStockScoreChangeDao {

    void insertStockScoreChange(TblStockScoreChange stockScoreChange);

    void updateStockScoreChange(TblStockScoreChange stockScoreChange);

    TblStockScoreChange getStockScoreChangeByDate(String stockCode, Date date);
}
