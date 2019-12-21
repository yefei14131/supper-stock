package com.pers.yefei.supper.stock.service;

import com.pers.yefei.supper.stock.model.bean.PushConfig.RealPushConfig;

/**
 * @author yefei
 * @date: 2019/12/21
 */
public interface IPushConfigService {
    RealPushConfig getPushConfig(int id);

    void savePushConfig(RealPushConfig realPushConfig);
}
