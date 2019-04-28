package com.pers.yefei.supper.stock.model.gen.pojo;

public class TblStockScoreChangeKey {
    private Integer id;

    private String stockName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }
}