package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActiInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiInfoExample() {
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

        public Criteria andActiIdIsNull() {
            addCriterion("ACTI_ID is null");
            return (Criteria) this;
        }

        public Criteria andActiIdIsNotNull() {
            addCriterion("ACTI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActiIdEqualTo(String value) {
            addCriterion("ACTI_ID =", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotEqualTo(String value) {
            addCriterion("ACTI_ID <>", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdGreaterThan(String value) {
            addCriterion("ACTI_ID >", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_ID >=", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdLessThan(String value) {
            addCriterion("ACTI_ID <", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdLessThanOrEqualTo(String value) {
            addCriterion("ACTI_ID <=", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdLike(String value) {
            addCriterion("ACTI_ID like", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotLike(String value) {
            addCriterion("ACTI_ID not like", value, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdIn(List<String> values) {
            addCriterion("ACTI_ID in", values, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotIn(List<String> values) {
            addCriterion("ACTI_ID not in", values, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdBetween(String value1, String value2) {
            addCriterion("ACTI_ID between", value1, value2, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiIdNotBetween(String value1, String value2) {
            addCriterion("ACTI_ID not between", value1, value2, "actiId");
            return (Criteria) this;
        }

        public Criteria andActiTitleIsNull() {
            addCriterion("ACTI_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andActiTitleIsNotNull() {
            addCriterion("ACTI_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andActiTitleEqualTo(String value) {
            addCriterion("ACTI_TITLE =", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleNotEqualTo(String value) {
            addCriterion("ACTI_TITLE <>", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleGreaterThan(String value) {
            addCriterion("ACTI_TITLE >", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_TITLE >=", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleLessThan(String value) {
            addCriterion("ACTI_TITLE <", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleLessThanOrEqualTo(String value) {
            addCriterion("ACTI_TITLE <=", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleLike(String value) {
            addCriterion("ACTI_TITLE like", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleNotLike(String value) {
            addCriterion("ACTI_TITLE not like", value, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleIn(List<String> values) {
            addCriterion("ACTI_TITLE in", values, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleNotIn(List<String> values) {
            addCriterion("ACTI_TITLE not in", values, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleBetween(String value1, String value2) {
            addCriterion("ACTI_TITLE between", value1, value2, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiTitleNotBetween(String value1, String value2) {
            addCriterion("ACTI_TITLE not between", value1, value2, "actiTitle");
            return (Criteria) this;
        }

        public Criteria andActiAddrIsNull() {
            addCriterion("ACTI_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andActiAddrIsNotNull() {
            addCriterion("ACTI_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andActiAddrEqualTo(String value) {
            addCriterion("ACTI_ADDR =", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotEqualTo(String value) {
            addCriterion("ACTI_ADDR <>", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrGreaterThan(String value) {
            addCriterion("ACTI_ADDR >", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_ADDR >=", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrLessThan(String value) {
            addCriterion("ACTI_ADDR <", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrLessThanOrEqualTo(String value) {
            addCriterion("ACTI_ADDR <=", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrLike(String value) {
            addCriterion("ACTI_ADDR like", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotLike(String value) {
            addCriterion("ACTI_ADDR not like", value, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrIn(List<String> values) {
            addCriterion("ACTI_ADDR in", values, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotIn(List<String> values) {
            addCriterion("ACTI_ADDR not in", values, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrBetween(String value1, String value2) {
            addCriterion("ACTI_ADDR between", value1, value2, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiAddrNotBetween(String value1, String value2) {
            addCriterion("ACTI_ADDR not between", value1, value2, "actiAddr");
            return (Criteria) this;
        }

        public Criteria andActiStartDateIsNull() {
            addCriterion("ACTI_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActiStartDateIsNotNull() {
            addCriterion("ACTI_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActiStartDateEqualTo(String value) {
            addCriterion("ACTI_START_DATE =", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateNotEqualTo(String value) {
            addCriterion("ACTI_START_DATE <>", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateGreaterThan(String value) {
            addCriterion("ACTI_START_DATE >", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_START_DATE >=", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateLessThan(String value) {
            addCriterion("ACTI_START_DATE <", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateLessThanOrEqualTo(String value) {
            addCriterion("ACTI_START_DATE <=", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateLike(String value) {
            addCriterion("ACTI_START_DATE like", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateNotLike(String value) {
            addCriterion("ACTI_START_DATE not like", value, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateIn(List<String> values) {
            addCriterion("ACTI_START_DATE in", values, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateNotIn(List<String> values) {
            addCriterion("ACTI_START_DATE not in", values, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateBetween(String value1, String value2) {
            addCriterion("ACTI_START_DATE between", value1, value2, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiStartDateNotBetween(String value1, String value2) {
            addCriterion("ACTI_START_DATE not between", value1, value2, "actiStartDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateIsNull() {
            addCriterion("ACTI_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActiEndDateIsNotNull() {
            addCriterion("ACTI_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActiEndDateEqualTo(String value) {
            addCriterion("ACTI_END_DATE =", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateNotEqualTo(String value) {
            addCriterion("ACTI_END_DATE <>", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateGreaterThan(String value) {
            addCriterion("ACTI_END_DATE >", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_END_DATE >=", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateLessThan(String value) {
            addCriterion("ACTI_END_DATE <", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateLessThanOrEqualTo(String value) {
            addCriterion("ACTI_END_DATE <=", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateLike(String value) {
            addCriterion("ACTI_END_DATE like", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateNotLike(String value) {
            addCriterion("ACTI_END_DATE not like", value, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateIn(List<String> values) {
            addCriterion("ACTI_END_DATE in", values, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateNotIn(List<String> values) {
            addCriterion("ACTI_END_DATE not in", values, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateBetween(String value1, String value2) {
            addCriterion("ACTI_END_DATE between", value1, value2, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiEndDateNotBetween(String value1, String value2) {
            addCriterion("ACTI_END_DATE not between", value1, value2, "actiEndDate");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalIsNull() {
            addCriterion("ACTI_PRICE_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalIsNotNull() {
            addCriterion("ACTI_PRICE_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_TOTAL =", value, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalNotEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_TOTAL <>", value, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalGreaterThan(Integer value) {
            addCriterion("ACTI_PRICE_TOTAL >", value, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_TOTAL >=", value, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalLessThan(Integer value) {
            addCriterion("ACTI_PRICE_TOTAL <", value, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalLessThanOrEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_TOTAL <=", value, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalIn(List<Integer> values) {
            addCriterion("ACTI_PRICE_TOTAL in", values, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalNotIn(List<Integer> values) {
            addCriterion("ACTI_PRICE_TOTAL not in", values, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalBetween(Integer value1, Integer value2) {
            addCriterion("ACTI_PRICE_TOTAL between", value1, value2, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPriceTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTI_PRICE_TOTAL not between", value1, value2, "actiPriceTotal");
            return (Criteria) this;
        }

        public Criteria andActiPricePreIsNull() {
            addCriterion("ACTI_PRICE_PRE is null");
            return (Criteria) this;
        }

        public Criteria andActiPricePreIsNotNull() {
            addCriterion("ACTI_PRICE_PRE is not null");
            return (Criteria) this;
        }

        public Criteria andActiPricePreEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_PRE =", value, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreNotEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_PRE <>", value, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreGreaterThan(Integer value) {
            addCriterion("ACTI_PRICE_PRE >", value, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_PRE >=", value, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreLessThan(Integer value) {
            addCriterion("ACTI_PRICE_PRE <", value, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreLessThanOrEqualTo(Integer value) {
            addCriterion("ACTI_PRICE_PRE <=", value, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreIn(List<Integer> values) {
            addCriterion("ACTI_PRICE_PRE in", values, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreNotIn(List<Integer> values) {
            addCriterion("ACTI_PRICE_PRE not in", values, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreBetween(Integer value1, Integer value2) {
            addCriterion("ACTI_PRICE_PRE between", value1, value2, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiPricePreNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTI_PRICE_PRE not between", value1, value2, "actiPricePre");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIsNull() {
            addCriterion("ACTI_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIsNotNull() {
            addCriterion("ACTI_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andActiCreatorEqualTo(String value) {
            addCriterion("ACTI_CREATOR =", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorNotEqualTo(String value) {
            addCriterion("ACTI_CREATOR <>", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorGreaterThan(String value) {
            addCriterion("ACTI_CREATOR >", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_CREATOR >=", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorLessThan(String value) {
            addCriterion("ACTI_CREATOR <", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorLessThanOrEqualTo(String value) {
            addCriterion("ACTI_CREATOR <=", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorLike(String value) {
            addCriterion("ACTI_CREATOR like", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorNotLike(String value) {
            addCriterion("ACTI_CREATOR not like", value, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIn(List<String> values) {
            addCriterion("ACTI_CREATOR in", values, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorNotIn(List<String> values) {
            addCriterion("ACTI_CREATOR not in", values, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorBetween(String value1, String value2) {
            addCriterion("ACTI_CREATOR between", value1, value2, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorNotBetween(String value1, String value2) {
            addCriterion("ACTI_CREATOR not between", value1, value2, "actiCreator");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdIsNull() {
            addCriterion("ACTI_CREATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdIsNotNull() {
            addCriterion("ACTI_CREATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdEqualTo(String value) {
            addCriterion("ACTI_CREATOR_ID =", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdNotEqualTo(String value) {
            addCriterion("ACTI_CREATOR_ID <>", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdGreaterThan(String value) {
            addCriterion("ACTI_CREATOR_ID >", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_CREATOR_ID >=", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdLessThan(String value) {
            addCriterion("ACTI_CREATOR_ID <", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("ACTI_CREATOR_ID <=", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdLike(String value) {
            addCriterion("ACTI_CREATOR_ID like", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdNotLike(String value) {
            addCriterion("ACTI_CREATOR_ID not like", value, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdIn(List<String> values) {
            addCriterion("ACTI_CREATOR_ID in", values, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdNotIn(List<String> values) {
            addCriterion("ACTI_CREATOR_ID not in", values, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdBetween(String value1, String value2) {
            addCriterion("ACTI_CREATOR_ID between", value1, value2, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCreatorIdNotBetween(String value1, String value2) {
            addCriterion("ACTI_CREATOR_ID not between", value1, value2, "actiCreatorId");
            return (Criteria) this;
        }

        public Criteria andActiCapacityIsNull() {
            addCriterion("ACTI_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andActiCapacityIsNotNull() {
            addCriterion("ACTI_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andActiCapacityEqualTo(Integer value) {
            addCriterion("ACTI_CAPACITY =", value, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityNotEqualTo(Integer value) {
            addCriterion("ACTI_CAPACITY <>", value, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityGreaterThan(Integer value) {
            addCriterion("ACTI_CAPACITY >", value, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTI_CAPACITY >=", value, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityLessThan(Integer value) {
            addCriterion("ACTI_CAPACITY <", value, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("ACTI_CAPACITY <=", value, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityIn(List<Integer> values) {
            addCriterion("ACTI_CAPACITY in", values, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityNotIn(List<Integer> values) {
            addCriterion("ACTI_CAPACITY not in", values, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityBetween(Integer value1, Integer value2) {
            addCriterion("ACTI_CAPACITY between", value1, value2, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTI_CAPACITY not between", value1, value2, "actiCapacity");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeIsNull() {
            addCriterion("ACTI_APLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeIsNotNull() {
            addCriterion("ACTI_APLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeEqualTo(Date value) {
            addCriterion("ACTI_APLY_TIME =", value, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeNotEqualTo(Date value) {
            addCriterion("ACTI_APLY_TIME <>", value, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeGreaterThan(Date value) {
            addCriterion("ACTI_APLY_TIME >", value, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTI_APLY_TIME >=", value, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeLessThan(Date value) {
            addCriterion("ACTI_APLY_TIME <", value, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTI_APLY_TIME <=", value, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeIn(List<Date> values) {
            addCriterion("ACTI_APLY_TIME in", values, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeNotIn(List<Date> values) {
            addCriterion("ACTI_APLY_TIME not in", values, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeBetween(Date value1, Date value2) {
            addCriterion("ACTI_APLY_TIME between", value1, value2, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiAplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTI_APLY_TIME not between", value1, value2, "actiAplyTime");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdIsNull() {
            addCriterion("ACTI_STATUS_CD is null");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdIsNotNull() {
            addCriterion("ACTI_STATUS_CD is not null");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdEqualTo(String value) {
            addCriterion("ACTI_STATUS_CD =", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdNotEqualTo(String value) {
            addCriterion("ACTI_STATUS_CD <>", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdGreaterThan(String value) {
            addCriterion("ACTI_STATUS_CD >", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_STATUS_CD >=", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdLessThan(String value) {
            addCriterion("ACTI_STATUS_CD <", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdLessThanOrEqualTo(String value) {
            addCriterion("ACTI_STATUS_CD <=", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdLike(String value) {
            addCriterion("ACTI_STATUS_CD like", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdNotLike(String value) {
            addCriterion("ACTI_STATUS_CD not like", value, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdIn(List<String> values) {
            addCriterion("ACTI_STATUS_CD in", values, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdNotIn(List<String> values) {
            addCriterion("ACTI_STATUS_CD not in", values, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdBetween(String value1, String value2) {
            addCriterion("ACTI_STATUS_CD between", value1, value2, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiStatusCdNotBetween(String value1, String value2) {
            addCriterion("ACTI_STATUS_CD not between", value1, value2, "actiStatusCd");
            return (Criteria) this;
        }

        public Criteria andActiAbsIsNull() {
            addCriterion("ACTI_ABS is null");
            return (Criteria) this;
        }

        public Criteria andActiAbsIsNotNull() {
            addCriterion("ACTI_ABS is not null");
            return (Criteria) this;
        }

        public Criteria andActiAbsEqualTo(String value) {
            addCriterion("ACTI_ABS =", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsNotEqualTo(String value) {
            addCriterion("ACTI_ABS <>", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsGreaterThan(String value) {
            addCriterion("ACTI_ABS >", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_ABS >=", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsLessThan(String value) {
            addCriterion("ACTI_ABS <", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsLessThanOrEqualTo(String value) {
            addCriterion("ACTI_ABS <=", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsLike(String value) {
            addCriterion("ACTI_ABS like", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsNotLike(String value) {
            addCriterion("ACTI_ABS not like", value, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsIn(List<String> values) {
            addCriterion("ACTI_ABS in", values, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsNotIn(List<String> values) {
            addCriterion("ACTI_ABS not in", values, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsBetween(String value1, String value2) {
            addCriterion("ACTI_ABS between", value1, value2, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiAbsNotBetween(String value1, String value2) {
            addCriterion("ACTI_ABS not between", value1, value2, "actiAbs");
            return (Criteria) this;
        }

        public Criteria andActiImgsIsNull() {
            addCriterion("ACTI_IMGS is null");
            return (Criteria) this;
        }

        public Criteria andActiImgsIsNotNull() {
            addCriterion("ACTI_IMGS is not null");
            return (Criteria) this;
        }

        public Criteria andActiImgsEqualTo(String value) {
            addCriterion("ACTI_IMGS =", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsNotEqualTo(String value) {
            addCriterion("ACTI_IMGS <>", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsGreaterThan(String value) {
            addCriterion("ACTI_IMGS >", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_IMGS >=", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsLessThan(String value) {
            addCriterion("ACTI_IMGS <", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsLessThanOrEqualTo(String value) {
            addCriterion("ACTI_IMGS <=", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsLike(String value) {
            addCriterion("ACTI_IMGS like", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsNotLike(String value) {
            addCriterion("ACTI_IMGS not like", value, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsIn(List<String> values) {
            addCriterion("ACTI_IMGS in", values, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsNotIn(List<String> values) {
            addCriterion("ACTI_IMGS not in", values, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsBetween(String value1, String value2) {
            addCriterion("ACTI_IMGS between", value1, value2, "actiImgs");
            return (Criteria) this;
        }

        public Criteria andActiImgsNotBetween(String value1, String value2) {
            addCriterion("ACTI_IMGS not between", value1, value2, "actiImgs");
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