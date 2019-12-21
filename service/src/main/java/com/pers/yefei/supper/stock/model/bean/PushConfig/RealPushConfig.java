package com.pers.yefei.supper.stock.model.bean.PushConfig;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pers.yefei.supper.stock.enums.MessagePushTypeEnum;
import com.pers.yefei.supper.stock.model.gen.pojo.TblPushConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Date;

/**
 * @author yefei
 * @date: 2019/12/21
 */
@Data
@Slf4j
public class RealPushConfig {

    private int id;
    private String title;
    private MessagePushTypeEnum messagePushType;
    private Date updateTime;
    private AbstractPushConfigData pushConfigData;


    public TblPushConfig toTblPushConfig(){
        TblPushConfig tblPushConfig = new TblPushConfig();
        tblPushConfig.setId(this.id);
        tblPushConfig.setTitle(this.title);
        tblPushConfig.setMessagePushType(this.messagePushType.toString());
        tblPushConfig.setUpdateTime(this.updateTime);
        try {
            tblPushConfig.setConfigData(new ObjectMapper().writeValueAsString(this.pushConfigData));
        } catch (JsonProcessingException e) {
            log.error("序列化DingTalk配置数据异常", e);
        }
        return tblPushConfig;
    }

    public static RealPushConfig fromTblPushConfig(TblPushConfig tblPushConfig) {

        RealPushConfig realPushConfig = new RealPushConfig();
        realPushConfig.setId(tblPushConfig.getId());
        realPushConfig.setTitle(tblPushConfig.getTitle());
        realPushConfig.setMessagePushType( MessagePushTypeEnum.valueOf(tblPushConfig.getMessagePushType()));
        realPushConfig.setUpdateTime(tblPushConfig.getUpdateTime());

        try {
            if (MessagePushTypeEnum.DingTalk.equals(realPushConfig.getMessagePushType())) {
                realPushConfig.setPushConfigData(new ObjectMapper().readValue(tblPushConfig.getConfigData(), DingTalkPushConfigData.class));
            }

        } catch (IOException e) {
            log.error("解析DingTalk配置数据异常", e);
        }

        return realPushConfig;
    }

}
