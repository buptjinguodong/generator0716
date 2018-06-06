package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActiAplyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiAplyInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountIsNull() {
            addCriterion("APLY_USER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountIsNotNull() {
            addCriterion("APLY_USER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountEqualTo(Integer value) {
            addCriterion("APLY_USER_AMOUNT =", value, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountNotEqualTo(Integer value) {
            addCriterion("APLY_USER_AMOUNT <>", value, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountGreaterThan(Integer value) {
            addCriterion("APLY_USER_AMOUNT >", value, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("APLY_USER_AMOUNT >=", value, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountLessThan(Integer value) {
            addCriterion("APLY_USER_AMOUNT <", value, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountLessThanOrEqualTo(Integer value) {
            addCriterion("APLY_USER_AMOUNT <=", value, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountIn(List<Integer> values) {
            addCriterion("APLY_USER_AMOUNT in", values, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountNotIn(List<Integer> values) {
            addCriterion("APLY_USER_AMOUNT not in", values, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountBetween(Integer value1, Integer value2) {
            addCriterion("APLY_USER_AMOUNT between", value1, value2, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyUserAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("APLY_USER_AMOUNT not between", value1, value2, "aplyUserAmount");
            return (Criteria) this;
        }

        public Criteria andAplyTimeIsNull() {
            addCriterion("APLY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAplyTimeIsNotNull() {
            addCriterion("APLY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAplyTimeEqualTo(Date value) {
            addCriterion("APLY_TIME =", value, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeNotEqualTo(Date value) {
            addCriterion("APLY_TIME <>", value, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeGreaterThan(Date value) {
            addCriterion("APLY_TIME >", value, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APLY_TIME >=", value, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeLessThan(Date value) {
            addCriterion("APLY_TIME <", value, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("APLY_TIME <=", value, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeIn(List<Date> values) {
            addCriterion("APLY_TIME in", values, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeNotIn(List<Date> values) {
            addCriterion("APLY_TIME not in", values, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeBetween(Date value1, Date value2) {
            addCriterion("APLY_TIME between", value1, value2, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("APLY_TIME not between", value1, value2, "aplyTime");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalIsNull() {
            addCriterion("APLY_PRICE_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalIsNotNull() {
            addCriterion("APLY_PRICE_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalEqualTo(Integer value) {
            addCriterion("APLY_PRICE_TOTAL =", value, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalNotEqualTo(Integer value) {
            addCriterion("APLY_PRICE_TOTAL <>", value, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalGreaterThan(Integer value) {
            addCriterion("APLY_PRICE_TOTAL >", value, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("APLY_PRICE_TOTAL >=", value, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalLessThan(Integer value) {
            addCriterion("APLY_PRICE_TOTAL <", value, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalLessThanOrEqualTo(Integer value) {
            addCriterion("APLY_PRICE_TOTAL <=", value, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalIn(List<Integer> values) {
            addCriterion("APLY_PRICE_TOTAL in", values, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalNotIn(List<Integer> values) {
            addCriterion("APLY_PRICE_TOTAL not in", values, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalBetween(Integer value1, Integer value2) {
            addCriterion("APLY_PRICE_TOTAL between", value1, value2, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPriceTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("APLY_PRICE_TOTAL not between", value1, value2, "aplyPriceTotal");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreIsNull() {
            addCriterion("APLY_PRICE_PRE is null");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreIsNotNull() {
            addCriterion("APLY_PRICE_PRE is not null");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreEqualTo(Integer value) {
            addCriterion("APLY_PRICE_PRE =", value, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreNotEqualTo(Integer value) {
            addCriterion("APLY_PRICE_PRE <>", value, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreGreaterThan(Integer value) {
            addCriterion("APLY_PRICE_PRE >", value, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreGreaterThanOrEqualTo(Integer value) {
            addCriterion("APLY_PRICE_PRE >=", value, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreLessThan(Integer value) {
            addCriterion("APLY_PRICE_PRE <", value, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreLessThanOrEqualTo(Integer value) {
            addCriterion("APLY_PRICE_PRE <=", value, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreIn(List<Integer> values) {
            addCriterion("APLY_PRICE_PRE in", values, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreNotIn(List<Integer> values) {
            addCriterion("APLY_PRICE_PRE not in", values, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreBetween(Integer value1, Integer value2) {
            addCriterion("APLY_PRICE_PRE between", value1, value2, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyPricePreNotBetween(Integer value1, Integer value2) {
            addCriterion("APLY_PRICE_PRE not between", value1, value2, "aplyPricePre");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndIsNull() {
            addCriterion("APLY_REPORT_IND is null");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndIsNotNull() {
            addCriterion("APLY_REPORT_IND is not null");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndEqualTo(String value) {
            addCriterion("APLY_REPORT_IND =", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndNotEqualTo(String value) {
            addCriterion("APLY_REPORT_IND <>", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndGreaterThan(String value) {
            addCriterion("APLY_REPORT_IND >", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndGreaterThanOrEqualTo(String value) {
            addCriterion("APLY_REPORT_IND >=", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndLessThan(String value) {
            addCriterion("APLY_REPORT_IND <", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndLessThanOrEqualTo(String value) {
            addCriterion("APLY_REPORT_IND <=", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndLike(String value) {
            addCriterion("APLY_REPORT_IND like", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndNotLike(String value) {
            addCriterion("APLY_REPORT_IND not like", value, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndIn(List<String> values) {
            addCriterion("APLY_REPORT_IND in", values, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndNotIn(List<String> values) {
            addCriterion("APLY_REPORT_IND not in", values, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndBetween(String value1, String value2) {
            addCriterion("APLY_REPORT_IND between", value1, value2, "aplyReportInd");
            return (Criteria) this;
        }

        public Criteria andAplyReportIndNotBetween(String value1, String value2) {
            addCriterion("APLY_REPORT_IND not between", value1, value2, "aplyReportInd");
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