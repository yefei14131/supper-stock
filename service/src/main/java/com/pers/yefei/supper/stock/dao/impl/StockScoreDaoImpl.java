package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.model.gen.dao.StockMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockScoreMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreExample;
import com.pers.yefei.supper.stock.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author: yefei
 * @date: 2019/4/27 01:31
 */
@Repository
public class StockScoreDaoImpl implements IStockScoreDao {

    @Autowired
    private TblStockScoreMapper tblStockScoreMapper;

    @Autowired
    private StockMapper stockMapper;

    @Override
    public TblStockScore getStockScoreToday(String stockCode){
        TblStockScoreExample example = new TblStockScoreExample();
        example.createCriteria().andStockCodeEqualTo(stockCode).andDateEqualTo(new Date());

        List<TblStockScore> tblStockScores = tblStockScoreMapper.selectByExample(example);

        return tblStockScores.size() == 0 ? null : tblStockScores.get(0);
    }

    @Override
    public void insertStockScore(TblStockScore stockScore){
        tblStockScoreMapper.insertSelective(stockScore);
    }

    @Override
    public void updateStockScore(TblStockScore stockScore){
        tblStockScoreMapper.updateByPrimaryKeySelective(stockScore);
    }

    @Override
    public List<TblStockScore> queryStockScoreByDate(Date date){
        TblStockScoreExample example = new TblStockScoreExample();
        example.createCriteria().andDateEqualTo(date);
        return tblStockScoreMapper.selectByExample(example);
    }

    @Override
    public Date queryPrevDate(Date date){
        TblStockScore tblStockScore = stockMapper.selectPrevDate(DateUtils.getZeroDate(date));

        return tblStockScore == null ? null : tblStockScore.getDate();
    }


    @Override
    public long countStockScoreByDate(Date date){
        TblStockScoreExample example = new TblStockScoreExample();
        example.createCriteria().andDateEqualTo(date);
        return tblStockScoreMapper.countByExample(example);
    }


}
