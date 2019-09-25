package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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

        public Criteria andSstateIsNull() {
            addCriterion("sstate is null");
            return (Criteria) this;
        }

        public Criteria andSstateIsNotNull() {
            addCriterion("sstate is not null");
            return (Criteria) this;
        }

        public Criteria andSstateEqualTo(String value) {
            addCriterion("sstate =", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotEqualTo(String value) {
            addCriterion("sstate <>", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThan(String value) {
            addCriterion("sstate >", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThanOrEqualTo(String value) {
            addCriterion("sstate >=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThan(String value) {
            addCriterion("sstate <", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThanOrEqualTo(String value) {
            addCriterion("sstate <=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLike(String value) {
            addCriterion("sstate like", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotLike(String value) {
            addCriterion("sstate not like", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateIn(List<String> values) {
            addCriterion("sstate in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotIn(List<String> values) {
            addCriterion("sstate not in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateBetween(String value1, String value2) {
            addCriterion("sstate between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotBetween(String value1, String value2) {
            addCriterion("sstate not between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSrowIsNull() {
            addCriterion("srow is null");
            return (Criteria) this;
        }

        public Criteria andSrowIsNotNull() {
            addCriterion("srow is not null");
            return (Criteria) this;
        }

        public Criteria andSrowEqualTo(String value) {
            addCriterion("srow =", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotEqualTo(String value) {
            addCriterion("srow <>", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowGreaterThan(String value) {
            addCriterion("srow >", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowGreaterThanOrEqualTo(String value) {
            addCriterion("srow >=", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowLessThan(String value) {
            addCriterion("srow <", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowLessThanOrEqualTo(String value) {
            addCriterion("srow <=", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowLike(String value) {
            addCriterion("srow like", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotLike(String value) {
            addCriterion("srow not like", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowIn(List<String> values) {
            addCriterion("srow in", values, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotIn(List<String> values) {
            addCriterion("srow not in", values, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowBetween(String value1, String value2) {
            addCriterion("srow between", value1, value2, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotBetween(String value1, String value2) {
            addCriterion("srow not between", value1, value2, "srow");
            return (Criteria) this;
        }

        public Criteria andScolumnIsNull() {
            addCriterion("scolumn is null");
            return (Criteria) this;
        }

        public Criteria andScolumnIsNotNull() {
            addCriterion("scolumn is not null");
            return (Criteria) this;
        }

        public Criteria andScolumnEqualTo(String value) {
            addCriterion("scolumn =", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotEqualTo(String value) {
            addCriterion("scolumn <>", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnGreaterThan(String value) {
            addCriterion("scolumn >", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnGreaterThanOrEqualTo(String value) {
            addCriterion("scolumn >=", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnLessThan(String value) {
            addCriterion("scolumn <", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnLessThanOrEqualTo(String value) {
            addCriterion("scolumn <=", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnLike(String value) {
            addCriterion("scolumn like", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotLike(String value) {
            addCriterion("scolumn not like", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnIn(List<String> values) {
            addCriterion("scolumn in", values, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotIn(List<String> values) {
            addCriterion("scolumn not in", values, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnBetween(String value1, String value2) {
            addCriterion("scolumn between", value1, value2, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotBetween(String value1, String value2) {
            addCriterion("scolumn not between", value1, value2, "scolumn");
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