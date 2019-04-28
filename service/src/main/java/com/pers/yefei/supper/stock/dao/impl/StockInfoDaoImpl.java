package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.model.gen.dao.StockMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockInfoMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfo;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockInfoExample;
import com.pers.yefei.supper.stock.utils.DateUtils;
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

    @Autowired
    private StockMapper stockMapper;

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
        return stockMapper.getStockListNeedConllectScore(DateUtils.getZeroDate(new Date()));
    }

    @Override
    public List<TblStockInfo> getActiveStockInfoList(){
        TblStockInfoExample example = new TblStockInfoExample();
        example.createCriteria().andIsActiveEqualTo(true)
        ;
        example.setOrderByClause("rand()");

        return tblStockInfoMapper.selectByExample(example);
    }

    @Override
    public TblStockInfo getStockInfo(String stockCode){
        TblStockInfoExample example = new TblStockInfoExample();
        example.createCriteria().andStockCodeEqualTo(stockCode);

        List<TblStockInfo> tblStockInfos = tblStockInfoMapper.selectByExample(example);

        return tblStockInfos.size() > 0 ? tblStockInfos.get(0) : null;
    }

    @Override
    public List<TblStockInfo> getNewUnActiveStockList(Date lessDate){
        return stockMapper.getNewUnActiveStockList(lessDate);
    }
}
