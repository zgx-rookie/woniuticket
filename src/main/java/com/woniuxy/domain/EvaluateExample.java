package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class EvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaluateExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("etime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("etime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(String value) {
            addCriterion("etime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(String value) {
            addCriterion("etime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(String value) {
            addCriterion("etime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(String value) {
            addCriterion("etime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(String value) {
            addCriterion("etime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(String value) {
            addCriterion("etime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLike(String value) {
            addCriterion("etime like", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotLike(String value) {
            addCriterion("etime not like", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<String> values) {
            addCriterion("etime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<String> values) {
            addCriterion("etime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(String value1, String value2) {
            addCriterion("etime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(String value1, String value2) {
            addCriterion("etime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEstarIsNull() {
            addCriterion("estar is null");
            return (Criteria) this;
        }

        public Criteria andEstarIsNotNull() {
            addCriterion("estar is not null");
            return (Criteria) this;
        }

        public Criteria andEstarEqualTo(Integer value) {
            addCriterion("estar =", value, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarNotEqualTo(Integer value) {
            addCriterion("estar <>", value, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarGreaterThan(Integer value) {
            addCriterion("estar >", value, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarGreaterThanOrEqualTo(Integer value) {
            addCriterion("estar >=", value, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarLessThan(Integer value) {
            addCriterion("estar <", value, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarLessThanOrEqualTo(Integer value) {
            addCriterion("estar <=", value, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarIn(List<Integer> values) {
            addCriterion("estar in", values, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarNotIn(List<Integer> values) {
            addCriterion("estar not in", values, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarBetween(Integer value1, Integer value2) {
            addCriterion("estar between", value1, value2, "estar");
            return (Criteria) this;
        }

        public Criteria andEstarNotBetween(Integer value1, Integer value2) {
            addCriterion("estar not between", value1, value2, "estar");
            return (Criteria) this;
        }

        public Criteria andEcontextIsNull() {
            addCriterion("econtext is null");
            return (Criteria) this;
        }

        public Criteria andEcontextIsNotNull() {
            addCriterion("econtext is not null");
            return (Criteria) this;
        }

        public Criteria andEcontextEqualTo(String value) {
            addCriterion("econtext =", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextNotEqualTo(String value) {
            addCriterion("econtext <>", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextGreaterThan(String value) {
            addCriterion("econtext >", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextGreaterThanOrEqualTo(String value) {
            addCriterion("econtext >=", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextLessThan(String value) {
            addCriterion("econtext <", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextLessThanOrEqualTo(String value) {
            addCriterion("econtext <=", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextLike(String value) {
            addCriterion("econtext like", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextNotLike(String value) {
            addCriterion("econtext not like", value, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextIn(List<String> values) {
            addCriterion("econtext in", values, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextNotIn(List<String> values) {
            addCriterion("econtext not in", values, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextBetween(String value1, String value2) {
            addCriterion("econtext between", value1, value2, "econtext");
            return (Criteria) this;
        }

        public Criteria andEcontextNotBetween(String value1, String value2) {
            addCriterion("econtext not between", value1, value2, "econtext");
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