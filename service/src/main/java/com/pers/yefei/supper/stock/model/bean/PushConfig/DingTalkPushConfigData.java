package com.pers.yefei.supper.stock.model.bean.PushConfig;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

/**
 * @author yefei
 * @date: 2019/12/21
 */
@Data
public class DingTalkPushConfigData extends AbstractPushConfigData {

    private String token;
    private String secret;

}
