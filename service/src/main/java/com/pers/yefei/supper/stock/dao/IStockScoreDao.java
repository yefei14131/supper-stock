package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;

/**
 * @author: yefei
 * @date: 2019/4/27 01:31
 */
public interface IStockScoreDao {
    TblStockScore getStockScoreToday(String stockCode);

    void insertStockScore(TblStockScore stockScore);

    void updateStockScore(TblStockScore stockScore);
}
