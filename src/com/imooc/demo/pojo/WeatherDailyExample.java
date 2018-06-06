package com.imooc.demo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherDailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeatherDailyExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andTextDayIsNull() {
            addCriterion("text_day is null");
            return (Criteria) this;
        }

        public Criteria andTextDayIsNotNull() {
            addCriterion("text_day is not null");
            return (Criteria) this;
        }

        public Criteria andTextDayEqualTo(String value) {
            addCriterion("text_day =", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayNotEqualTo(String value) {
            addCriterion("text_day <>", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayGreaterThan(String value) {
            addCriterion("text_day >", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayGreaterThanOrEqualTo(String value) {
            addCriterion("text_day >=", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayLessThan(String value) {
            addCriterion("text_day <", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayLessThanOrEqualTo(String value) {
            addCriterion("text_day <=", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayLike(String value) {
            addCriterion("text_day like", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayNotLike(String value) {
            addCriterion("text_day not like", value, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayIn(List<String> values) {
            addCriterion("text_day in", values, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayNotIn(List<String> values) {
            addCriterion("text_day not in", values, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayBetween(String value1, String value2) {
            addCriterion("text_day between", value1, value2, "textDay");
            return (Criteria) this;
        }

        public Criteria andTextDayNotBetween(String value1, String value2) {
            addCriterion("text_day not between", value1, value2, "textDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayIsNull() {
            addCriterion("code_day is null");
            return (Criteria) this;
        }

        public Criteria andCodeDayIsNotNull() {
            addCriterion("code_day is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDayEqualTo(String value) {
            addCriterion("code_day =", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayNotEqualTo(String value) {
            addCriterion("code_day <>", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayGreaterThan(String value) {
            addCriterion("code_day >", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayGreaterThanOrEqualTo(String value) {
            addCriterion("code_day >=", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayLessThan(String value) {
            addCriterion("code_day <", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayLessThanOrEqualTo(String value) {
            addCriterion("code_day <=", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayLike(String value) {
            addCriterion("code_day like", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayNotLike(String value) {
            addCriterion("code_day not like", value, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayIn(List<String> values) {
            addCriterion("code_day in", values, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayNotIn(List<String> values) {
            addCriterion("code_day not in", values, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayBetween(String value1, String value2) {
            addCriterion("code_day between", value1, value2, "codeDay");
            return (Criteria) this;
        }

        public Criteria andCodeDayNotBetween(String value1, String value2) {
            addCriterion("code_day not between", value1, value2, "codeDay");
            return (Criteria) this;
        }

        public Criteria andTextNightIsNull() {
            addCriterion("text_night is null");
            return (Criteria) this;
        }

        public Criteria andTextNightIsNotNull() {
            addCriterion("text_night is not null");
            return (Criteria) this;
        }

        public Criteria andTextNightEqualTo(String value) {
            addCriterion("text_night =", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightNotEqualTo(String value) {
            addCriterion("text_night <>", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightGreaterThan(String value) {
            addCriterion("text_night >", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightGreaterThanOrEqualTo(String value) {
            addCriterion("text_night >=", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightLessThan(String value) {
            addCriterion("text_night <", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightLessThanOrEqualTo(String value) {
            addCriterion("text_night <=", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightLike(String value) {
            addCriterion("text_night like", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightNotLike(String value) {
            addCriterion("text_night not like", value, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightIn(List<String> values) {
            addCriterion("text_night in", values, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightNotIn(List<String> values) {
            addCriterion("text_night not in", values, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightBetween(String value1, String value2) {
            addCriterion("text_night between", value1, value2, "textNight");
            return (Criteria) this;
        }

        public Criteria andTextNightNotBetween(String value1, String value2) {
            addCriterion("text_night not between", value1, value2, "textNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightIsNull() {
            addCriterion("code_night is null");
            return (Criteria) this;
        }

        public Criteria andCodeNightIsNotNull() {
            addCriterion("code_night is not null");
            return (Criteria) this;
        }

        public Criteria andCodeNightEqualTo(String value) {
            addCriterion("code_night =", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightNotEqualTo(String value) {
            addCriterion("code_night <>", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightGreaterThan(String value) {
            addCriterion("code_night >", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightGreaterThanOrEqualTo(String value) {
            addCriterion("code_night >=", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightLessThan(String value) {
            addCriterion("code_night <", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightLessThanOrEqualTo(String value) {
            addCriterion("code_night <=", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightLike(String value) {
            addCriterion("code_night like", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightNotLike(String value) {
            addCriterion("code_night not like", value, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightIn(List<String> values) {
            addCriterion("code_night in", values, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightNotIn(List<String> values) {
            addCriterion("code_night not in", values, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightBetween(String value1, String value2) {
            addCriterion("code_night between", value1, value2, "codeNight");
            return (Criteria) this;
        }

        public Criteria andCodeNightNotBetween(String value1, String value2) {
            addCriterion("code_night not between", value1, value2, "codeNight");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(String value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(String value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(String value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(String value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(String value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(String value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLike(String value) {
            addCriterion("high like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotLike(String value) {
            addCriterion("high not like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<String> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<String> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(String value1, String value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(String value1, String value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(String value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(String value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(String value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(String value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(String value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(String value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLike(String value) {
            addCriterion("low like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotLike(String value) {
            addCriterion("low not like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<String> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<String> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(String value1, String value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(String value1, String value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andPrecipIsNull() {
            addCriterion("precip is null");
            return (Criteria) this;
        }

        public Criteria andPrecipIsNotNull() {
            addCriterion("precip is not null");
            return (Criteria) this;
        }

        public Criteria andPrecipEqualTo(String value) {
            addCriterion("precip =", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipNotEqualTo(String value) {
            addCriterion("precip <>", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipGreaterThan(String value) {
            addCriterion("precip >", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipGreaterThanOrEqualTo(String value) {
            addCriterion("precip >=", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipLessThan(String value) {
            addCriterion("precip <", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipLessThanOrEqualTo(String value) {
            addCriterion("precip <=", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipLike(String value) {
            addCriterion("precip like", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipNotLike(String value) {
            addCriterion("precip not like", value, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipIn(List<String> values) {
            addCriterion("precip in", values, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipNotIn(List<String> values) {
            addCriterion("precip not in", values, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipBetween(String value1, String value2) {
            addCriterion("precip between", value1, value2, "precip");
            return (Criteria) this;
        }

        public Criteria andPrecipNotBetween(String value1, String value2) {
            addCriterion("precip not between", value1, value2, "precip");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNull() {
            addCriterion("wind_direction is null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNotNull() {
            addCriterion("wind_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionEqualTo(String value) {
            addCriterion("wind_direction =", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotEqualTo(String value) {
            addCriterion("wind_direction <>", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThan(String value) {
            addCriterion("wind_direction >", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("wind_direction >=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThan(String value) {
            addCriterion("wind_direction <", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThanOrEqualTo(String value) {
            addCriterion("wind_direction <=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLike(String value) {
            addCriterion("wind_direction like", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotLike(String value) {
            addCriterion("wind_direction not like", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIn(List<String> values) {
            addCriterion("wind_direction in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotIn(List<String> values) {
            addCriterion("wind_direction not in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionBetween(String value1, String value2) {
            addCriterion("wind_direction between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotBetween(String value1, String value2) {
            addCriterion("wind_direction not between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeIsNull() {
            addCriterion("wind_direction_degree is null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeIsNotNull() {
            addCriterion("wind_direction_degree is not null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeEqualTo(String value) {
            addCriterion("wind_direction_degree =", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeNotEqualTo(String value) {
            addCriterion("wind_direction_degree <>", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeGreaterThan(String value) {
            addCriterion("wind_direction_degree >", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("wind_direction_degree >=", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeLessThan(String value) {
            addCriterion("wind_direction_degree <", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeLessThanOrEqualTo(String value) {
            addCriterion("wind_direction_degree <=", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeLike(String value) {
            addCriterion("wind_direction_degree like", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeNotLike(String value) {
            addCriterion("wind_direction_degree not like", value, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeIn(List<String> values) {
            addCriterion("wind_direction_degree in", values, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeNotIn(List<String> values) {
            addCriterion("wind_direction_degree not in", values, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeBetween(String value1, String value2) {
            addCriterion("wind_direction_degree between", value1, value2, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindDirectionDegreeNotBetween(String value1, String value2) {
            addCriterion("wind_direction_degree not between", value1, value2, "windDirectionDegree");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNull() {
            addCriterion("wind_speed is null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNotNull() {
            addCriterion("wind_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedEqualTo(String value) {
            addCriterion("wind_speed =", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotEqualTo(String value) {
            addCriterion("wind_speed <>", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThan(String value) {
            addCriterion("wind_speed >", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("wind_speed >=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThan(String value) {
            addCriterion("wind_speed <", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThanOrEqualTo(String value) {
            addCriterion("wind_speed <=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLike(String value) {
            addCriterion("wind_speed like", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotLike(String value) {
            addCriterion("wind_speed not like", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIn(List<String> values) {
            addCriterion("wind_speed in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotIn(List<String> values) {
            addCriterion("wind_speed not in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedBetween(String value1, String value2) {
            addCriterion("wind_speed between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotBetween(String value1, String value2) {
            addCriterion("wind_speed not between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindScaleIsNull() {
            addCriterion("wind_scale is null");
            return (Criteria) this;
        }

        public Criteria andWindScaleIsNotNull() {
            addCriterion("wind_scale is not null");
            return (Criteria) this;
        }

        public Criteria andWindScaleEqualTo(String value) {
            addCriterion("wind_scale =", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleNotEqualTo(String value) {
            addCriterion("wind_scale <>", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleGreaterThan(String value) {
            addCriterion("wind_scale >", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleGreaterThanOrEqualTo(String value) {
            addCriterion("wind_scale >=", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleLessThan(String value) {
            addCriterion("wind_scale <", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleLessThanOrEqualTo(String value) {
            addCriterion("wind_scale <=", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleLike(String value) {
            addCriterion("wind_scale like", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleNotLike(String value) {
            addCriterion("wind_scale not like", value, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleIn(List<String> values) {
            addCriterion("wind_scale in", values, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleNotIn(List<String> values) {
            addCriterion("wind_scale not in", values, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleBetween(String value1, String value2) {
            addCriterion("wind_scale between", value1, value2, "windScale");
            return (Criteria) this;
        }

        public Criteria andWindScaleNotBetween(String value1, String value2) {
            addCriterion("wind_scale not between", value1, value2, "windScale");
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