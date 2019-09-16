package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class ViptableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ViptableExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVgradeIsNull() {
            addCriterion("vgrade is null");
            return (Criteria) this;
        }

        public Criteria andVgradeIsNotNull() {
            addCriterion("vgrade is not null");
            return (Criteria) this;
        }

        public Criteria andVgradeEqualTo(String value) {
            addCriterion("vgrade =", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeNotEqualTo(String value) {
            addCriterion("vgrade <>", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeGreaterThan(String value) {
            addCriterion("vgrade >", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeGreaterThanOrEqualTo(String value) {
            addCriterion("vgrade >=", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeLessThan(String value) {
            addCriterion("vgrade <", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeLessThanOrEqualTo(String value) {
            addCriterion("vgrade <=", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeLike(String value) {
            addCriterion("vgrade like", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeNotLike(String value) {
            addCriterion("vgrade not like", value, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeIn(List<String> values) {
            addCriterion("vgrade in", values, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeNotIn(List<String> values) {
            addCriterion("vgrade not in", values, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeBetween(String value1, String value2) {
            addCriterion("vgrade between", value1, value2, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVgradeNotBetween(String value1, String value2) {
            addCriterion("vgrade not between", value1, value2, "vgrade");
            return (Criteria) this;
        }

        public Criteria andVdiscountIsNull() {
            addCriterion("vdiscount is null");
            return (Criteria) this;
        }

        public Criteria andVdiscountIsNotNull() {
            addCriterion("vdiscount is not null");
            return (Criteria) this;
        }

        public Criteria andVdiscountEqualTo(Double value) {
            addCriterion("vdiscount =", value, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountNotEqualTo(Double value) {
            addCriterion("vdiscount <>", value, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountGreaterThan(Double value) {
            addCriterion("vdiscount >", value, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("vdiscount >=", value, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountLessThan(Double value) {
            addCriterion("vdiscount <", value, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountLessThanOrEqualTo(Double value) {
            addCriterion("vdiscount <=", value, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountIn(List<Double> values) {
            addCriterion("vdiscount in", values, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountNotIn(List<Double> values) {
            addCriterion("vdiscount not in", values, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountBetween(Double value1, Double value2) {
            addCriterion("vdiscount between", value1, value2, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andVdiscountNotBetween(Double value1, Double value2) {
            addCriterion("vdiscount not between", value1, value2, "vdiscount");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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