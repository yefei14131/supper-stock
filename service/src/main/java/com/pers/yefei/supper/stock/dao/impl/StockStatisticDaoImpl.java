package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IStockScoreDao;
import com.pers.yefei.supper.stock.dao.IStockStatisticDao;
import com.pers.yefei.supper.stock.model.gen.dao.StockMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockScoreChangeMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockScoreMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScore;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChange;
import com.pers.yefei.supper.stock.model.gen.pojo.TblStockScoreChangeExample;
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
public class StockStatisticDaoImpl implements IStockStatisticDao {

    @Autowired
    private TblStockScoreMapper tblStockScoreMapper;

    @Autowired
    private TblStockScoreChangeMapper tblStockScoreChangeMapper;

    @Autowired
    private StockMapper stockMapper;

    @Override
    public List<TblStockScoreChange> queryStockScoreChangeByDate(Date date){
        TblStockScoreChangeExample example = new TblStockScoreChangeExample();
        example.createCriteria().andDateEqualTo(date);
        example.setOrderByClause("abs(changeValue) desc, changeValue desc");

        return tblStockScoreChangeMapper.selectByExample(example);
    }



}
