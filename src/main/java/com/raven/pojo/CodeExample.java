package com.raven.pojo;

import java.util.ArrayList;
import java.util.List;

public class CodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public CodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXsdcodeIsNull() {
            addCriterion("xsdcode is null");
            return (Criteria) this;
        }

        public Criteria andXsdcodeIsNotNull() {
            addCriterion("xsdcode is not null");
            return (Criteria) this;
        }

        public Criteria andXsdcodeEqualTo(String value) {
            addCriterion("xsdcode =", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotEqualTo(String value) {
            addCriterion("xsdcode <>", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeGreaterThan(String value) {
            addCriterion("xsdcode >", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("xsdcode >=", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeLessThan(String value) {
            addCriterion("xsdcode <", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeLessThanOrEqualTo(String value) {
            addCriterion("xsdcode <=", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeLike(String value) {
            addCriterion("xsdcode like", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotLike(String value) {
            addCriterion("xsdcode not like", value, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeIn(List<String> values) {
            addCriterion("xsdcode in", values, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotIn(List<String> values) {
            addCriterion("xsdcode not in", values, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeBetween(String value1, String value2) {
            addCriterion("xsdcode between", value1, value2, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andXsdcodeNotBetween(String value1, String value2) {
            addCriterion("xsdcode not between", value1, value2, "xsdcode");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(String value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(String value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(String value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(String value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(String value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(String value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLike(String value) {
            addCriterion("used like", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotLike(String value) {
            addCriterion("used not like", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<String> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<String> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(String value1, String value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(String value1, String value2) {
            addCriterion("used not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_code
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 22 14:22:36 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_code
     *
     * @mbg.generated Fri Mar 22 14:22:36 CST 2015
     */
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