package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeatherLocationExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNull() {
            addCriterion("timezone is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIsNotNull() {
            addCriterion("timezone is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneEqualTo(String value) {
            addCriterion("timezone =", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotEqualTo(String value) {
            addCriterion("timezone <>", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThan(String value) {
            addCriterion("timezone >", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneGreaterThanOrEqualTo(String value) {
            addCriterion("timezone >=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThan(String value) {
            addCriterion("timezone <", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLessThanOrEqualTo(String value) {
            addCriterion("timezone <=", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneLike(String value) {
            addCriterion("timezone like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotLike(String value) {
            addCriterion("timezone not like", value, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneIn(List<String> values) {
            addCriterion("timezone in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotIn(List<String> values) {
            addCriterion("timezone not in", values, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneBetween(String value1, String value2) {
            addCriterion("timezone between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneNotBetween(String value1, String value2) {
            addCriterion("timezone not between", value1, value2, "timezone");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetIsNull() {
            addCriterion("timezone_offset is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetIsNotNull() {
            addCriterion("timezone_offset is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetEqualTo(String value) {
            addCriterion("timezone_offset =", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetNotEqualTo(String value) {
            addCriterion("timezone_offset <>", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetGreaterThan(String value) {
            addCriterion("timezone_offset >", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetGreaterThanOrEqualTo(String value) {
            addCriterion("timezone_offset >=", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetLessThan(String value) {
            addCriterion("timezone_offset <", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetLessThanOrEqualTo(String value) {
            addCriterion("timezone_offset <=", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetLike(String value) {
            addCriterion("timezone_offset like", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetNotLike(String value) {
            addCriterion("timezone_offset not like", value, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetIn(List<String> values) {
            addCriterion("timezone_offset in", values, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetNotIn(List<String> values) {
            addCriterion("timezone_offset not in", values, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetBetween(String value1, String value2) {
            addCriterion("timezone_offset between", value1, value2, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andTimezoneOffsetNotBetween(String value1, String value2) {
            addCriterion("timezone_offset not between", value1, value2, "timezoneOffset");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdIsNull() {
            addCriterion("multi_tenancy_id is null");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdIsNotNull() {
            addCriterion("multi_tenancy_id is not null");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdEqualTo(String value) {
            addCriterion("multi_tenancy_id =", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdNotEqualTo(String value) {
            addCriterion("multi_tenancy_id <>", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdGreaterThan(String value) {
            addCriterion("multi_tenancy_id >", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdGreaterThanOrEqualTo(String value) {
            addCriterion("multi_tenancy_id >=", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdLessThan(String value) {
            addCriterion("multi_tenancy_id <", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdLessThanOrEqualTo(String value) {
            addCriterion("multi_tenancy_id <=", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdLike(String value) {
            addCriterion("multi_tenancy_id like", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdNotLike(String value) {
            addCriterion("multi_tenancy_id not like", value, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdIn(List<String> values) {
            addCriterion("multi_tenancy_id in", values, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdNotIn(List<String> values) {
            addCriterion("multi_tenancy_id not in", values, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdBetween(String value1, String value2) {
            addCriterion("multi_tenancy_id between", value1, value2, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andMultiTenancyIdNotBetween(String value1, String value2) {
            addCriterion("multi_tenancy_id not between", value1, value2, "multiTenancyId");
            return (Criteria) this;
        }

        public Criteria andVnoIsNull() {
            addCriterion("vno is null");
            return (Criteria) this;
        }

        public Criteria andVnoIsNotNull() {
            addCriterion("vno is not null");
            return (Criteria) this;
        }

        public Criteria andVnoEqualTo(Integer value) {
            addCriterion("vno =", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotEqualTo(Integer value) {
            addCriterion("vno <>", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThan(Integer value) {
            addCriterion("vno >", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("vno >=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThan(Integer value) {
            addCriterion("vno <", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoLessThanOrEqualTo(Integer value) {
            addCriterion("vno <=", value, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoIn(List<Integer> values) {
            addCriterion("vno in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotIn(List<Integer> values) {
            addCriterion("vno not in", values, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoBetween(Integer value1, Integer value2) {
            addCriterion("vno between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andVnoNotBetween(Integer value1, Integer value2) {
            addCriterion("vno not between", value1, value2, "vno");
            return (Criteria) this;
        }

        public Criteria andTmsIsNull() {
            addCriterion("tms is null");
            return (Criteria) this;
        }

        public Criteria andTmsIsNotNull() {
            addCriterion("tms is not null");
            return (Criteria) this;
        }

        public Criteria andTmsEqualTo(Date value) {
            addCriterion("tms =", value, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsNotEqualTo(Date value) {
            addCriterion("tms <>", value, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsGreaterThan(Date value) {
            addCriterion("tms >", value, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsGreaterThanOrEqualTo(Date value) {
            addCriterion("tms >=", value, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsLessThan(Date value) {
            addCriterion("tms <", value, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsLessThanOrEqualTo(Date value) {
            addCriterion("tms <=", value, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsIn(List<Date> values) {
            addCriterion("tms in", values, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsNotIn(List<Date> values) {
            addCriterion("tms not in", values, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsBetween(Date value1, Date value2) {
            addCriterion("tms between", value1, value2, "tms");
            return (Criteria) this;
        }

        public Criteria andTmsNotBetween(Date value1, Date value2) {
            addCriterion("tms not between", value1, value2, "tms");
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