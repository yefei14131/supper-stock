package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;

import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:12
 * @desc: 股票数据存取服务
 */
public interface IStockDataService {

    List<TblStockInfo> getStockListNeedConllectScore();

    TblStockScore getStockScoreToday(String stockCode);

    void saveStockScore(TblStockScore tblStockScore);



    void saveStockInfo(TblStockInfo tblStockInfo);

}
