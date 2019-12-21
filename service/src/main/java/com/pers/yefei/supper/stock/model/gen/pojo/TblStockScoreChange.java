package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.Date;

public class TblStockScoreChange {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String fieldName;

    private Integer todayValue;

    private Integer preValue;

    private Integer changeValue;

    private Double totalScore;

    private Date date;

    private Date updateTime;

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

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}