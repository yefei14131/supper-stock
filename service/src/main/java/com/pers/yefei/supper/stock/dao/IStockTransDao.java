package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTransExample;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/10/4 22:03
 */
public interface IStockTransDao {

    void insertStockTrans(TblStockTrans tblStockTrans);

    void updateStockTrans(TblStockTrans tblStockTrans);

    List<TblStockTrans> queryTblStockTransByDate(Date date);

    List<TblStockTrans> queryTblStockTrans(TblStockTransExample example);

    void updateStockTransCurrentPrice();
}