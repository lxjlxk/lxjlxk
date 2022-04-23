package com.suse.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class PaperModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperModuleExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andModuleIdIsNull() {
            addCriterion("module_id is null");
            return (Criteria) this;
        }

        public Criteria andModuleIdIsNotNull() {
            addCriterion("module_id is not null");
            return (Criteria) this;
        }

        public Criteria andModuleIdEqualTo(Integer value) {
            addCriterion("module_id =", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotEqualTo(Integer value) {
            addCriterion("module_id <>", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThan(Integer value) {
            addCriterion("module_id >", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_id >=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThan(Integer value) {
            addCriterion("module_id <", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("module_id <=", value, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdIn(List<Integer> values) {
            addCriterion("module_id in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotIn(List<Integer> values) {
            addCriterion("module_id not in", values, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdBetween(Integer value1, Integer value2) {
            addCriterion("module_id between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("module_id not between", value1, value2, "moduleId");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNull() {
            addCriterion("module_type is null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIsNotNull() {
            addCriterion("module_type is not null");
            return (Criteria) this;
        }

        public Criteria andModuleTypeEqualTo(String value) {
            addCriterion("module_type =", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotEqualTo(String value) {
            addCriterion("module_type <>", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThan(String value) {
            addCriterion("module_type >", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("module_type >=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThan(String value) {
            addCriterion("module_type <", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLessThanOrEqualTo(String value) {
            addCriterion("module_type <=", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeLike(String value) {
            addCriterion("module_type like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotLike(String value) {
            addCriterion("module_type not like", value, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeIn(List<String> values) {
            addCriterion("module_type in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotIn(List<String> values) {
            addCriterion("module_type not in", values, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeBetween(String value1, String value2) {
            addCriterion("module_type between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleTypeNotBetween(String value1, String value2) {
            addCriterion("module_type not between", value1, value2, "moduleType");
            return (Criteria) this;
        }

        public Criteria andModuleNumberIsNull() {
            addCriterion("module_number is null");
            return (Criteria) this;
        }

        public Criteria andModuleNumberIsNotNull() {
            addCriterion("module_number is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNumberEqualTo(Integer value) {
            addCriterion("module_number =", value, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberNotEqualTo(Integer value) {
            addCriterion("module_number <>", value, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberGreaterThan(Integer value) {
            addCriterion("module_number >", value, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_number >=", value, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberLessThan(Integer value) {
            addCriterion("module_number <", value, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("module_number <=", value, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberIn(List<Integer> values) {
            addCriterion("module_number in", values, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberNotIn(List<Integer> values) {
            addCriterion("module_number not in", values, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberBetween(Integer value1, Integer value2) {
            addCriterion("module_number between", value1, value2, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("module_number not between", value1, value2, "moduleNumber");
            return (Criteria) this;
        }

        public Criteria andModuleScoreIsNull() {
            addCriterion("module_score is null");
            return (Criteria) this;
        }

        public Criteria andModuleScoreIsNotNull() {
            addCriterion("module_score is not null");
            return (Criteria) this;
        }

        public Criteria andModuleScoreEqualTo(Integer value) {
            addCriterion("module_score =", value, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreNotEqualTo(Integer value) {
            addCriterion("module_score <>", value, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreGreaterThan(Integer value) {
            addCriterion("module_score >", value, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_score >=", value, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreLessThan(Integer value) {
            addCriterion("module_score <", value, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreLessThanOrEqualTo(Integer value) {
            addCriterion("module_score <=", value, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreIn(List<Integer> values) {
            addCriterion("module_score in", values, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreNotIn(List<Integer> values) {
            addCriterion("module_score not in", values, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreBetween(Integer value1, Integer value2) {
            addCriterion("module_score between", value1, value2, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("module_score not between", value1, value2, "moduleScore");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectIsNull() {
            addCriterion("module_subject is null");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectIsNotNull() {
            addCriterion("module_subject is not null");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectEqualTo(String value) {
            addCriterion("module_subject =", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectNotEqualTo(String value) {
            addCriterion("module_subject <>", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectGreaterThan(String value) {
            addCriterion("module_subject >", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("module_subject >=", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectLessThan(String value) {
            addCriterion("module_subject <", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectLessThanOrEqualTo(String value) {
            addCriterion("module_subject <=", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectLike(String value) {
            addCriterion("module_subject like", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectNotLike(String value) {
            addCriterion("module_subject not like", value, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectIn(List<String> values) {
            addCriterion("module_subject in", values, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectNotIn(List<String> values) {
            addCriterion("module_subject not in", values, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectBetween(String value1, String value2) {
            addCriterion("module_subject between", value1, value2, "moduleSubject");
            return (Criteria) this;
        }

        public Criteria andModuleSubjectNotBetween(String value1, String value2) {
            addCriterion("module_subject not between", value1, value2, "moduleSubject");
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