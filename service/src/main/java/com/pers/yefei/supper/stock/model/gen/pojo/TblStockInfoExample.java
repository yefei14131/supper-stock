package com.pers.yefei.supper.stock.model.gen.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblStockInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

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

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andSylEqualTo(BigDecimal value) {
            addCriterion("syl =", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotEqualTo(BigDecimal value) {
            addCriterion("syl <>", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThan(BigDecimal value) {
            addCriterion("syl >", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("syl >=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThan(BigDecimal value) {
            addCriterion("syl <", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("syl <=", value, "syl");
            return (Criteria) this;
        }

        public Criteria andSylIn(List<BigDecimal> values) {
            addCriterion("syl in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotIn(List<BigDecimal> values) {
            addCriterion("syl not in", values, "syl");
            return (Criteria) this;
        }

        public Criteria andSylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("syl between", value1, value2, "syl");
            return (Criteria) this;
        }

        public Criteria andSylNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andTotalValueEqualTo(String value) {
            addCriterion("totalValue =", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotEqualTo(String value) {
            addCriterion("totalValue <>", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueGreaterThan(String value) {
            addCriterion("totalValue >", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueGreaterThanOrEqualTo(String value) {
            addCriterion("totalValue >=", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLessThan(String value) {
            addCriterion("totalValue <", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLessThanOrEqualTo(String value) {
            addCriterion("totalValue <=", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueLike(String value) {
            addCriterion("totalValue like", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotLike(String value) {
            addCriterion("totalValue not like", value, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueIn(List<String> values) {
            addCriterion("totalValue in", values, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotIn(List<String> values) {
            addCriterion("totalValue not in", values, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueBetween(String value1, String value2) {
            addCriterion("totalValue between", value1, value2, "totalValue");
            return (Criteria) this;
        }

        public Criteria andTotalValueNotBetween(String value1, String value2) {
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

        public Criteria andFlowValueEqualTo(String value) {
            addCriterion("flowValue =", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotEqualTo(String value) {
            addCriterion("flowValue <>", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueGreaterThan(String value) {
            addCriterion("flowValue >", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueGreaterThanOrEqualTo(String value) {
            addCriterion("flowValue >=", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueLessThan(String value) {
            addCriterion("flowValue <", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueLessThanOrEqualTo(String value) {
            addCriterion("flowValue <=", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueLike(String value) {
            addCriterion("flowValue like", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotLike(String value) {
            addCriterion("flowValue not like", value, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueIn(List<String> values) {
            addCriterion("flowValue in", values, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotIn(List<String> values) {
            addCriterion("flowValue not in", values, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueBetween(String value1, String value2) {
            addCriterion("flowValue between", value1, value2, "flowValue");
            return (Criteria) this;
        }

        public Criteria andFlowValueNotBetween(String value1, String value2) {
            addCriterion("flowValue not between", value1, value2, "flowValue");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
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