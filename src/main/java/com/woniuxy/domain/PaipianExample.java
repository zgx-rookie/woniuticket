package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class PaipianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaipianExample() {
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

        public Criteria andPpidIsNull() {
            addCriterion("ppid is null");
            return (Criteria) this;
        }

        public Criteria andPpidIsNotNull() {
            addCriterion("ppid is not null");
            return (Criteria) this;
        }

        public Criteria andPpidEqualTo(Integer value) {
            addCriterion("ppid =", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotEqualTo(Integer value) {
            addCriterion("ppid <>", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThan(Integer value) {
            addCriterion("ppid >", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppid >=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThan(Integer value) {
            addCriterion("ppid <", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidLessThanOrEqualTo(Integer value) {
            addCriterion("ppid <=", value, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidIn(List<Integer> values) {
            addCriterion("ppid in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotIn(List<Integer> values) {
            addCriterion("ppid not in", values, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidBetween(Integer value1, Integer value2) {
            addCriterion("ppid between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andPpidNotBetween(Integer value1, Integer value2) {
            addCriterion("ppid not between", value1, value2, "ppid");
            return (Criteria) this;
        }

        public Criteria andMovidIsNull() {
            addCriterion("movid is null");
            return (Criteria) this;
        }

        public Criteria andMovidIsNotNull() {
            addCriterion("movid is not null");
            return (Criteria) this;
        }

        public Criteria andMovidEqualTo(Integer value) {
            addCriterion("movid =", value, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidNotEqualTo(Integer value) {
            addCriterion("movid <>", value, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidGreaterThan(Integer value) {
            addCriterion("movid >", value, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidGreaterThanOrEqualTo(Integer value) {
            addCriterion("movid >=", value, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidLessThan(Integer value) {
            addCriterion("movid <", value, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidLessThanOrEqualTo(Integer value) {
            addCriterion("movid <=", value, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidIn(List<Integer> values) {
            addCriterion("movid in", values, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidNotIn(List<Integer> values) {
            addCriterion("movid not in", values, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidBetween(Integer value1, Integer value2) {
            addCriterion("movid between", value1, value2, "movid");
            return (Criteria) this;
        }

        public Criteria andMovidNotBetween(Integer value1, Integer value2) {
            addCriterion("movid not between", value1, value2, "movid");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andPpstartIsNull() {
            addCriterion("ppstart is null");
            return (Criteria) this;
        }

        public Criteria andPpstartIsNotNull() {
            addCriterion("ppstart is not null");
            return (Criteria) this;
        }

        public Criteria andPpstartEqualTo(String value) {
            addCriterion("ppstart =", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartNotEqualTo(String value) {
            addCriterion("ppstart <>", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartGreaterThan(String value) {
            addCriterion("ppstart >", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartGreaterThanOrEqualTo(String value) {
            addCriterion("ppstart >=", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartLessThan(String value) {
            addCriterion("ppstart <", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartLessThanOrEqualTo(String value) {
            addCriterion("ppstart <=", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartLike(String value) {
            addCriterion("ppstart like", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartNotLike(String value) {
            addCriterion("ppstart not like", value, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartIn(List<String> values) {
            addCriterion("ppstart in", values, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartNotIn(List<String> values) {
            addCriterion("ppstart not in", values, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartBetween(String value1, String value2) {
            addCriterion("ppstart between", value1, value2, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpstartNotBetween(String value1, String value2) {
            addCriterion("ppstart not between", value1, value2, "ppstart");
            return (Criteria) this;
        }

        public Criteria andPpendIsNull() {
            addCriterion("ppend is null");
            return (Criteria) this;
        }

        public Criteria andPpendIsNotNull() {
            addCriterion("ppend is not null");
            return (Criteria) this;
        }

        public Criteria andPpendEqualTo(Integer value) {
            addCriterion("ppend =", value, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendNotEqualTo(Integer value) {
            addCriterion("ppend <>", value, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendGreaterThan(Integer value) {
            addCriterion("ppend >", value, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendGreaterThanOrEqualTo(Integer value) {
            addCriterion("ppend >=", value, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendLessThan(Integer value) {
            addCriterion("ppend <", value, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendLessThanOrEqualTo(Integer value) {
            addCriterion("ppend <=", value, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendIn(List<Integer> values) {
            addCriterion("ppend in", values, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendNotIn(List<Integer> values) {
            addCriterion("ppend not in", values, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendBetween(Integer value1, Integer value2) {
            addCriterion("ppend between", value1, value2, "ppend");
            return (Criteria) this;
        }

        public Criteria andPpendNotBetween(Integer value1, Integer value2) {
            addCriterion("ppend not between", value1, value2, "ppend");
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