package com.pers.yefei.supper.stock.dao;

import com.pers.yefei.supper.stock.model.gen.pojo.TblPushConfig;

import java.util.List;

/**
 * @author yefei
 * @date: 2019/12/21
 */
public interface IPushConfigDao {
    int insert(TblPushConfig tblPushConfig);

    int update(TblPushConfig tblPushConfig);

    TblPushConfig getTblPushConfig(int id);

    List<TblPushConfig> queryPushConfig();
}
