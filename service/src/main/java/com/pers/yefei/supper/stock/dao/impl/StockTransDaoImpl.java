package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockTransDao;
import com.pers.yefei.supper.stock.model.gen.dao.StockMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockTransMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTrans;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockTransExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:31
 */
@Repository
public class StockTransDaoImpl implements IStockTransDao {

    @Autowired
    private TblStockTransMapper tblStockTransMapper;

    @Autowired
    private StockMapper stockMapper;

    @Override
    public void insertStockTrans(TblStockTrans tblStockTrans){
        tblStockTransMapper.insert(tblStockTrans);
    }

    @Override
    public void updateStockTrans(TblStockTrans tblStockTrans){
        tblStockTransMapper.updateByPrimaryKey(tblStockTrans);
    }

    @Override
    public List<TblStockTrans> queryTblStockTransByDate(Date date){
        TblStockTransExample example = new TblStockTransExample();
        example.createCriteria().andDateEqualTo(date);
        example.setOrderByClause("transType");

        return tblStockTransMapper.selectByExample(example);
    }


    @Override
    public List<TblStockTrans> queryTblStockTrans(TblStockTransExample example){
        return tblStockTransMapper.selectByExample(example);
    }

    @Override
    public void updateStockTransCurrentPrice(){
        stockMapper.updateStockTransCurrentPrice();
    }
}
