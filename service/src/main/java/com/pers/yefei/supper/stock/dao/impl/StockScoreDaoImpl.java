package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockScoreMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:31
 */
@Repository
public class StockScoreDaoImpl implements IStockScoreDao {

    @Autowired
    private TblStockScoreMapper tblStockScoreMapper;

    @Override
    public TblStockScore getStockScoreToday(String stockCode){
        TblStockScoreExample example = new TblStockScoreExample();
        example.createCriteria().andStockCodeEqualTo(stockCode);

        List<TblStockScore> tblStockScores = tblStockScoreMapper.selectByExample(example);

        return tblStockScores.size() == 0 ? null : tblStockScores.get(0);
    }

    @Override
    public void insertStockScore(TblStockScore stockScore){
        tblStockScoreMapper.insert(stockScore);
    }

    @Override
    public void updateStockScore(TblStockScore stockScore){
        tblStockScoreMapper.updateByPrimaryKeySelective(stockScore);
    }



}
