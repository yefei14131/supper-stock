package com.pers.yefei.supper.stock.model.gen.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblStockScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

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

        public Criteria andDealQuantityIsNull() {
            addCriterion("dealQuantity is null");
            return (Criteria) this;
        }

        public Criteria andDealQuantityIsNotNull() {
            addCriterion("dealQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andDealQuantityEqualTo(Double value) {
            addCriterion("dealQuantity =", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityNotEqualTo(Double value) {
            addCriterion("dealQuantity <>", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityGreaterThan(Double value) {
            addCriterion("dealQuantity >", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("dealQuantity >=", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityLessThan(Double value) {
            addCriterion("dealQuantity <", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityLessThanOrEqualTo(Double value) {
            addCriterion("dealQuantity <=", value, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityIn(List<Double> values) {
            addCriterion("dealQuantity in", values, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityNotIn(List<Double> values) {
            addCriterion("dealQuantity not in", values, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityBetween(Double value1, Double value2) {
            addCriterion("dealQuantity between", value1, value2, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealQuantityNotBetween(Double value1, Double value2) {
            addCriterion("dealQuantity not between", value1, value2, "dealQuantity");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNull() {
            addCriterion("dealAmount is null");
            return (Criteria) this;
        }

        public Criteria andDealAmountIsNotNull() {
            addCriterion("dealAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDealAmountEqualTo(Double value) {
            addCriterion("dealAmount =", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotEqualTo(Double value) {
            addCriterion("dealAmount <>", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThan(Double value) {
            addCriterion("dealAmount >", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("dealAmount >=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThan(Double value) {
            addCriterion("dealAmount <", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountLessThanOrEqualTo(Double value) {
            addCriterion("dealAmount <=", value, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountIn(List<Double> values) {
            addCriterion("dealAmount in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotIn(List<Double> values) {
            addCriterion("dealAmount not in", values, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountBetween(Double value1, Double value2) {
            addCriterion("dealAmount between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andDealAmountNotBetween(Double value1, Double value2) {
            addCriterion("dealAmount not between", value1, value2, "dealAmount");
            return (Criteria) this;
        }

        public Criteria andPriceChangeIsNull() {
            addCriterion("priceChange is null");
            return (Criteria) this;
        }

        public Criteria andPriceChangeIsNotNull() {
            addCriterion("priceChange is not null");
            return (Criteria) this;
        }

        public Criteria andPriceChangeEqualTo(Double value) {
            addCriterion("priceChange =", value, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeNotEqualTo(Double value) {
            addCriterion("priceChange <>", value, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeGreaterThan(Double value) {
            addCriterion("priceChange >", value, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("priceChange >=", value, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeLessThan(Double value) {
            addCriterion("priceChange <", value, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeLessThanOrEqualTo(Double value) {
            addCriterion("priceChange <=", value, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeIn(List<Double> values) {
            addCriterion("priceChange in", values, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeNotIn(List<Double> values) {
            addCriterion("priceChange not in", values, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeBetween(Double value1, Double value2) {
            addCriterion("priceChange between", value1, value2, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeNotBetween(Double value1, Double value2) {
            addCriterion("priceChange not between", value1, value2, "priceChange");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioIsNull() {
            addCriterion("priceChangeRatio is null");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioIsNotNull() {
            addCriterion("priceChangeRatio is not null");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioEqualTo(Double value) {
            addCriterion("priceChangeRatio =", value, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioNotEqualTo(Double value) {
            addCriterion("priceChangeRatio <>", value, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioGreaterThan(Double value) {
            addCriterion("priceChangeRatio >", value, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("priceChangeRatio >=", value, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioLessThan(Double value) {
            addCriterion("priceChangeRatio <", value, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioLessThanOrEqualTo(Double value) {
            addCriterion("priceChangeRatio <=", value, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioIn(List<Double> values) {
            addCriterion("priceChangeRatio in", values, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioNotIn(List<Double> values) {
            addCriterion("priceChangeRatio not in", values, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioBetween(Double value1, Double value2) {
            addCriterion("priceChangeRatio between", value1, value2, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andPriceChangeRatioNotBetween(Double value1, Double value2) {
            addCriterion("priceChangeRatio not between", value1, value2, "priceChangeRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioIsNull() {
            addCriterion("turnoverRatio is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioIsNotNull() {
            addCriterion("turnoverRatio is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioEqualTo(Double value) {
            addCriterion("turnoverRatio =", value, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioNotEqualTo(Double value) {
            addCriterion("turnoverRatio <>", value, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioGreaterThan(Double value) {
            addCriterion("turnoverRatio >", value, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("turnoverRatio >=", value, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioLessThan(Double value) {
            addCriterion("turnoverRatio <", value, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioLessThanOrEqualTo(Double value) {
            addCriterion("turnoverRatio <=", value, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioIn(List<Double> values) {
            addCriterion("turnoverRatio in", values, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioNotIn(List<Double> values) {
            addCriterion("turnoverRatio not in", values, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioBetween(Double value1, Double value2) {
            addCriterion("turnoverRatio between", value1, value2, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andTurnoverRatioNotBetween(Double value1, Double value2) {
            addCriterion("turnoverRatio not between", value1, value2, "turnoverRatio");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountIsNull() {
            addCriterion("mainInflowAmount is null");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountIsNotNull() {
            addCriterion("mainInflowAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountEqualTo(Double value) {
            addCriterion("mainInflowAmount =", value, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountNotEqualTo(Double value) {
            addCriterion("mainInflowAmount <>", value, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountGreaterThan(Double value) {
            addCriterion("mainInflowAmount >", value, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("mainInflowAmount >=", value, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountLessThan(Double value) {
            addCriterion("mainInflowAmount <", value, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountLessThanOrEqualTo(Double value) {
            addCriterion("mainInflowAmount <=", value, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountIn(List<Double> values) {
            addCriterion("mainInflowAmount in", values, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountNotIn(List<Double> values) {
            addCriterion("mainInflowAmount not in", values, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountBetween(Double value1, Double value2) {
            addCriterion("mainInflowAmount between", value1, value2, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainInflowAmountNotBetween(Double value1, Double value2) {
            addCriterion("mainInflowAmount not between", value1, value2, "mainInflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountIsNull() {
            addCriterion("mainOutflowAmount is null");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountIsNotNull() {
            addCriterion("mainOutflowAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountEqualTo(Double value) {
            addCriterion("mainOutflowAmount =", value, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountNotEqualTo(Double value) {
            addCriterion("mainOutflowAmount <>", value, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountGreaterThan(Double value) {
            addCriterion("mainOutflowAmount >", value, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("mainOutflowAmount >=", value, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountLessThan(Double value) {
            addCriterion("mainOutflowAmount <", value, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountLessThanOrEqualTo(Double value) {
            addCriterion("mainOutflowAmount <=", value, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountIn(List<Double> values) {
            addCriterion("mainOutflowAmount in", values, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountNotIn(List<Double> values) {
            addCriterion("mainOutflowAmount not in", values, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountBetween(Double value1, Double value2) {
            addCriterion("mainOutflowAmount between", value1, value2, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andMainOutflowAmountNotBetween(Double value1, Double value2) {
            addCriterion("mainOutflowAmount not between", value1, value2, "mainOutflowAmount");
            return (Criteria) this;
        }

        public Criteria andNetInflowIsNull() {
            addCriterion("netInflow is null");
            return (Criteria) this;
        }

        public Criteria andNetInflowIsNotNull() {
            addCriterion("netInflow is not null");
            return (Criteria) this;
        }

        public Criteria andNetInflowEqualTo(Double value) {
            addCriterion("netInflow =", value, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowNotEqualTo(Double value) {
            addCriterion("netInflow <>", value, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowGreaterThan(Double value) {
            addCriterion("netInflow >", value, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowGreaterThanOrEqualTo(Double value) {
            addCriterion("netInflow >=", value, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowLessThan(Double value) {
            addCriterion("netInflow <", value, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowLessThanOrEqualTo(Double value) {
            addCriterion("netInflow <=", value, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowIn(List<Double> values) {
            addCriterion("netInflow in", values, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowNotIn(List<Double> values) {
            addCriterion("netInflow not in", values, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowBetween(Double value1, Double value2) {
            addCriterion("netInflow between", value1, value2, "netInflow");
            return (Criteria) this;
        }

        public Criteria andNetInflowNotBetween(Double value1, Double value2) {
            addCriterion("netInflow not between", value1, value2, "netInflow");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIsNull() {
            addCriterion("openPrice is null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIsNotNull() {
            addCriterion("openPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOpenPriceEqualTo(Double value) {
            addCriterion("openPrice =", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotEqualTo(Double value) {
            addCriterion("openPrice <>", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThan(Double value) {
            addCriterion("openPrice >", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("openPrice >=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThan(Double value) {
            addCriterion("openPrice <", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceLessThanOrEqualTo(Double value) {
            addCriterion("openPrice <=", value, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceIn(List<Double> values) {
            addCriterion("openPrice in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotIn(List<Double> values) {
            addCriterion("openPrice not in", values, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceBetween(Double value1, Double value2) {
            addCriterion("openPrice between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andOpenPriceNotBetween(Double value1, Double value2) {
            addCriterion("openPrice not between", value1, value2, "openPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNull() {
            addCriterion("maxPrice is null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNotNull() {
            addCriterion("maxPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceEqualTo(Double value) {
            addCriterion("maxPrice =", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotEqualTo(Double value) {
            addCriterion("maxPrice <>", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThan(Double value) {
            addCriterion("maxPrice >", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("maxPrice >=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThan(Double value) {
            addCriterion("maxPrice <", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThanOrEqualTo(Double value) {
            addCriterion("maxPrice <=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIn(List<Double> values) {
            addCriterion("maxPrice in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotIn(List<Double> values) {
            addCriterion("maxPrice not in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceBetween(Double value1, Double value2) {
            addCriterion("maxPrice between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotBetween(Double value1, Double value2) {
            addCriterion("maxPrice not between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("minPrice is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("minPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(Double value) {
            addCriterion("minPrice =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(Double value) {
            addCriterion("minPrice <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(Double value) {
            addCriterion("minPrice >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("minPrice >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(Double value) {
            addCriterion("minPrice <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(Double value) {
            addCriterion("minPrice <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<Double> values) {
            addCriterion("minPrice in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<Double> values) {
            addCriterion("minPrice not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(Double value1, Double value2) {
            addCriterion("minPrice between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(Double value1, Double value2) {
            addCriterion("minPrice not between", value1, value2, "minPrice");
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