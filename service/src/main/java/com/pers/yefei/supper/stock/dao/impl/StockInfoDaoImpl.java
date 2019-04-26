package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.config.db.DatabaseContextHolder;
import com.pers.yefei.supper.stock.config.db.DatabaseType;
import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockInfoMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2018/10/4 22:03
 */
@Repository
public class StockInfoDaoImpl implements IStockInfoDao {

    @Autowired
    private TblStockInfoMapper tblStockInfoMapper;


    @Override
    public int insertStockInfo(TblStockInfo tblStockInfo){

        return tblStockInfoMapper.insert(tblStockInfo);
    }

    @Override
    public void updateStockInfo(TblStockInfo tblStockInfo) {
        tblStockInfoMapper.updateByPrimaryKeySelective(tblStockInfo);
    }

    @Override
    public List<TblStockInfo> getStockListNeedConllectScore(){
        TblStockInfoExample example = new TblStockInfoExample();
        example.setOrderByClause("rand()");

        return tblStockInfoMapper.selectByExample(example);
    }

}
