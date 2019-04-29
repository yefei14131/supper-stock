package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockScoreChangeDao;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockScoreChangeMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChangeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

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

    @Override
    public void updateStockScoreChange(TblStockScoreChange stockScoreChange){
        tblStockScoreChangeMapper.updateByPrimaryKey(stockScoreChange);
    }

    @Override
    public TblStockScoreChange getStockScoreChangeByDate(String stockCode, Date date){
        TblStockScoreChangeExample example = new TblStockScoreChangeExample();
        example.createCriteria().andStockCodeEqualTo(stockCode).andDateEqualTo(date);

        List<TblStockScoreChange> stockScoreChanges = tblStockScoreChangeMapper.selectByExample(example);
        return stockScoreChanges.size() > 0 ? stockScoreChanges.get(0) : null;
    }
}
