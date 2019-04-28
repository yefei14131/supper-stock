package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.Date;

public class TblStockScoreChange extends TblStockScoreChangeKey {
    private String stockCode;

    private String fieldName;

    private Integer todayValue;

    private Integer preValue;

    private Integer changeValue;

    private Date date;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public Integer getTodayValue() {
        return todayValue;
    }

    public void setTodayValue(Integer todayValue) {
        this.todayValue = todayValue;
    }

    public Integer getPreValue() {
        return preValue;
    }

    public void setPreValue(Integer preValue) {
        this.preValue = preValue;
    }

    public Integer getChangeValue() {
        return changeValue;
    }

    public void setChangeValue(Integer changeValue) {
        this.changeValue = changeValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}