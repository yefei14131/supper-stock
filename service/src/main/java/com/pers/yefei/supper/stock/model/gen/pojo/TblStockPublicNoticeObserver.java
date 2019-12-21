package com.pers.yefei.supper.stock.model.gen.pojo;

public class TblStockPublicNoticeObserver {
    private Integer id;

    private String keywords;

    private String memo;

    private Integer pushConfigID;

    private Boolean isActive;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getPushConfigID() {
        return pushConfigID;
    }

    public void setPushConfigID(Integer pushConfigID) {
        this.pushConfigID = pushConfigID;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}