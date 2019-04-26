package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;

import java.util.List;

/**
 * @author: yefei
 * @date: 2018/10/4 22:03
 */
public interface IStockInfoDao {

    int insertStockInfo(TblStockInfo tblStockInfo);

    void updateStockInfo(TblStockInfo tblStockInfo);

    List<TblStockInfo> getStockListNeedConllectScore();
}