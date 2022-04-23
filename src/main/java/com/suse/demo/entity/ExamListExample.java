package com.suse.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ExamListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamListExample() {
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

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(String value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(String value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(String value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(String value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(String value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(String value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLike(String value) {
            addCriterion("exam_id like", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotLike(String value) {
            addCriterion("exam_id not like", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<String> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<String> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(String value1, String value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(String value1, String value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamPaperIsNull() {
            addCriterion("exam_paper is null");
            return (Criteria) this;
        }

        public Criteria andExamPaperIsNotNull() {
            addCriterion("exam_paper is not null");
            return (Criteria) this;
        }

        public Criteria andExamPaperEqualTo(String value) {
            addCriterion("exam_paper =", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperNotEqualTo(String value) {
            addCriterion("exam_paper <>", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperGreaterThan(String value) {
            addCriterion("exam_paper >", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperGreaterThanOrEqualTo(String value) {
            addCriterion("exam_paper >=", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperLessThan(String value) {
            addCriterion("exam_paper <", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperLessThanOrEqualTo(String value) {
            addCriterion("exam_paper <=", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperLike(String value) {
            addCriterion("exam_paper like", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperNotLike(String value) {
            addCriterion("exam_paper not like", value, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperIn(List<String> values) {
            addCriterion("exam_paper in", values, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperNotIn(List<String> values) {
            addCriterion("exam_paper not in", values, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperBetween(String value1, String value2) {
            addCriterion("exam_paper between", value1, value2, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamPaperNotBetween(String value1, String value2) {
            addCriterion("exam_paper not between", value1, value2, "examPaper");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNull() {
            addCriterion("exam_date is null");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNotNull() {
            addCriterion("exam_date is not null");
            return (Criteria) this;
        }

        public Criteria andExamDateEqualTo(String value) {
            addCriterion("exam_date =", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotEqualTo(String value) {
            addCriterion("exam_date <>", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThan(String value) {
            addCriterion("exam_date >", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThanOrEqualTo(String value) {
            addCriterion("exam_date >=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThan(String value) {
            addCriterion("exam_date <", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThanOrEqualTo(String value) {
            addCriterion("exam_date <=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLike(String value) {
            addCriterion("exam_date like", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotLike(String value) {
            addCriterion("exam_date not like", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateIn(List<String> values) {
            addCriterion("exam_date in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotIn(List<String> values) {
            addCriterion("exam_date not in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateBetween(String value1, String value2) {
            addCriterion("exam_date between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotBetween(String value1, String value2) {
            addCriterion("exam_date not between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamPublisherIsNull() {
            addCriterion("exam_publisher is null");
            return (Criteria) this;
        }

        public Criteria andExamPublisherIsNotNull() {
            addCriterion("exam_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andExamPublisherEqualTo(String value) {
            addCriterion("exam_publisher =", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherNotEqualTo(String value) {
            addCriterion("exam_publisher <>", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherGreaterThan(String value) {
            addCriterion("exam_publisher >", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("exam_publisher >=", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherLessThan(String value) {
            addCriterion("exam_publisher <", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherLessThanOrEqualTo(String value) {
            addCriterion("exam_publisher <=", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherLike(String value) {
            addCriterion("exam_publisher like", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherNotLike(String value) {
            addCriterion("exam_publisher not like", value, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherIn(List<String> values) {
            addCriterion("exam_publisher in", values, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherNotIn(List<String> values) {
            addCriterion("exam_publisher not in", values, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherBetween(String value1, String value2) {
            addCriterion("exam_publisher between", value1, value2, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamPublisherNotBetween(String value1, String value2) {
            addCriterion("exam_publisher not between", value1, value2, "examPublisher");
            return (Criteria) this;
        }

        public Criteria andExamClassIsNull() {
            addCriterion("exam_class is null");
            return (Criteria) this;
        }

        public Criteria andExamClassIsNotNull() {
            addCriterion("exam_class is not null");
            return (Criteria) this;
        }

        public Criteria andExamClassEqualTo(String value) {
            addCriterion("exam_class =", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassNotEqualTo(String value) {
            addCriterion("exam_class <>", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassGreaterThan(String value) {
            addCriterion("exam_class >", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassGreaterThanOrEqualTo(String value) {
            addCriterion("exam_class >=", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassLessThan(String value) {
            addCriterion("exam_class <", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassLessThanOrEqualTo(String value) {
            addCriterion("exam_class <=", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassLike(String value) {
            addCriterion("exam_class like", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassNotLike(String value) {
            addCriterion("exam_class not like", value, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassIn(List<String> values) {
            addCriterion("exam_class in", values, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassNotIn(List<String> values) {
            addCriterion("exam_class not in", values, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassBetween(String value1, String value2) {
            addCriterion("exam_class between", value1, value2, "examClass");
            return (Criteria) this;
        }

        public Criteria andExamClassNotBetween(String value1, String value2) {
            addCriterion("exam_class not between", value1, value2, "examClass");
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