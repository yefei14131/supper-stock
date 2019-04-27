package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.Date;

public class TblStockInfo {
    private Integer id;

    private String stockCode;

    private String stockName;

    private Double price;

    private Double syl;

    private String totalValue;

    private String flowValue;

    private Double totalScore;

    private Integer marketRank;

    private String industryName;

    private Integer industryRank;

    private Integer organizationHoldScore;

    private Integer businessPreferenceScore;

    private Boolean isActive;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSyl() {
        return syl;
    }

    public void setSyl(Double syl) {
        this.syl = syl;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue == null ? null : totalValue.trim();
    }

    public String getFlowValue() {
        return flowValue;
    }

    public void setFlowValue(String flowValue) {
        this.flowValue = flowValue == null ? null : flowValue.trim();
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getMarketRank() {
        return marketRank;
    }

    public void setMarketRank(Integer marketRank) {
        this.marketRank = marketRank;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public Integer getIndustryRank() {
        return industryRank;
    }

    public void setIndustryRank(Integer industryRank) {
        this.industryRank = industryRank;
    }

    public Integer getOrganizationHoldScore() {
        return organizationHoldScore;
    }

    public void setOrganizationHoldScore(Integer organizationHoldScore) {
        this.organizationHoldScore = organizationHoldScore;
    }

    public Integer getBusinessPreferenceScore() {
        return businessPreferenceScore;
    }

    public void setBusinessPreferenceScore(Integer businessPreferenceScore) {
        this.businessPreferenceScore = businessPreferenceScore;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}