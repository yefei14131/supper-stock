package com.pers.yefei.supper.stock.dao.impl;

import com.pers.yefei.supper.stock.dao.IPushConfigDao;
import com.pers.yefei.supper.stock.dao.IStockInfoDao;
import com.pers.yefei.supper.stock.model.gen.dao.StockMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblPushConfigMapper;
import com.pers.yefei.supper.stock.model.gen.dao.TblStockInfoMapper;
import com.pers.yefei.supper.stock.model.gen.pojo.TblPushConfig;
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
public class PushConfigDaoImpl implements IPushConfigDao {

    @Autowired
    private TblPushConfigMapper tblPushConfigMapper;

    @Override
    public int insert(TblPushConfig tblPushConfig) {
        return tblPushConfigMapper.insert(tblPushConfig);
    }

    @Override
    public int update(TblPushConfig tblPushConfig) {
        return tblPushConfigMapper.updateByPrimaryKeySelective(tblPushConfig);
    }

    @Override
    public TblPushConfig getTblPushConfig(int id) {
        return tblPushConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TblPushConfig> queryPushConfig() {
        return tblPushConfigMapper.selectByExample(null);
    }


}
