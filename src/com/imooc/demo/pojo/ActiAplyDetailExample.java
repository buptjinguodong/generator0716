package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActiAplyDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiAplyDetailExample() {
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

        public Criteria andAplyIdIsNull() {
            addCriterion("APLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAplyIdIsNotNull() {
            addCriterion("APLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAplyIdEqualTo(String value) {
            addCriterion("APLY_ID =", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotEqualTo(String value) {
            addCriterion("APLY_ID <>", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdGreaterThan(String value) {
            addCriterion("APLY_ID >", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_ID >=", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdLessThan(String value) {
            addCriterion("APLY_ID <", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdLessThanOrEqualTo(String value) {
            addCriterion("APLY_ID <=", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdLike(String value) {
            addCriterion("APLY_ID like", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotLike(String value) {
            addCriterion("APLY_ID not like", value, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdIn(List<String> values) {
            addCriterion("APLY_ID in", values, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotIn(List<String> values) {
            addCriterion("APLY_ID not in", values, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdBetween(String value1, String value2) {
            addCriterion("APLY_ID between", value1, value2, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyIdNotBetween(String value1, String value2) {
            addCriterion("APLY_ID not between", value1, value2, "aplyId");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameIsNull() {
            addCriterion("APLY_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameIsNotNull() {
            addCriterion("APLY_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameEqualTo(String value) {
            addCriterion("APLY_USER_NAME =", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameNotEqualTo(String value) {
            addCriterion("APLY_USER_NAME <>", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameGreaterThan(String value) {
            addCriterion("APLY_USER_NAME >", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_USER_NAME >=", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameLessThan(String value) {
            addCriterion("APLY_USER_NAME <", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("APLY_USER_NAME <=", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameLike(String value) {
            addCriterion("APLY_USER_NAME like", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameNotLike(String value) {
            addCriterion("APLY_USER_NAME not like", value, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameIn(List<String> values) {
            addCriterion("APLY_USER_NAME in", values, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameNotIn(List<String> values) {
            addCriterion("APLY_USER_NAME not in", values, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameBetween(String value1, String value2) {
            addCriterion("APLY_USER_NAME between", value1, value2, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andAplyUserNameNotBetween(String value1, String value2) {
            addCriterion("APLY_USER_NAME not between", value1, value2, "aplyUserName");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNull() {
            addCriterion("TEL_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIsNotNull() {
            addCriterion("TEL_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelPhoneEqualTo(String value) {
            addCriterion("TEL_PHONE =", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotEqualTo(String value) {
            addCriterion("TEL_PHONE <>", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThan(String value) {
            addCriterion("TEL_PHONE >", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_PHONE >=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThan(String value) {
            addCriterion("TEL_PHONE <", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLessThanOrEqualTo(String value) {
            addCriterion("TEL_PHONE <=", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneLike(String value) {
            addCriterion("TEL_PHONE like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotLike(String value) {
            addCriterion("TEL_PHONE not like", value, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneIn(List<String> values) {
            addCriterion("TEL_PHONE in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotIn(List<String> values) {
            addCriterion("TEL_PHONE not in", values, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneBetween(String value1, String value2) {
            addCriterion("TEL_PHONE between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andTelPhoneNotBetween(String value1, String value2) {
            addCriterion("TEL_PHONE not between", value1, value2, "telPhone");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("USER_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("USER_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("USER_GENDER =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("USER_GENDER <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("USER_GENDER >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GENDER >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("USER_GENDER <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("USER_GENDER <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("USER_GENDER like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("USER_GENDER not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("USER_GENDER in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("USER_GENDER not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("USER_GENDER between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("USER_GENDER not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdIsNull() {
            addCriterion("APLY_ABOARD_CD is null");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdIsNotNull() {
            addCriterion("APLY_ABOARD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdEqualTo(String value) {
            addCriterion("APLY_ABOARD_CD =", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdNotEqualTo(String value) {
            addCriterion("APLY_ABOARD_CD <>", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdGreaterThan(String value) {
            addCriterion("APLY_ABOARD_CD >", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_ABOARD_CD >=", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdLessThan(String value) {
            addCriterion("APLY_ABOARD_CD <", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdLessThanOrEqualTo(String value) {
            addCriterion("APLY_ABOARD_CD <=", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdLike(String value) {
            addCriterion("APLY_ABOARD_CD like", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdNotLike(String value) {
            addCriterion("APLY_ABOARD_CD not like", value, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdIn(List<String> values) {
            addCriterion("APLY_ABOARD_CD in", values, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdNotIn(List<String> values) {
            addCriterion("APLY_ABOARD_CD not in", values, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdBetween(String value1, String value2) {
            addCriterion("APLY_ABOARD_CD between", value1, value2, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardCdNotBetween(String value1, String value2) {
            addCriterion("APLY_ABOARD_CD not between", value1, value2, "aplyAboardCd");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameIsNull() {
            addCriterion("APLY_ABOARD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameIsNotNull() {
            addCriterion("APLY_ABOARD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameEqualTo(String value) {
            addCriterion("APLY_ABOARD_NAME =", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameNotEqualTo(String value) {
            addCriterion("APLY_ABOARD_NAME <>", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameGreaterThan(String value) {
            addCriterion("APLY_ABOARD_NAME >", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_ABOARD_NAME >=", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameLessThan(String value) {
            addCriterion("APLY_ABOARD_NAME <", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameLessThanOrEqualTo(String value) {
            addCriterion("APLY_ABOARD_NAME <=", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameLike(String value) {
            addCriterion("APLY_ABOARD_NAME like", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameNotLike(String value) {
            addCriterion("APLY_ABOARD_NAME not like", value, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameIn(List<String> values) {
            addCriterion("APLY_ABOARD_NAME in", values, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameNotIn(List<String> values) {
            addCriterion("APLY_ABOARD_NAME not in", values, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameBetween(String value1, String value2) {
            addCriterion("APLY_ABOARD_NAME between", value1, value2, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyAboardNameNotBetween(String value1, String value2) {
            addCriterion("APLY_ABOARD_NAME not between", value1, value2, "aplyAboardName");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkIsNull() {
            addCriterion("APLY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkIsNotNull() {
            addCriterion("APLY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkEqualTo(String value) {
            addCriterion("APLY_REMARK =", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkNotEqualTo(String value) {
            addCriterion("APLY_REMARK <>", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkGreaterThan(String value) {
            addCriterion("APLY_REMARK >", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_REMARK >=", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkLessThan(String value) {
            addCriterion("APLY_REMARK <", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkLessThanOrEqualTo(String value) {
            addCriterion("APLY_REMARK <=", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkLike(String value) {
            addCriterion("APLY_REMARK like", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkNotLike(String value) {
            addCriterion("APLY_REMARK not like", value, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkIn(List<String> values) {
            addCriterion("APLY_REMARK in", values, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkNotIn(List<String> values) {
            addCriterion("APLY_REMARK not in", values, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkBetween(String value1, String value2) {
            addCriterion("APLY_REMARK between", value1, value2, "aplyRemark");
            return (Criteria) this;
        }

        public Criteria andAplyRemarkNotBetween(String value1, String value2) {
            addCriterion("APLY_REMARK not between", value1, value2, "aplyRemark");
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