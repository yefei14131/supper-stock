package com.pers.yefei.supper.stock.model.gen.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TblStockInfo {
    private Integer id;

    private String stockCode;

    private String stockName;

    private BigDecimal price;

    private BigDecimal syl;

    private String totalValue;

    private String flowValue;

    private BigDecimal score;

    private Integer marketRank;

    private String industryName;

    private Integer industryRank;

    private Integer organizationHoldScore;

    private Integer businessPreferenceScore;

    private Date createTime;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getSyl() {
        return syl;
    }

    public void setSyl(BigDecimal syl) {
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

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}