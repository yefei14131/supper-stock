package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:31
 */
public interface IStockScoreDao {


    TblStockScore getLastDayStockScore(String stockCode);

    TblStockScore getStockScore(String stockCode, Date date);

    TblStockScore getStockScoreToday(String stockCode);

    void insertStockScore(TblStockScore stockScore);

    void updateStockScore(TblStockScore stockScore);

    List<TblStockScore> queryStockScoreByDate(Date date);

    List<TblStockScore> queryStockScore(String industryKeywords, Date date);

    List<TblStockScore> queryStockScoreOrderByTotalValue(String industryKeywords, Date date);

    List<TblStockScore> queryStockScoreOrderByTotalScore(String industryKeywords, Date date);

    Date queryPrevDate(Date date);

    long countStockScoreByDate(Date date);


}
