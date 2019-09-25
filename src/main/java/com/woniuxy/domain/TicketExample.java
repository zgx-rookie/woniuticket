package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
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

        public Criteria andSrowEqualTo(Integer value) {
            addCriterion("srow =", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotEqualTo(Integer value) {
            addCriterion("srow <>", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowGreaterThan(Integer value) {
            addCriterion("srow >", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowGreaterThanOrEqualTo(Integer value) {
            addCriterion("srow >=", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowLessThan(Integer value) {
            addCriterion("srow <", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowLessThanOrEqualTo(Integer value) {
            addCriterion("srow <=", value, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowIn(List<Integer> values) {
            addCriterion("srow in", values, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotIn(List<Integer> values) {
            addCriterion("srow not in", values, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowBetween(Integer value1, Integer value2) {
            addCriterion("srow between", value1, value2, "srow");
            return (Criteria) this;
        }

        public Criteria andSrowNotBetween(Integer value1, Integer value2) {
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

        public Criteria andScolumnEqualTo(Integer value) {
            addCriterion("scolumn =", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotEqualTo(Integer value) {
            addCriterion("scolumn <>", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnGreaterThan(Integer value) {
            addCriterion("scolumn >", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnGreaterThanOrEqualTo(Integer value) {
            addCriterion("scolumn >=", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnLessThan(Integer value) {
            addCriterion("scolumn <", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnLessThanOrEqualTo(Integer value) {
            addCriterion("scolumn <=", value, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnIn(List<Integer> values) {
            addCriterion("scolumn in", values, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotIn(List<Integer> values) {
            addCriterion("scolumn not in", values, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnBetween(Integer value1, Integer value2) {
            addCriterion("scolumn between", value1, value2, "scolumn");
            return (Criteria) this;
        }

        public Criteria andScolumnNotBetween(Integer value1, Integer value2) {
            addCriterion("scolumn not between", value1, value2, "scolumn");
            return (Criteria) this;
        }

        public Criteria andTpriceIsNull() {
            addCriterion("tprice is null");
            return (Criteria) this;
        }

        public Criteria andTpriceIsNotNull() {
            addCriterion("tprice is not null");
            return (Criteria) this;
        }

        public Criteria andTpriceEqualTo(Double value) {
            addCriterion("tprice =", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotEqualTo(Double value) {
            addCriterion("tprice <>", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceGreaterThan(Double value) {
            addCriterion("tprice >", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tprice >=", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceLessThan(Double value) {
            addCriterion("tprice <", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceLessThanOrEqualTo(Double value) {
            addCriterion("tprice <=", value, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceIn(List<Double> values) {
            addCriterion("tprice in", values, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotIn(List<Double> values) {
            addCriterion("tprice not in", values, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceBetween(Double value1, Double value2) {
            addCriterion("tprice between", value1, value2, "tprice");
            return (Criteria) this;
        }

        public Criteria andTpriceNotBetween(Double value1, Double value2) {
            addCriterion("tprice not between", value1, value2, "tprice");
            return (Criteria) this;
        }

        public Criteria andTreservetimeIsNull() {
            addCriterion("treservetime is null");
            return (Criteria) this;
        }

        public Criteria andTreservetimeIsNotNull() {
            addCriterion("treservetime is not null");
            return (Criteria) this;
        }

        public Criteria andTreservetimeEqualTo(Date value) {
            addCriterionForJDBCDate("treservetime =", value, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("treservetime <>", value, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("treservetime >", value, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("treservetime >=", value, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeLessThan(Date value) {
            addCriterionForJDBCDate("treservetime <", value, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("treservetime <=", value, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeIn(List<Date> values) {
            addCriterionForJDBCDate("treservetime in", values, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("treservetime not in", values, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("treservetime between", value1, value2, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTreservetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("treservetime not between", value1, value2, "treservetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeIsNull() {
            addCriterion("tlosetime is null");
            return (Criteria) this;
        }

        public Criteria andTlosetimeIsNotNull() {
            addCriterion("tlosetime is not null");
            return (Criteria) this;
        }

        public Criteria andTlosetimeEqualTo(Date value) {
            addCriterionForJDBCDate("tlosetime =", value, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tlosetime <>", value, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tlosetime >", value, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tlosetime >=", value, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeLessThan(Date value) {
            addCriterionForJDBCDate("tlosetime <", value, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tlosetime <=", value, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeIn(List<Date> values) {
            addCriterionForJDBCDate("tlosetime in", values, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tlosetime not in", values, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tlosetime between", value1, value2, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTlosetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tlosetime not between", value1, value2, "tlosetime");
            return (Criteria) this;
        }

        public Criteria andTstateIsNull() {
            addCriterion("tstate is null");
            return (Criteria) this;
        }

        public Criteria andTstateIsNotNull() {
            addCriterion("tstate is not null");
            return (Criteria) this;
        }

        public Criteria andTstateEqualTo(String value) {
            addCriterion("tstate =", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotEqualTo(String value) {
            addCriterion("tstate <>", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateGreaterThan(String value) {
            addCriterion("tstate >", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateGreaterThanOrEqualTo(String value) {
            addCriterion("tstate >=", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateLessThan(String value) {
            addCriterion("tstate <", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateLessThanOrEqualTo(String value) {
            addCriterion("tstate <=", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateLike(String value) {
            addCriterion("tstate like", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotLike(String value) {
            addCriterion("tstate not like", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateIn(List<String> values) {
            addCriterion("tstate in", values, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotIn(List<String> values) {
            addCriterion("tstate not in", values, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateBetween(String value1, String value2) {
            addCriterion("tstate between", value1, value2, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotBetween(String value1, String value2) {
            addCriterion("tstate not between", value1, value2, "tstate");
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