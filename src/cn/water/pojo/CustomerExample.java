package cn.water.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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
            addCriterion("cId is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cId is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cId =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cId <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cId >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cId >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cId <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cId <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cId in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cId not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cId between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cId not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cName is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cName is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cName =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cName <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cName >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cName >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cName <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cName <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cName like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cName not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cName in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cName not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cName between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cPhone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cPhone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cPhone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cPhone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cPhone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cPhone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cPhone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cPhone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cPhone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cPhone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cPhone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cPhone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cPhone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andAeraIsNull() {
            addCriterion("aera is null");
            return (Criteria) this;
        }

        public Criteria andAeraIsNotNull() {
            addCriterion("aera is not null");
            return (Criteria) this;
        }

        public Criteria andAeraEqualTo(String value) {
            addCriterion("aera =", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotEqualTo(String value) {
            addCriterion("aera <>", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraGreaterThan(String value) {
            addCriterion("aera >", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraGreaterThanOrEqualTo(String value) {
            addCriterion("aera >=", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraLessThan(String value) {
            addCriterion("aera <", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraLessThanOrEqualTo(String value) {
            addCriterion("aera <=", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraLike(String value) {
            addCriterion("aera like", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotLike(String value) {
            addCriterion("aera not like", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraIn(List<String> values) {
            addCriterion("aera in", values, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotIn(List<String> values) {
            addCriterion("aera not in", values, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraBetween(String value1, String value2) {
            addCriterion("aera between", value1, value2, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotBetween(String value1, String value2) {
            addCriterion("aera not between", value1, value2, "aera");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("cAddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("cAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("cAddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("cAddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("cAddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("cAddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("cAddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("cAddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("cAddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("cAddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("cAddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("cAddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("cAddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("cAddress not between", value1, value2, "caddress");
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