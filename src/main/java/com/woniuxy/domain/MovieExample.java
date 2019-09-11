package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMinfoIsNull() {
            addCriterion("minfo is null");
            return (Criteria) this;
        }

        public Criteria andMinfoIsNotNull() {
            addCriterion("minfo is not null");
            return (Criteria) this;
        }

        public Criteria andMinfoEqualTo(String value) {
            addCriterion("minfo =", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotEqualTo(String value) {
            addCriterion("minfo <>", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoGreaterThan(String value) {
            addCriterion("minfo >", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoGreaterThanOrEqualTo(String value) {
            addCriterion("minfo >=", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoLessThan(String value) {
            addCriterion("minfo <", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoLessThanOrEqualTo(String value) {
            addCriterion("minfo <=", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoLike(String value) {
            addCriterion("minfo like", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotLike(String value) {
            addCriterion("minfo not like", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoIn(List<String> values) {
            addCriterion("minfo in", values, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotIn(List<String> values) {
            addCriterion("minfo not in", values, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoBetween(String value1, String value2) {
            addCriterion("minfo between", value1, value2, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotBetween(String value1, String value2) {
            addCriterion("minfo not between", value1, value2, "minfo");
            return (Criteria) this;
        }

        public Criteria andMroleIsNull() {
            addCriterion("mrole is null");
            return (Criteria) this;
        }

        public Criteria andMroleIsNotNull() {
            addCriterion("mrole is not null");
            return (Criteria) this;
        }

        public Criteria andMroleEqualTo(String value) {
            addCriterion("mrole =", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleNotEqualTo(String value) {
            addCriterion("mrole <>", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleGreaterThan(String value) {
            addCriterion("mrole >", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleGreaterThanOrEqualTo(String value) {
            addCriterion("mrole >=", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleLessThan(String value) {
            addCriterion("mrole <", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleLessThanOrEqualTo(String value) {
            addCriterion("mrole <=", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleLike(String value) {
            addCriterion("mrole like", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleNotLike(String value) {
            addCriterion("mrole not like", value, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleIn(List<String> values) {
            addCriterion("mrole in", values, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleNotIn(List<String> values) {
            addCriterion("mrole not in", values, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleBetween(String value1, String value2) {
            addCriterion("mrole between", value1, value2, "mrole");
            return (Criteria) this;
        }

        public Criteria andMroleNotBetween(String value1, String value2) {
            addCriterion("mrole not between", value1, value2, "mrole");
            return (Criteria) this;
        }

        public Criteria andMdirectorIsNull() {
            addCriterion("mdirector is null");
            return (Criteria) this;
        }

        public Criteria andMdirectorIsNotNull() {
            addCriterion("mdirector is not null");
            return (Criteria) this;
        }

        public Criteria andMdirectorEqualTo(String value) {
            addCriterion("mdirector =", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotEqualTo(String value) {
            addCriterion("mdirector <>", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorGreaterThan(String value) {
            addCriterion("mdirector >", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorGreaterThanOrEqualTo(String value) {
            addCriterion("mdirector >=", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorLessThan(String value) {
            addCriterion("mdirector <", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorLessThanOrEqualTo(String value) {
            addCriterion("mdirector <=", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorLike(String value) {
            addCriterion("mdirector like", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotLike(String value) {
            addCriterion("mdirector not like", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorIn(List<String> values) {
            addCriterion("mdirector in", values, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotIn(List<String> values) {
            addCriterion("mdirector not in", values, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorBetween(String value1, String value2) {
            addCriterion("mdirector between", value1, value2, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotBetween(String value1, String value2) {
            addCriterion("mdirector not between", value1, value2, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdurationIsNull() {
            addCriterion("mduration is null");
            return (Criteria) this;
        }

        public Criteria andMdurationIsNotNull() {
            addCriterion("mduration is not null");
            return (Criteria) this;
        }

        public Criteria andMdurationEqualTo(String value) {
            addCriterion("mduration =", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationNotEqualTo(String value) {
            addCriterion("mduration <>", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationGreaterThan(String value) {
            addCriterion("mduration >", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationGreaterThanOrEqualTo(String value) {
            addCriterion("mduration >=", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationLessThan(String value) {
            addCriterion("mduration <", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationLessThanOrEqualTo(String value) {
            addCriterion("mduration <=", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationLike(String value) {
            addCriterion("mduration like", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationNotLike(String value) {
            addCriterion("mduration not like", value, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationIn(List<String> values) {
            addCriterion("mduration in", values, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationNotIn(List<String> values) {
            addCriterion("mduration not in", values, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationBetween(String value1, String value2) {
            addCriterion("mduration between", value1, value2, "mduration");
            return (Criteria) this;
        }

        public Criteria andMdurationNotBetween(String value1, String value2) {
            addCriterion("mduration not between", value1, value2, "mduration");
            return (Criteria) this;
        }

        public Criteria andMshowtimeIsNull() {
            addCriterion("mshowtime is null");
            return (Criteria) this;
        }

        public Criteria andMshowtimeIsNotNull() {
            addCriterion("mshowtime is not null");
            return (Criteria) this;
        }

        public Criteria andMshowtimeEqualTo(Date value) {
            addCriterionForJDBCDate("mshowtime =", value, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("mshowtime <>", value, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("mshowtime >", value, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mshowtime >=", value, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeLessThan(Date value) {
            addCriterionForJDBCDate("mshowtime <", value, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mshowtime <=", value, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeIn(List<Date> values) {
            addCriterionForJDBCDate("mshowtime in", values, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("mshowtime not in", values, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mshowtime between", value1, value2, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMshowtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mshowtime not between", value1, value2, "mshowtime");
            return (Criteria) this;
        }

        public Criteria andMprevueIsNull() {
            addCriterion("mprevue is null");
            return (Criteria) this;
        }

        public Criteria andMprevueIsNotNull() {
            addCriterion("mprevue is not null");
            return (Criteria) this;
        }

        public Criteria andMprevueEqualTo(String value) {
            addCriterion("mprevue =", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueNotEqualTo(String value) {
            addCriterion("mprevue <>", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueGreaterThan(String value) {
            addCriterion("mprevue >", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueGreaterThanOrEqualTo(String value) {
            addCriterion("mprevue >=", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueLessThan(String value) {
            addCriterion("mprevue <", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueLessThanOrEqualTo(String value) {
            addCriterion("mprevue <=", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueLike(String value) {
            addCriterion("mprevue like", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueNotLike(String value) {
            addCriterion("mprevue not like", value, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueIn(List<String> values) {
            addCriterion("mprevue in", values, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueNotIn(List<String> values) {
            addCriterion("mprevue not in", values, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueBetween(String value1, String value2) {
            addCriterion("mprevue between", value1, value2, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMprevueNotBetween(String value1, String value2) {
            addCriterion("mprevue not between", value1, value2, "mprevue");
            return (Criteria) this;
        }

        public Criteria andMposterIsNull() {
            addCriterion("mposter is null");
            return (Criteria) this;
        }

        public Criteria andMposterIsNotNull() {
            addCriterion("mposter is not null");
            return (Criteria) this;
        }

        public Criteria andMposterEqualTo(String value) {
            addCriterion("mposter =", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterNotEqualTo(String value) {
            addCriterion("mposter <>", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterGreaterThan(String value) {
            addCriterion("mposter >", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterGreaterThanOrEqualTo(String value) {
            addCriterion("mposter >=", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterLessThan(String value) {
            addCriterion("mposter <", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterLessThanOrEqualTo(String value) {
            addCriterion("mposter <=", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterLike(String value) {
            addCriterion("mposter like", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterNotLike(String value) {
            addCriterion("mposter not like", value, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterIn(List<String> values) {
            addCriterion("mposter in", values, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterNotIn(List<String> values) {
            addCriterion("mposter not in", values, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterBetween(String value1, String value2) {
            addCriterion("mposter between", value1, value2, "mposter");
            return (Criteria) this;
        }

        public Criteria andMposterNotBetween(String value1, String value2) {
            addCriterion("mposter not between", value1, value2, "mposter");
            return (Criteria) this;
        }

        public Criteria andMpriceIsNull() {
            addCriterion("mprice is null");
            return (Criteria) this;
        }

        public Criteria andMpriceIsNotNull() {
            addCriterion("mprice is not null");
            return (Criteria) this;
        }

        public Criteria andMpriceEqualTo(Double value) {
            addCriterion("mprice =", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotEqualTo(Double value) {
            addCriterion("mprice <>", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceGreaterThan(Double value) {
            addCriterion("mprice >", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("mprice >=", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceLessThan(Double value) {
            addCriterion("mprice <", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceLessThanOrEqualTo(Double value) {
            addCriterion("mprice <=", value, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceIn(List<Double> values) {
            addCriterion("mprice in", values, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotIn(List<Double> values) {
            addCriterion("mprice not in", values, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceBetween(Double value1, Double value2) {
            addCriterion("mprice between", value1, value2, "mprice");
            return (Criteria) this;
        }

        public Criteria andMpriceNotBetween(Double value1, Double value2) {
            addCriterion("mprice not between", value1, value2, "mprice");
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