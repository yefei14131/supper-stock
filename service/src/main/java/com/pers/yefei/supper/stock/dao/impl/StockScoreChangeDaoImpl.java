package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockScoreChangeDao;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockScoreChangeMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: yefei
 * @date: 2019/4/27 14:46
 */
@Repository
public class StockScoreChangeDaoImpl implements IStockScoreChangeDao {


    @Autowired
    private TblStockScoreChangeMapper tblStockScoreChangeMapper;


    @Override
    public void insertStockScoreChange(TblStockScoreChange stockScoreChange){
        tblStockScoreChangeMapper.insert(stockScoreChange);
    }
}
