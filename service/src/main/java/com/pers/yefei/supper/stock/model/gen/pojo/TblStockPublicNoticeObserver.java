package com.pers.yefei.supper.stock.model.gen.pojo;

public class TblStockPublicNoticeObserver {
    private Integer id;

    private String keywords;

    private String messagePushType;

    private String thirdToken;

    private String memo;

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

    public String getMessagePushType() {
        return messagePushType;
    }

    public void setMessagePushType(String messagePushType) {
        this.messagePushType = messagePushType == null ? null : messagePushType.trim();
    }

    public String getThirdToken() {
        return thirdToken;
    }

    public void setThirdToken(String thirdToken) {
        this.thirdToken = thirdToken == null ? null : thirdToken.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}