package com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("equipment_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("equipment_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("equipment_name =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("equipment_name <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("equipment_name >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_name >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("equipment_name <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("equipment_name <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("equipment_name like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("equipment_name not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("equipment_name in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("equipment_name not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("equipment_name between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("equipment_name not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusIsNull() {
            addCriterion("equipment_status is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusIsNotNull() {
            addCriterion("equipment_status is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusEqualTo(String value) {
            addCriterion("equipment_status =", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotEqualTo(String value) {
            addCriterion("equipment_status <>", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusGreaterThan(String value) {
            addCriterion("equipment_status >", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_status >=", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLessThan(String value) {
            addCriterion("equipment_status <", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLessThanOrEqualTo(String value) {
            addCriterion("equipment_status <=", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusLike(String value) {
            addCriterion("equipment_status like", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotLike(String value) {
            addCriterion("equipment_status not like", value, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusIn(List<String> values) {
            addCriterion("equipment_status in", values, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotIn(List<String> values) {
            addCriterion("equipment_status not in", values, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusBetween(String value1, String value2) {
            addCriterion("equipment_status between", value1, value2, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentStatusNotBetween(String value1, String value2) {
            addCriterion("equipment_status not between", value1, value2, "equipmentStatus");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressIsNull() {
            addCriterion("equipment_address is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressIsNotNull() {
            addCriterion("equipment_address is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressEqualTo(String value) {
            addCriterion("equipment_address =", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressNotEqualTo(String value) {
            addCriterion("equipment_address <>", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressGreaterThan(String value) {
            addCriterion("equipment_address >", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_address >=", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressLessThan(String value) {
            addCriterion("equipment_address <", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressLessThanOrEqualTo(String value) {
            addCriterion("equipment_address <=", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressLike(String value) {
            addCriterion("equipment_address like", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressNotLike(String value) {
            addCriterion("equipment_address not like", value, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressIn(List<String> values) {
            addCriterion("equipment_address in", values, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressNotIn(List<String> values) {
            addCriterion("equipment_address not in", values, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressBetween(String value1, String value2) {
            addCriterion("equipment_address between", value1, value2, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentAddressNotBetween(String value1, String value2) {
            addCriterion("equipment_address not between", value1, value2, "equipmentAddress");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyIsNull() {
            addCriterion("equipment_company is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyIsNotNull() {
            addCriterion("equipment_company is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyEqualTo(String value) {
            addCriterion("equipment_company =", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyNotEqualTo(String value) {
            addCriterion("equipment_company <>", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyGreaterThan(String value) {
            addCriterion("equipment_company >", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_company >=", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyLessThan(String value) {
            addCriterion("equipment_company <", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyLessThanOrEqualTo(String value) {
            addCriterion("equipment_company <=", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyLike(String value) {
            addCriterion("equipment_company like", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyNotLike(String value) {
            addCriterion("equipment_company not like", value, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyIn(List<String> values) {
            addCriterion("equipment_company in", values, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyNotIn(List<String> values) {
            addCriterion("equipment_company not in", values, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyBetween(String value1, String value2) {
            addCriterion("equipment_company between", value1, value2, "equipmentCompany");
            return (Criteria) this;
        }

        public Criteria andEquipmentCompanyNotBetween(String value1, String value2) {
            addCriterion("equipment_company not between", value1, value2, "equipmentCompany");
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