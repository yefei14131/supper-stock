package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblStockInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TblStockInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stockCode is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stockCode is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stockCode =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stockCode <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stockCode >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stockCode >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stockCode <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stockCode <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stockCode like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stockCode not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stockCode in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stockCode not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stockCode between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stockCode not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stockName is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stockName is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stockName =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stockName <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stockName >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stockName >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stockName <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stockName <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stockName like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stockName not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stockName in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stockName not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stockName between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stockName not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSylIsNull() {
            addCriterion("syl is null");
            return (Criteria) this;
        }

        public Criteria andSylIsNotNull() {
            addCriterion("syl is not null");
            return (Criteria) this;
        }

        public Criteria andSylEqualTo(Double value) {
            addCriterion("syl =", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotEqualTo(Double value) {
            addCriterion("syl <>", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThan(Double value) {
            addCriterion("syl >", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThanOrEqualTo(Double value) {
            addCriterion("syl >=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThan(Double value) {
            addCriterion("syl <", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThanOrEqualTo(Double value) {
            addCriterion("syl <=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylIn(List<Double> values) {
            addCriterion("syl in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotIn(List<Double> values) {
            addCriterion("syl not in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylBetween(Double value1, Double value2) {
            addCriterion("syl between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotBetween(Double value1, Double value2) {
            addCriterion("syl not between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andTotalValueIsNull() {
            addCriterion("totalValue is null");
            return (Criteria) this;
        }

        public Criteria andTotalValueIsNotNull() {
            addCriterion("totalValue is not null");
            return (Criteria) this;
        }

        public Criteria andTotalValueEqualTo(Integer value) {
            addCriterion("totalValue =", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotEqualTo(Integer value) {
            addCriterion("totalValue <>", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueGreaterThan(Integer value) {
            addCriterion("totalValue >", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalValue >=", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLessThan(Integer value) {
            addCriterion("totalValue <", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLessThanOrEqualTo(Integer value) {
            addCriterion("totalValue <=", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueIn(List<Integer> values) {
            addCriterion("totalValue in", values, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotIn(List<Integer> values) {
            addCriterion("totalValue not in", values, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueBetween(Integer value1, Integer value2) {
            addCriterion("totalValue between", value1, value2, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotBetween(Integer value1, Integer value2) {
            addCriterion("totalValue not between", value1, value2, "totalValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueIsNull() {
            addCriterion("flowValue is null");
            return (Criteria) this;
        }

        public Criteria andFlowValueIsNotNull() {
            addCriterion("flowValue is not null");
            return (Criteria) this;
        }

        public Criteria andFlowValueEqualTo(Integer value) {
            addCriterion("flowValue =", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotEqualTo(Integer value) {
            addCriterion("flowValue <>", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueGreaterThan(Integer value) {
            addCriterion("flowValue >", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("flowValue >=", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueLessThan(Integer value) {
            addCriterion("flowValue <", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueLessThanOrEqualTo(Integer value) {
            addCriterion("flowValue <=", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueIn(List<Integer> values) {
            addCriterion("flowValue in", values, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotIn(List<Integer> values) {
            addCriterion("flowValue not in", values, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueBetween(Integer value1, Integer value2) {
            addCriterion("flowValue between", value1, value2, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotBetween(Integer value1, Integer value2) {
            addCriterion("flowValue not between", value1, value2, "flowValue");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioIsNull() {
            addCriterion("priceProfitAssetRatio is null");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioIsNotNull() {
            addCriterion("priceProfitAssetRatio is not null");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioEqualTo(Double value) {
            addCriterion("priceProfitAssetRatio =", value, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioNotEqualTo(Double value) {
            addCriterion("priceProfitAssetRatio <>", value, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioGreaterThan(Double value) {
            addCriterion("priceProfitAssetRatio >", value, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("priceProfitAssetRatio >=", value, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioLessThan(Double value) {
            addCriterion("priceProfitAssetRatio <", value, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioLessThanOrEqualTo(Double value) {
            addCriterion("priceProfitAssetRatio <=", value, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioIn(List<Double> values) {
            addCriterion("priceProfitAssetRatio in", values, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioNotIn(List<Double> values) {
            addCriterion("priceProfitAssetRatio not in", values, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioBetween(Double value1, Double value2) {
            addCriterion("priceProfitAssetRatio between", value1, value2, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceProfitAssetRatioNotBetween(Double value1, Double value2) {
            addCriterion("priceProfitAssetRatio not between", value1, value2, "priceProfitAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioIsNull() {
            addCriterion("priceNetAssetRatio is null");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioIsNotNull() {
            addCriterion("priceNetAssetRatio is not null");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioEqualTo(Double value) {
            addCriterion("priceNetAssetRatio =", value, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioNotEqualTo(Double value) {
            addCriterion("priceNetAssetRatio <>", value, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioGreaterThan(Double value) {
            addCriterion("priceNetAssetRatio >", value, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("priceNetAssetRatio >=", value, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioLessThan(Double value) {
            addCriterion("priceNetAssetRatio <", value, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioLessThanOrEqualTo(Double value) {
            addCriterion("priceNetAssetRatio <=", value, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioIn(List<Double> values) {
            addCriterion("priceNetAssetRatio in", values, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioNotIn(List<Double> values) {
            addCriterion("priceNetAssetRatio not in", values, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioBetween(Double value1, Double value2) {
            addCriterion("priceNetAssetRatio between", value1, value2, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andPriceNetAssetRatioNotBetween(Double value1, Double value2) {
            addCriterion("priceNetAssetRatio not between", value1, value2, "priceNetAssetRatio");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("totalScore is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("totalScore is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Double value) {
            addCriterion("totalScore =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Double value) {
            addCriterion("totalScore <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Double value) {
            addCriterion("totalScore >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("totalScore >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Double value) {
            addCriterion("totalScore <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Double value) {
            addCriterion("totalScore <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Double> values) {
            addCriterion("totalScore in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Double> values) {
            addCriterion("totalScore not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Double value1, Double value2) {
            addCriterion("totalScore between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Double value1, Double value2) {
            addCriterion("totalScore not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andMarketRankIsNull() {
            addCriterion("marketRank is null");
            return (Criteria) this;
        }

        public Criteria andMarketRankIsNotNull() {
            addCriterion("marketRank is not null");
            return (Criteria) this;
        }

        public Criteria andMarketRankEqualTo(Integer value) {
            addCriterion("marketRank =", value, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankNotEqualTo(Integer value) {
            addCriterion("marketRank <>", value, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankGreaterThan(Integer value) {
            addCriterion("marketRank >", value, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketRank >=", value, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankLessThan(Integer value) {
            addCriterion("marketRank <", value, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankLessThanOrEqualTo(Integer value) {
            addCriterion("marketRank <=", value, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankIn(List<Integer> values) {
            addCriterion("marketRank in", values, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankNotIn(List<Integer> values) {
            addCriterion("marketRank not in", values, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankBetween(Integer value1, Integer value2) {
            addCriterion("marketRank between", value1, value2, "marketRank");
            return (Criteria) this;
        }

        public Criteria andMarketRankNotBetween(Integer value1, Integer value2) {
            addCriterion("marketRank not between", value1, value2, "marketRank");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNull() {
            addCriterion("industryName is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNotNull() {
            addCriterion("industryName is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameEqualTo(String value) {
            addCriterion("industryName =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotEqualTo(String value) {
            addCriterion("industryName <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThan(String value) {
            addCriterion("industryName >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("industryName >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThan(String value) {
            addCriterion("industryName <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThanOrEqualTo(String value) {
            addCriterion("industryName <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLike(String value) {
            addCriterion("industryName like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotLike(String value) {
            addCriterion("industryName not like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIn(List<String> values) {
            addCriterion("industryName in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotIn(List<String> values) {
            addCriterion("industryName not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameBetween(String value1, String value2) {
            addCriterion("industryName between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotBetween(String value1, String value2) {
            addCriterion("industryName not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryRankIsNull() {
            addCriterion("industryRank is null");
            return (Criteria) this;
        }

        public Criteria andIndustryRankIsNotNull() {
            addCriterion("industryRank is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryRankEqualTo(Integer value) {
            addCriterion("industryRank =", value, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankNotEqualTo(Integer value) {
            addCriterion("industryRank <>", value, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankGreaterThan(Integer value) {
            addCriterion("industryRank >", value, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("industryRank >=", value, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankLessThan(Integer value) {
            addCriterion("industryRank <", value, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankLessThanOrEqualTo(Integer value) {
            addCriterion("industryRank <=", value, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankIn(List<Integer> values) {
            addCriterion("industryRank in", values, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankNotIn(List<Integer> values) {
            addCriterion("industryRank not in", values, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankBetween(Integer value1, Integer value2) {
            addCriterion("industryRank between", value1, value2, "industryRank");
            return (Criteria) this;
        }

        public Criteria andIndustryRankNotBetween(Integer value1, Integer value2) {
            addCriterion("industryRank not between", value1, value2, "industryRank");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreIsNull() {
            addCriterion("organizationHoldScore is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreIsNotNull() {
            addCriterion("organizationHoldScore is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreEqualTo(Integer value) {
            addCriterion("organizationHoldScore =", value, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreNotEqualTo(Integer value) {
            addCriterion("organizationHoldScore <>", value, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreGreaterThan(Integer value) {
            addCriterion("organizationHoldScore >", value, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("organizationHoldScore >=", value, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreLessThan(Integer value) {
            addCriterion("organizationHoldScore <", value, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreLessThanOrEqualTo(Integer value) {
            addCriterion("organizationHoldScore <=", value, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreIn(List<Integer> values) {
            addCriterion("organizationHoldScore in", values, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreNotIn(List<Integer> values) {
            addCriterion("organizationHoldScore not in", values, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreBetween(Integer value1, Integer value2) {
            addCriterion("organizationHoldScore between", value1, value2, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationHoldScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("organizationHoldScore not between", value1, value2, "organizationHoldScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreIsNull() {
            addCriterion("businessPreferenceScore is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreIsNotNull() {
            addCriterion("businessPreferenceScore is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreEqualTo(Integer value) {
            addCriterion("businessPreferenceScore =", value, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreNotEqualTo(Integer value) {
            addCriterion("businessPreferenceScore <>", value, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreGreaterThan(Integer value) {
            addCriterion("businessPreferenceScore >", value, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessPreferenceScore >=", value, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreLessThan(Integer value) {
            addCriterion("businessPreferenceScore <", value, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreLessThanOrEqualTo(Integer value) {
            addCriterion("businessPreferenceScore <=", value, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreIn(List<Integer> values) {
            addCriterion("businessPreferenceScore in", values, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreNotIn(List<Integer> values) {
            addCriterion("businessPreferenceScore not in", values, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreBetween(Integer value1, Integer value2) {
            addCriterion("businessPreferenceScore between", value1, value2, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andBusinessPreferenceScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("businessPreferenceScore not between", value1, value2, "businessPreferenceScore");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("isActive =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("isActive <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("isActive >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isActive >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("isActive <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("isActive <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("isActive in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("isActive not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("isActive between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isActive not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}