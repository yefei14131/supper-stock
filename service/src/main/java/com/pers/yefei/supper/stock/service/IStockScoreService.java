package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.bean.MessageObserver.StockScoreInfoObserver;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/26 01:26
 * @desc: 股票得分采集服务
 */
public interface IStockScoreService {

    List<StockScoreInfoObserver> queryStockObserversFromDB(Date date);

    List<StockScoreInfoObserver> queryStockObservers(String industryKeywords, Date date);
}
