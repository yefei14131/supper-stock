package com.pers.yefei.supper.stock.model.gen.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TblStockTrans {
    private Integer id;

    private String stockCode;

    private String stockName;

    private BigDecimal transPrice;

    private BigDecimal currentPrice;

    private BigDecimal shCompositeStockPrice;

    private Integer transType;

    private Date date;

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

    public BigDecimal getTransPrice() {
        return transPrice;
    }

    public void setTransPrice(BigDecimal transPrice) {
        this.transPrice = transPrice;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getShCompositeStockPrice() {
        return shCompositeStockPrice;
    }

    public void setShCompositeStockPrice(BigDecimal shCompositeStockPrice) {
        this.shCompositeStockPrice = shCompositeStockPrice;
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}