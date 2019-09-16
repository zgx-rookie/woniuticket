package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUsaltIsNull() {
            addCriterion("usalt is null");
            return (Criteria) this;
        }

        public Criteria andUsaltIsNotNull() {
            addCriterion("usalt is not null");
            return (Criteria) this;
        }

        public Criteria andUsaltEqualTo(String value) {
            addCriterion("usalt =", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltNotEqualTo(String value) {
            addCriterion("usalt <>", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltGreaterThan(String value) {
            addCriterion("usalt >", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltGreaterThanOrEqualTo(String value) {
            addCriterion("usalt >=", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltLessThan(String value) {
            addCriterion("usalt <", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltLessThanOrEqualTo(String value) {
            addCriterion("usalt <=", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltLike(String value) {
            addCriterion("usalt like", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltNotLike(String value) {
            addCriterion("usalt not like", value, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltIn(List<String> values) {
            addCriterion("usalt in", values, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltNotIn(List<String> values) {
            addCriterion("usalt not in", values, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltBetween(String value1, String value2) {
            addCriterion("usalt between", value1, value2, "usalt");
            return (Criteria) this;
        }

        public Criteria andUsaltNotBetween(String value1, String value2) {
            addCriterion("usalt not between", value1, value2, "usalt");
            return (Criteria) this;
        }

        public Criteria andUmailIsNull() {
            addCriterion("umail is null");
            return (Criteria) this;
        }

        public Criteria andUmailIsNotNull() {
            addCriterion("umail is not null");
            return (Criteria) this;
        }

        public Criteria andUmailEqualTo(String value) {
            addCriterion("umail =", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotEqualTo(String value) {
            addCriterion("umail <>", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailGreaterThan(String value) {
            addCriterion("umail >", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailGreaterThanOrEqualTo(String value) {
            addCriterion("umail >=", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailLessThan(String value) {
            addCriterion("umail <", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailLessThanOrEqualTo(String value) {
            addCriterion("umail <=", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailLike(String value) {
            addCriterion("umail like", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotLike(String value) {
            addCriterion("umail not like", value, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailIn(List<String> values) {
            addCriterion("umail in", values, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotIn(List<String> values) {
            addCriterion("umail not in", values, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailBetween(String value1, String value2) {
            addCriterion("umail between", value1, value2, "umail");
            return (Criteria) this;
        }

        public Criteria andUmailNotBetween(String value1, String value2) {
            addCriterion("umail not between", value1, value2, "umail");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUsexIsNull() {
            addCriterion("usex is null");
            return (Criteria) this;
        }

        public Criteria andUsexIsNotNull() {
            addCriterion("usex is not null");
            return (Criteria) this;
        }

        public Criteria andUsexEqualTo(String value) {
            addCriterion("usex =", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotEqualTo(String value) {
            addCriterion("usex <>", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThan(String value) {
            addCriterion("usex >", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexGreaterThanOrEqualTo(String value) {
            addCriterion("usex >=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThan(String value) {
            addCriterion("usex <", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLessThanOrEqualTo(String value) {
            addCriterion("usex <=", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexLike(String value) {
            addCriterion("usex like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotLike(String value) {
            addCriterion("usex not like", value, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexIn(List<String> values) {
            addCriterion("usex in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotIn(List<String> values) {
            addCriterion("usex not in", values, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexBetween(String value1, String value2) {
            addCriterion("usex between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUsexNotBetween(String value1, String value2) {
            addCriterion("usex not between", value1, value2, "usex");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIsNull() {
            addCriterion("ubirthday is null");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIsNotNull() {
            addCriterion("ubirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday =", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday <>", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("ubirthday >", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday >=", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("ubirthday <", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday <=", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("ubirthday in", values, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("ubirthday not in", values, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ubirthday between", value1, value2, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ubirthday not between", value1, value2, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbalanceIsNull() {
            addCriterion("ubalance is null");
            return (Criteria) this;
        }

        public Criteria andUbalanceIsNotNull() {
            addCriterion("ubalance is not null");
            return (Criteria) this;
        }

        public Criteria andUbalanceEqualTo(Double value) {
            addCriterion("ubalance =", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceNotEqualTo(Double value) {
            addCriterion("ubalance <>", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceGreaterThan(Double value) {
            addCriterion("ubalance >", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("ubalance >=", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceLessThan(Double value) {
            addCriterion("ubalance <", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceLessThanOrEqualTo(Double value) {
            addCriterion("ubalance <=", value, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceIn(List<Double> values) {
            addCriterion("ubalance in", values, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceNotIn(List<Double> values) {
            addCriterion("ubalance not in", values, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceBetween(Double value1, Double value2) {
            addCriterion("ubalance between", value1, value2, "ubalance");
            return (Criteria) this;
        }

        public Criteria andUbalanceNotBetween(Double value1, Double value2) {
            addCriterion("ubalance not between", value1, value2, "ubalance");
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