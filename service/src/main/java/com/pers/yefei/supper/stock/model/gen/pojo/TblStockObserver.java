package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.Date;

public class TblStockObserver {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String addReason;

    private Date addTime;

    private Integer pushConfigID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getAddReason() {
        return addReason;
    }

    public void setAddReason(String addReason) {
        this.addReason = addReason == null ? null : addReason.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getPushConfigID() {
        return pushConfigID;
    }

    public void setPushConfigID(Integer pushConfigID) {
        this.pushConfigID = pushConfigID;
    }
}