package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblStockScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblStockScoreExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCompanyHonorScoreIsNull() {
            addCriterion("companyHonorScore is null");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreIsNotNull() {
            addCriterion("companyHonorScore is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreEqualTo(Integer value) {
            addCriterion("companyHonorScore =", value, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreNotEqualTo(Integer value) {
            addCriterion("companyHonorScore <>", value, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreGreaterThan(Integer value) {
            addCriterion("companyHonorScore >", value, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyHonorScore >=", value, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreLessThan(Integer value) {
            addCriterion("companyHonorScore <", value, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreLessThanOrEqualTo(Integer value) {
            addCriterion("companyHonorScore <=", value, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreIn(List<Integer> values) {
            addCriterion("companyHonorScore in", values, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreNotIn(List<Integer> values) {
            addCriterion("companyHonorScore not in", values, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreBetween(Integer value1, Integer value2) {
            addCriterion("companyHonorScore between", value1, value2, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andCompanyHonorScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("companyHonorScore not between", value1, value2, "companyHonorScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreIsNull() {
            addCriterion("businessStatusScore is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreIsNotNull() {
            addCriterion("businessStatusScore is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreEqualTo(Integer value) {
            addCriterion("businessStatusScore =", value, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreNotEqualTo(Integer value) {
            addCriterion("businessStatusScore <>", value, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreGreaterThan(Integer value) {
            addCriterion("businessStatusScore >", value, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("businessStatusScore >=", value, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreLessThan(Integer value) {
            addCriterion("businessStatusScore <", value, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreLessThanOrEqualTo(Integer value) {
            addCriterion("businessStatusScore <=", value, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreIn(List<Integer> values) {
            addCriterion("businessStatusScore in", values, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreNotIn(List<Integer> values) {
            addCriterion("businessStatusScore not in", values, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreBetween(Integer value1, Integer value2) {
            addCriterion("businessStatusScore between", value1, value2, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("businessStatusScore not between", value1, value2, "businessStatusScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreIsNull() {
            addCriterion("achievementsAppraisalScore is null");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreIsNotNull() {
            addCriterion("achievementsAppraisalScore is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreEqualTo(Integer value) {
            addCriterion("achievementsAppraisalScore =", value, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreNotEqualTo(Integer value) {
            addCriterion("achievementsAppraisalScore <>", value, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreGreaterThan(Integer value) {
            addCriterion("achievementsAppraisalScore >", value, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("achievementsAppraisalScore >=", value, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreLessThan(Integer value) {
            addCriterion("achievementsAppraisalScore <", value, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("achievementsAppraisalScore <=", value, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreIn(List<Integer> values) {
            addCriterion("achievementsAppraisalScore in", values, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreNotIn(List<Integer> values) {
            addCriterion("achievementsAppraisalScore not in", values, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreBetween(Integer value1, Integer value2) {
            addCriterion("achievementsAppraisalScore between", value1, value2, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsAppraisalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("achievementsAppraisalScore not between", value1, value2, "achievementsAppraisalScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreIsNull() {
            addCriterion("achievementsGrowupScore is null");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreIsNotNull() {
            addCriterion("achievementsGrowupScore is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreEqualTo(Integer value) {
            addCriterion("achievementsGrowupScore =", value, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreNotEqualTo(Integer value) {
            addCriterion("achievementsGrowupScore <>", value, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreGreaterThan(Integer value) {
            addCriterion("achievementsGrowupScore >", value, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("achievementsGrowupScore >=", value, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreLessThan(Integer value) {
            addCriterion("achievementsGrowupScore <", value, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreLessThanOrEqualTo(Integer value) {
            addCriterion("achievementsGrowupScore <=", value, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreIn(List<Integer> values) {
            addCriterion("achievementsGrowupScore in", values, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreNotIn(List<Integer> values) {
            addCriterion("achievementsGrowupScore not in", values, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreBetween(Integer value1, Integer value2) {
            addCriterion("achievementsGrowupScore between", value1, value2, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsGrowupScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("achievementsGrowupScore not between", value1, value2, "achievementsGrowupScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreIsNull() {
            addCriterion("profitAbilityScore is null");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreIsNotNull() {
            addCriterion("profitAbilityScore is not null");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreEqualTo(Integer value) {
            addCriterion("profitAbilityScore =", value, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreNotEqualTo(Integer value) {
            addCriterion("profitAbilityScore <>", value, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreGreaterThan(Integer value) {
            addCriterion("profitAbilityScore >", value, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("profitAbilityScore >=", value, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreLessThan(Integer value) {
            addCriterion("profitAbilityScore <", value, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreLessThanOrEqualTo(Integer value) {
            addCriterion("profitAbilityScore <=", value, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreIn(List<Integer> values) {
            addCriterion("profitAbilityScore in", values, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreNotIn(List<Integer> values) {
            addCriterion("profitAbilityScore not in", values, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreBetween(Integer value1, Integer value2) {
            addCriterion("profitAbilityScore between", value1, value2, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andProfitAbilityScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("profitAbilityScore not between", value1, value2, "profitAbilityScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreIsNull() {
            addCriterion("achievementsClueScore is null");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreIsNotNull() {
            addCriterion("achievementsClueScore is not null");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreEqualTo(Integer value) {
            addCriterion("achievementsClueScore =", value, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreNotEqualTo(Integer value) {
            addCriterion("achievementsClueScore <>", value, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreGreaterThan(Integer value) {
            addCriterion("achievementsClueScore >", value, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("achievementsClueScore >=", value, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreLessThan(Integer value) {
            addCriterion("achievementsClueScore <", value, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreLessThanOrEqualTo(Integer value) {
            addCriterion("achievementsClueScore <=", value, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreIn(List<Integer> values) {
            addCriterion("achievementsClueScore in", values, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreNotIn(List<Integer> values) {
            addCriterion("achievementsClueScore not in", values, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreBetween(Integer value1, Integer value2) {
            addCriterion("achievementsClueScore between", value1, value2, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andAchievementsClueScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("achievementsClueScore not between", value1, value2, "achievementsClueScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreIsNull() {
            addCriterion("marketplaceStyleScore is null");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreIsNotNull() {
            addCriterion("marketplaceStyleScore is not null");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreEqualTo(Integer value) {
            addCriterion("marketplaceStyleScore =", value, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreNotEqualTo(Integer value) {
            addCriterion("marketplaceStyleScore <>", value, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreGreaterThan(Integer value) {
            addCriterion("marketplaceStyleScore >", value, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("marketplaceStyleScore >=", value, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreLessThan(Integer value) {
            addCriterion("marketplaceStyleScore <", value, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreLessThanOrEqualTo(Integer value) {
            addCriterion("marketplaceStyleScore <=", value, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreIn(List<Integer> values) {
            addCriterion("marketplaceStyleScore in", values, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreNotIn(List<Integer> values) {
            addCriterion("marketplaceStyleScore not in", values, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreBetween(Integer value1, Integer value2) {
            addCriterion("marketplaceStyleScore between", value1, value2, "marketplaceStyleScore");
            return (Criteria) this;
        }

        public Criteria andMarketplaceStyleScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("marketplaceStyleScore not between", value1, value2, "marketplaceStyleScore");
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

        public Criteria andOrganizationEmotionScoreIsNull() {
            addCriterion("organizationEmotionScore is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreIsNotNull() {
            addCriterion("organizationEmotionScore is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreEqualTo(Integer value) {
            addCriterion("organizationEmotionScore =", value, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreNotEqualTo(Integer value) {
            addCriterion("organizationEmotionScore <>", value, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreGreaterThan(Integer value) {
            addCriterion("organizationEmotionScore >", value, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("organizationEmotionScore >=", value, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreLessThan(Integer value) {
            addCriterion("organizationEmotionScore <", value, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("organizationEmotionScore <=", value, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreIn(List<Integer> values) {
            addCriterion("organizationEmotionScore in", values, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreNotIn(List<Integer> values) {
            addCriterion("organizationEmotionScore not in", values, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreBetween(Integer value1, Integer value2) {
            addCriterion("organizationEmotionScore between", value1, value2, "organizationEmotionScore");
            return (Criteria) this;
        }

        public Criteria andOrganizationEmotionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("organizationEmotionScore not between", value1, value2, "organizationEmotionScore");
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

        public Criteria andSuccessRateStatisticsScoreIsNull() {
            addCriterion("successRateStatisticsScore is null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreIsNotNull() {
            addCriterion("successRateStatisticsScore is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreEqualTo(Integer value) {
            addCriterion("successRateStatisticsScore =", value, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreNotEqualTo(Integer value) {
            addCriterion("successRateStatisticsScore <>", value, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreGreaterThan(Integer value) {
            addCriterion("successRateStatisticsScore >", value, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("successRateStatisticsScore >=", value, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreLessThan(Integer value) {
            addCriterion("successRateStatisticsScore <", value, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("successRateStatisticsScore <=", value, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreIn(List<Integer> values) {
            addCriterion("successRateStatisticsScore in", values, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreNotIn(List<Integer> values) {
            addCriterion("successRateStatisticsScore not in", values, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreBetween(Integer value1, Integer value2) {
            addCriterion("successRateStatisticsScore between", value1, value2, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andSuccessRateStatisticsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("successRateStatisticsScore not between", value1, value2, "successRateStatisticsScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreIsNull() {
            addCriterion("stockValuationScore is null");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreIsNotNull() {
            addCriterion("stockValuationScore is not null");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreEqualTo(Integer value) {
            addCriterion("stockValuationScore =", value, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreNotEqualTo(Integer value) {
            addCriterion("stockValuationScore <>", value, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreGreaterThan(Integer value) {
            addCriterion("stockValuationScore >", value, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockValuationScore >=", value, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreLessThan(Integer value) {
            addCriterion("stockValuationScore <", value, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreLessThanOrEqualTo(Integer value) {
            addCriterion("stockValuationScore <=", value, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreIn(List<Integer> values) {
            addCriterion("stockValuationScore in", values, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreNotIn(List<Integer> values) {
            addCriterion("stockValuationScore not in", values, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreBetween(Integer value1, Integer value2) {
            addCriterion("stockValuationScore between", value1, value2, "stockValuationScore");
            return (Criteria) this;
        }

        public Criteria andStockValuationScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("stockValuationScore not between", value1, value2, "stockValuationScore");
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

        public Criteria andIndustryDetailIsNull() {
            addCriterion("industryDetail is null");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailIsNotNull() {
            addCriterion("industryDetail is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailEqualTo(String value) {
            addCriterion("industryDetail =", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotEqualTo(String value) {
            addCriterion("industryDetail <>", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailGreaterThan(String value) {
            addCriterion("industryDetail >", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailGreaterThanOrEqualTo(String value) {
            addCriterion("industryDetail >=", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailLessThan(String value) {
            addCriterion("industryDetail <", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailLessThanOrEqualTo(String value) {
            addCriterion("industryDetail <=", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailLike(String value) {
            addCriterion("industryDetail like", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotLike(String value) {
            addCriterion("industryDetail not like", value, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailIn(List<String> values) {
            addCriterion("industryDetail in", values, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotIn(List<String> values) {
            addCriterion("industryDetail not in", values, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailBetween(String value1, String value2) {
            addCriterion("industryDetail between", value1, value2, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andIndustryDetailNotBetween(String value1, String value2) {
            addCriterion("industryDetail not between", value1, value2, "industryDetail");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
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