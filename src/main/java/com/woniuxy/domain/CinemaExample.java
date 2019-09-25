package com.woniuxy.domain;

import java.util.ArrayList;
import java.util.List;

public class CinemaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CinemaExample() {
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

<<<<<<< HEAD
        public Criteria andClogoIsNull() {
            addCriterion("clogo is null");
            return (Criteria) this;
        }

        public Criteria andClogoIsNotNull() {
            addCriterion("clogo is not null");
            return (Criteria) this;
        }

        public Criteria andClogoEqualTo(String value) {
            addCriterion("clogo =", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotEqualTo(String value) {
            addCriterion("clogo <>", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoGreaterThan(String value) {
            addCriterion("clogo >", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoGreaterThanOrEqualTo(String value) {
            addCriterion("clogo >=", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoLessThan(String value) {
            addCriterion("clogo <", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoLessThanOrEqualTo(String value) {
            addCriterion("clogo <=", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoLike(String value) {
            addCriterion("clogo like", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotLike(String value) {
            addCriterion("clogo not like", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoIn(List<String> values) {
            addCriterion("clogo in", values, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotIn(List<String> values) {
            addCriterion("clogo not in", values, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoBetween(String value1, String value2) {
            addCriterion("clogo between", value1, value2, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotBetween(String value1, String value2) {
            addCriterion("clogo not between", value1, value2, "clogo");
            return (Criteria) this;
        }

        public Criteria andCcoperightIsNull() {
            addCriterion("ccoperight is null");
            return (Criteria) this;
        }

        public Criteria andCcoperightIsNotNull() {
            addCriterion("ccoperight is not null");
            return (Criteria) this;
        }

        public Criteria andCcoperightEqualTo(String value) {
            addCriterion("ccoperight =", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotEqualTo(String value) {
            addCriterion("ccoperight <>", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightGreaterThan(String value) {
            addCriterion("ccoperight >", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightGreaterThanOrEqualTo(String value) {
            addCriterion("ccoperight >=", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightLessThan(String value) {
            addCriterion("ccoperight <", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightLessThanOrEqualTo(String value) {
            addCriterion("ccoperight <=", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightLike(String value) {
            addCriterion("ccoperight like", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotLike(String value) {
            addCriterion("ccoperight not like", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightIn(List<String> values) {
            addCriterion("ccoperight in", values, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotIn(List<String> values) {
            addCriterion("ccoperight not in", values, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightBetween(String value1, String value2) {
            addCriterion("ccoperight between", value1, value2, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotBetween(String value1, String value2) {
            addCriterion("ccoperight not between", value1, value2, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCfacilityIsNull() {
            addCriterion("cfacility is null");
            return (Criteria) this;
        }

        public Criteria andCfacilityIsNotNull() {
            addCriterion("cfacility is not null");
            return (Criteria) this;
        }

        public Criteria andCfacilityEqualTo(String value) {
            addCriterion("cfacility =", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotEqualTo(String value) {
            addCriterion("cfacility <>", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityGreaterThan(String value) {
            addCriterion("cfacility >", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityGreaterThanOrEqualTo(String value) {
            addCriterion("cfacility >=", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityLessThan(String value) {
            addCriterion("cfacility <", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityLessThanOrEqualTo(String value) {
            addCriterion("cfacility <=", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityLike(String value) {
            addCriterion("cfacility like", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotLike(String value) {
            addCriterion("cfacility not like", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityIn(List<String> values) {
            addCriterion("cfacility in", values, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotIn(List<String> values) {
            addCriterion("cfacility not in", values, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityBetween(String value1, String value2) {
            addCriterion("cfacility between", value1, value2, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotBetween(String value1, String value2) {
            addCriterion("cfacility not between", value1, value2, "cfacility");
=======
        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andClogoIsNull() {
            addCriterion("clogo is null");
            return (Criteria) this;
        }

        public Criteria andClogoIsNotNull() {
            addCriterion("clogo is not null");
            return (Criteria) this;
        }

        public Criteria andClogoEqualTo(String value) {
            addCriterion("clogo =", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotEqualTo(String value) {
            addCriterion("clogo <>", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoGreaterThan(String value) {
            addCriterion("clogo >", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoGreaterThanOrEqualTo(String value) {
            addCriterion("clogo >=", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoLessThan(String value) {
            addCriterion("clogo <", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoLessThanOrEqualTo(String value) {
            addCriterion("clogo <=", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoLike(String value) {
            addCriterion("clogo like", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotLike(String value) {
            addCriterion("clogo not like", value, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoIn(List<String> values) {
            addCriterion("clogo in", values, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotIn(List<String> values) {
            addCriterion("clogo not in", values, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoBetween(String value1, String value2) {
            addCriterion("clogo between", value1, value2, "clogo");
            return (Criteria) this;
        }

        public Criteria andClogoNotBetween(String value1, String value2) {
            addCriterion("clogo not between", value1, value2, "clogo");
            return (Criteria) this;
        }

        public Criteria andCcoperightIsNull() {
            addCriterion("ccoperight is null");
            return (Criteria) this;
        }

        public Criteria andCcoperightIsNotNull() {
            addCriterion("ccoperight is not null");
            return (Criteria) this;
        }

        public Criteria andCcoperightEqualTo(String value) {
            addCriterion("ccoperight =", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotEqualTo(String value) {
            addCriterion("ccoperight <>", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightGreaterThan(String value) {
            addCriterion("ccoperight >", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightGreaterThanOrEqualTo(String value) {
            addCriterion("ccoperight >=", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightLessThan(String value) {
            addCriterion("ccoperight <", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightLessThanOrEqualTo(String value) {
            addCriterion("ccoperight <=", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightLike(String value) {
            addCriterion("ccoperight like", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotLike(String value) {
            addCriterion("ccoperight not like", value, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightIn(List<String> values) {
            addCriterion("ccoperight in", values, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotIn(List<String> values) {
            addCriterion("ccoperight not in", values, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightBetween(String value1, String value2) {
            addCriterion("ccoperight between", value1, value2, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCcoperightNotBetween(String value1, String value2) {
            addCriterion("ccoperight not between", value1, value2, "ccoperight");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCfacilityIsNull() {
            addCriterion("cfacility is null");
            return (Criteria) this;
        }

        public Criteria andCfacilityIsNotNull() {
            addCriterion("cfacility is not null");
            return (Criteria) this;
        }

        public Criteria andCfacilityEqualTo(String value) {
            addCriterion("cfacility =", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotEqualTo(String value) {
            addCriterion("cfacility <>", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityGreaterThan(String value) {
            addCriterion("cfacility >", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityGreaterThanOrEqualTo(String value) {
            addCriterion("cfacility >=", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityLessThan(String value) {
            addCriterion("cfacility <", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityLessThanOrEqualTo(String value) {
            addCriterion("cfacility <=", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityLike(String value) {
            addCriterion("cfacility like", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotLike(String value) {
            addCriterion("cfacility not like", value, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityIn(List<String> values) {
            addCriterion("cfacility in", values, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotIn(List<String> values) {
            addCriterion("cfacility not in", values, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityBetween(String value1, String value2) {
            addCriterion("cfacility between", value1, value2, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCfacilityNotBetween(String value1, String value2) {
            addCriterion("cfacility not between", value1, value2, "cfacility");
            return (Criteria) this;
        }

        public Criteria andCpictureIsNull() {
            addCriterion("cpicture is null");
            return (Criteria) this;
        }

        public Criteria andCpictureIsNotNull() {
            addCriterion("cpicture is not null");
            return (Criteria) this;
        }

        public Criteria andCpictureEqualTo(String value) {
            addCriterion("cpicture =", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotEqualTo(String value) {
            addCriterion("cpicture <>", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureGreaterThan(String value) {
            addCriterion("cpicture >", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureGreaterThanOrEqualTo(String value) {
            addCriterion("cpicture >=", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLessThan(String value) {
            addCriterion("cpicture <", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLessThanOrEqualTo(String value) {
            addCriterion("cpicture <=", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureLike(String value) {
            addCriterion("cpicture like", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotLike(String value) {
            addCriterion("cpicture not like", value, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureIn(List<String> values) {
            addCriterion("cpicture in", values, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotIn(List<String> values) {
            addCriterion("cpicture not in", values, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureBetween(String value1, String value2) {
            addCriterion("cpicture between", value1, value2, "cpicture");
            return (Criteria) this;
        }

        public Criteria andCpictureNotBetween(String value1, String value2) {
            addCriterion("cpicture not between", value1, value2, "cpicture");
>>>>>>> branch 'master' of git@github.com:zgx-rookie/woniuticket.git
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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