package com.pers.yefei.supper.stock.service.impl;

import com.pers.yefei.supper.stock.dao.IPushConfigDao;
import com.pers.yefei.supper.stock.model.bean.PushConfig.RealPushConfig;
import com.pers.yefei.supper.stock.model.gen.pojo.TblPushConfig;
import com.pers.yefei.supper.stock.service.IPushConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yefei
 * @date: 2019/12/21
 */
@Service
public class PushConfigServiceImpl implements IPushConfigService {

    @Autowired
    private IPushConfigDao pushConfigDao;

    @Override
    public RealPushConfig getPushConfig(int id) {
        TblPushConfig tblPushConfig = pushConfigDao.getTblPushConfig(id);
        return RealPushConfig.fromTblPushConfig(tblPushConfig);
    }

    @Override
    public void savePushConfig(RealPushConfig realPushConfig) {
        TblPushConfig tblPushConfig = realPushConfig.toTblPushConfig();
        if (tblPushConfig.getId() > 0) {
            pushConfigDao.update(tblPushConfig);
        } else {
            pushConfigDao.insert(tblPushConfig);
        }
    }
}
