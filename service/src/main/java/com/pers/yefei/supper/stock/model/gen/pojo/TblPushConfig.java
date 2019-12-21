package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.Date;

public class TblPushConfig {
    private Integer id;

    private String title;

    private String messagePushType;

    private String configData;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMessagePushType() {
        return messagePushType;
    }

    public void setMessagePushType(String messagePushType) {
        this.messagePushType = messagePushType == null ? null : messagePushType.trim();
    }

    public String getConfigData() {
        return configData;
    }

    public void setConfigData(String configData) {
        this.configData = configData == null ? null : configData.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}