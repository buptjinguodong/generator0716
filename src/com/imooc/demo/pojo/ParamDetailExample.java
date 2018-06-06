package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ParamDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParamDetailExample() {
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

        public Criteria andParamSeqIsNull() {
            addCriterion("PARAM_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andParamSeqIsNotNull() {
            addCriterion("PARAM_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andParamSeqEqualTo(String value) {
            addCriterion("PARAM_SEQ =", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqNotEqualTo(String value) {
            addCriterion("PARAM_SEQ <>", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqGreaterThan(String value) {
            addCriterion("PARAM_SEQ >", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_SEQ >=", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqLessThan(String value) {
            addCriterion("PARAM_SEQ <", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqLessThanOrEqualTo(String value) {
            addCriterion("PARAM_SEQ <=", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqLike(String value) {
            addCriterion("PARAM_SEQ like", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqNotLike(String value) {
            addCriterion("PARAM_SEQ not like", value, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqIn(List<String> values) {
            addCriterion("PARAM_SEQ in", values, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqNotIn(List<String> values) {
            addCriterion("PARAM_SEQ not in", values, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqBetween(String value1, String value2) {
            addCriterion("PARAM_SEQ between", value1, value2, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamSeqNotBetween(String value1, String value2) {
            addCriterion("PARAM_SEQ not between", value1, value2, "paramSeq");
            return (Criteria) this;
        }

        public Criteria andParamKeyIsNull() {
            addCriterion("PARAM_KEY is null");
            return (Criteria) this;
        }

        public Criteria andParamKeyIsNotNull() {
            addCriterion("PARAM_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andParamKeyEqualTo(String value) {
            addCriterion("PARAM_KEY =", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyNotEqualTo(String value) {
            addCriterion("PARAM_KEY <>", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyGreaterThan(String value) {
            addCriterion("PARAM_KEY >", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_KEY >=", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyLessThan(String value) {
            addCriterion("PARAM_KEY <", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyLessThanOrEqualTo(String value) {
            addCriterion("PARAM_KEY <=", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyLike(String value) {
            addCriterion("PARAM_KEY like", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyNotLike(String value) {
            addCriterion("PARAM_KEY not like", value, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyIn(List<String> values) {
            addCriterion("PARAM_KEY in", values, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyNotIn(List<String> values) {
            addCriterion("PARAM_KEY not in", values, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyBetween(String value1, String value2) {
            addCriterion("PARAM_KEY between", value1, value2, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamKeyNotBetween(String value1, String value2) {
            addCriterion("PARAM_KEY not between", value1, value2, "paramKey");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNull() {
            addCriterion("PARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNotNull() {
            addCriterion("PARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParamValueEqualTo(String value) {
            addCriterion("PARAM_VALUE =", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotEqualTo(String value) {
            addCriterion("PARAM_VALUE <>", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThan(String value) {
            addCriterion("PARAM_VALUE >", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_VALUE >=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThan(String value) {
            addCriterion("PARAM_VALUE <", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThanOrEqualTo(String value) {
            addCriterion("PARAM_VALUE <=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLike(String value) {
            addCriterion("PARAM_VALUE like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotLike(String value) {
            addCriterion("PARAM_VALUE not like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueIn(List<String> values) {
            addCriterion("PARAM_VALUE in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotIn(List<String> values) {
            addCriterion("PARAM_VALUE not in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueBetween(String value1, String value2) {
            addCriterion("PARAM_VALUE between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotBetween(String value1, String value2) {
            addCriterion("PARAM_VALUE not between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamRemarkIsNull() {
            addCriterion("PARAM_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andParamRemarkIsNotNull() {
            addCriterion("PARAM_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andParamRemarkEqualTo(String value) {
            addCriterion("PARAM_REMARK =", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkNotEqualTo(String value) {
            addCriterion("PARAM_REMARK <>", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkGreaterThan(String value) {
            addCriterion("PARAM_REMARK >", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_REMARK >=", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkLessThan(String value) {
            addCriterion("PARAM_REMARK <", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkLessThanOrEqualTo(String value) {
            addCriterion("PARAM_REMARK <=", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkLike(String value) {
            addCriterion("PARAM_REMARK like", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkNotLike(String value) {
            addCriterion("PARAM_REMARK not like", value, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkIn(List<String> values) {
            addCriterion("PARAM_REMARK in", values, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkNotIn(List<String> values) {
            addCriterion("PARAM_REMARK not in", values, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkBetween(String value1, String value2) {
            addCriterion("PARAM_REMARK between", value1, value2, "paramRemark");
            return (Criteria) this;
        }

        public Criteria andParamRemarkNotBetween(String value1, String value2) {
            addCriterion("PARAM_REMARK not between", value1, value2, "paramRemark");
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