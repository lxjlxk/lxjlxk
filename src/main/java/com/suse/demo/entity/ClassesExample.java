package com.suse.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassesExample() {
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

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesNameIsNull() {
            addCriterion("classes_name is null");
            return (Criteria) this;
        }

        public Criteria andClassesNameIsNotNull() {
            addCriterion("classes_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassesNameEqualTo(String value) {
            addCriterion("classes_name =", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotEqualTo(String value) {
            addCriterion("classes_name <>", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameGreaterThan(String value) {
            addCriterion("classes_name >", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameGreaterThanOrEqualTo(String value) {
            addCriterion("classes_name >=", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameLessThan(String value) {
            addCriterion("classes_name <", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameLessThanOrEqualTo(String value) {
            addCriterion("classes_name <=", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameLike(String value) {
            addCriterion("classes_name like", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotLike(String value) {
            addCriterion("classes_name not like", value, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameIn(List<String> values) {
            addCriterion("classes_name in", values, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotIn(List<String> values) {
            addCriterion("classes_name not in", values, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameBetween(String value1, String value2) {
            addCriterion("classes_name between", value1, value2, "classesName");
            return (Criteria) this;
        }

        public Criteria andClassesNameNotBetween(String value1, String value2) {
            addCriterion("classes_name not between", value1, value2, "classesName");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassIsNull() {
            addCriterion("professional_class is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassIsNotNull() {
            addCriterion("professional_class is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassEqualTo(String value) {
            addCriterion("professional_class =", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassNotEqualTo(String value) {
            addCriterion("professional_class <>", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassGreaterThan(String value) {
            addCriterion("professional_class >", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassGreaterThanOrEqualTo(String value) {
            addCriterion("professional_class >=", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassLessThan(String value) {
            addCriterion("professional_class <", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassLessThanOrEqualTo(String value) {
            addCriterion("professional_class <=", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassLike(String value) {
            addCriterion("professional_class like", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassNotLike(String value) {
            addCriterion("professional_class not like", value, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassIn(List<String> values) {
            addCriterion("professional_class in", values, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassNotIn(List<String> values) {
            addCriterion("professional_class not in", values, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassBetween(String value1, String value2) {
            addCriterion("professional_class between", value1, value2, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andProfessionalClassNotBetween(String value1, String value2) {
            addCriterion("professional_class not between", value1, value2, "professionalClass");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
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