package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActiDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiDetailExample() {
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

        public Criteria andActiBaseinfoIsNull() {
            addCriterion("ACTI_BASEINFO is null");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoIsNotNull() {
            addCriterion("ACTI_BASEINFO is not null");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoEqualTo(String value) {
            addCriterion("ACTI_BASEINFO =", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoNotEqualTo(String value) {
            addCriterion("ACTI_BASEINFO <>", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoGreaterThan(String value) {
            addCriterion("ACTI_BASEINFO >", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_BASEINFO >=", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoLessThan(String value) {
            addCriterion("ACTI_BASEINFO <", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoLessThanOrEqualTo(String value) {
            addCriterion("ACTI_BASEINFO <=", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoLike(String value) {
            addCriterion("ACTI_BASEINFO like", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoNotLike(String value) {
            addCriterion("ACTI_BASEINFO not like", value, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoIn(List<String> values) {
            addCriterion("ACTI_BASEINFO in", values, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoNotIn(List<String> values) {
            addCriterion("ACTI_BASEINFO not in", values, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoBetween(String value1, String value2) {
            addCriterion("ACTI_BASEINFO between", value1, value2, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiBaseinfoNotBetween(String value1, String value2) {
            addCriterion("ACTI_BASEINFO not between", value1, value2, "actiBaseinfo");
            return (Criteria) this;
        }

        public Criteria andActiPrepareIsNull() {
            addCriterion("ACTI_PREPARE is null");
            return (Criteria) this;
        }

        public Criteria andActiPrepareIsNotNull() {
            addCriterion("ACTI_PREPARE is not null");
            return (Criteria) this;
        }

        public Criteria andActiPrepareEqualTo(String value) {
            addCriterion("ACTI_PREPARE =", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareNotEqualTo(String value) {
            addCriterion("ACTI_PREPARE <>", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareGreaterThan(String value) {
            addCriterion("ACTI_PREPARE >", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_PREPARE >=", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareLessThan(String value) {
            addCriterion("ACTI_PREPARE <", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareLessThanOrEqualTo(String value) {
            addCriterion("ACTI_PREPARE <=", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareLike(String value) {
            addCriterion("ACTI_PREPARE like", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareNotLike(String value) {
            addCriterion("ACTI_PREPARE not like", value, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareIn(List<String> values) {
            addCriterion("ACTI_PREPARE in", values, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareNotIn(List<String> values) {
            addCriterion("ACTI_PREPARE not in", values, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareBetween(String value1, String value2) {
            addCriterion("ACTI_PREPARE between", value1, value2, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPrepareNotBetween(String value1, String value2) {
            addCriterion("ACTI_PREPARE not between", value1, value2, "actiPrepare");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailIsNull() {
            addCriterion("ACTI_PRICE_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailIsNotNull() {
            addCriterion("ACTI_PRICE_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailEqualTo(String value) {
            addCriterion("ACTI_PRICE_DETAIL =", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailNotEqualTo(String value) {
            addCriterion("ACTI_PRICE_DETAIL <>", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailGreaterThan(String value) {
            addCriterion("ACTI_PRICE_DETAIL >", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_PRICE_DETAIL >=", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailLessThan(String value) {
            addCriterion("ACTI_PRICE_DETAIL <", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailLessThanOrEqualTo(String value) {
            addCriterion("ACTI_PRICE_DETAIL <=", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailLike(String value) {
            addCriterion("ACTI_PRICE_DETAIL like", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailNotLike(String value) {
            addCriterion("ACTI_PRICE_DETAIL not like", value, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailIn(List<String> values) {
            addCriterion("ACTI_PRICE_DETAIL in", values, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailNotIn(List<String> values) {
            addCriterion("ACTI_PRICE_DETAIL not in", values, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailBetween(String value1, String value2) {
            addCriterion("ACTI_PRICE_DETAIL between", value1, value2, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiPriceDetailNotBetween(String value1, String value2) {
            addCriterion("ACTI_PRICE_DETAIL not between", value1, value2, "actiPriceDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailIsNull() {
            addCriterion("ACTI_APLY_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailIsNotNull() {
            addCriterion("ACTI_APLY_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailEqualTo(String value) {
            addCriterion("ACTI_APLY_DETAIL =", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailNotEqualTo(String value) {
            addCriterion("ACTI_APLY_DETAIL <>", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailGreaterThan(String value) {
            addCriterion("ACTI_APLY_DETAIL >", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ACTI_APLY_DETAIL >=", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailLessThan(String value) {
            addCriterion("ACTI_APLY_DETAIL <", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailLessThanOrEqualTo(String value) {
            addCriterion("ACTI_APLY_DETAIL <=", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailLike(String value) {
            addCriterion("ACTI_APLY_DETAIL like", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailNotLike(String value) {
            addCriterion("ACTI_APLY_DETAIL not like", value, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailIn(List<String> values) {
            addCriterion("ACTI_APLY_DETAIL in", values, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailNotIn(List<String> values) {
            addCriterion("ACTI_APLY_DETAIL not in", values, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailBetween(String value1, String value2) {
            addCriterion("ACTI_APLY_DETAIL between", value1, value2, "actiAplyDetail");
            return (Criteria) this;
        }

        public Criteria andActiAplyDetailNotBetween(String value1, String value2) {
            addCriterion("ACTI_APLY_DETAIL not between", value1, value2, "actiAplyDetail");
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