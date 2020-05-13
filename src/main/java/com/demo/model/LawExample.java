package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class LawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawExample() {
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

        public Criteria andLawTitleIsNull() {
            addCriterion("law_title is null");
            return (Criteria) this;
        }

        public Criteria andLawTitleIsNotNull() {
            addCriterion("law_title is not null");
            return (Criteria) this;
        }

        public Criteria andLawTitleEqualTo(String value) {
            addCriterion("law_title =", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleNotEqualTo(String value) {
            addCriterion("law_title <>", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleGreaterThan(String value) {
            addCriterion("law_title >", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleGreaterThanOrEqualTo(String value) {
            addCriterion("law_title >=", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleLessThan(String value) {
            addCriterion("law_title <", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleLessThanOrEqualTo(String value) {
            addCriterion("law_title <=", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleLike(String value) {
            addCriterion("law_title like", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleNotLike(String value) {
            addCriterion("law_title not like", value, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleIn(List<String> values) {
            addCriterion("law_title in", values, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleNotIn(List<String> values) {
            addCriterion("law_title not in", values, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleBetween(String value1, String value2) {
            addCriterion("law_title between", value1, value2, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawTitleNotBetween(String value1, String value2) {
            addCriterion("law_title not between", value1, value2, "lawTitle");
            return (Criteria) this;
        }

        public Criteria andLawContentIsNull() {
            addCriterion("law_content is null");
            return (Criteria) this;
        }

        public Criteria andLawContentIsNotNull() {
            addCriterion("law_content is not null");
            return (Criteria) this;
        }

        public Criteria andLawContentEqualTo(String value) {
            addCriterion("law_content =", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentNotEqualTo(String value) {
            addCriterion("law_content <>", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentGreaterThan(String value) {
            addCriterion("law_content >", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentGreaterThanOrEqualTo(String value) {
            addCriterion("law_content >=", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentLessThan(String value) {
            addCriterion("law_content <", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentLessThanOrEqualTo(String value) {
            addCriterion("law_content <=", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentLike(String value) {
            addCriterion("law_content like", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentNotLike(String value) {
            addCriterion("law_content not like", value, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentIn(List<String> values) {
            addCriterion("law_content in", values, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentNotIn(List<String> values) {
            addCriterion("law_content not in", values, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentBetween(String value1, String value2) {
            addCriterion("law_content between", value1, value2, "lawContent");
            return (Criteria) this;
        }

        public Criteria andLawContentNotBetween(String value1, String value2) {
            addCriterion("law_content not between", value1, value2, "lawContent");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNull() {
            addCriterion("enable_flag is null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNotNull() {
            addCriterion("enable_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagEqualTo(String value) {
            addCriterion("enable_flag =", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotEqualTo(String value) {
            addCriterion("enable_flag <>", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThan(String value) {
            addCriterion("enable_flag >", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("enable_flag >=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThan(String value) {
            addCriterion("enable_flag <", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThanOrEqualTo(String value) {
            addCriterion("enable_flag <=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLike(String value) {
            addCriterion("enable_flag like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotLike(String value) {
            addCriterion("enable_flag not like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIn(List<String> values) {
            addCriterion("enable_flag in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotIn(List<String> values) {
            addCriterion("enable_flag not in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagBetween(String value1, String value2) {
            addCriterion("enable_flag between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotBetween(String value1, String value2) {
            addCriterion("enable_flag not between", value1, value2, "enableFlag");
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