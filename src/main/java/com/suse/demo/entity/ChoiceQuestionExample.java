package com.suse.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChoiceQuestionExample() {
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

        public Criteria andCqIdIsNull() {
            addCriterion("cq_id is null");
            return (Criteria) this;
        }

        public Criteria andCqIdIsNotNull() {
            addCriterion("cq_id is not null");
            return (Criteria) this;
        }

        public Criteria andCqIdEqualTo(Integer value) {
            addCriterion("cq_id =", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotEqualTo(Integer value) {
            addCriterion("cq_id <>", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdGreaterThan(Integer value) {
            addCriterion("cq_id >", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cq_id >=", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdLessThan(Integer value) {
            addCriterion("cq_id <", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdLessThanOrEqualTo(Integer value) {
            addCriterion("cq_id <=", value, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdIn(List<Integer> values) {
            addCriterion("cq_id in", values, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotIn(List<Integer> values) {
            addCriterion("cq_id not in", values, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdBetween(Integer value1, Integer value2) {
            addCriterion("cq_id between", value1, value2, "cqId");
            return (Criteria) this;
        }

        public Criteria andCqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cq_id not between", value1, value2, "cqId");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andCqLevelIsNull() {
            addCriterion("cq_level is null");
            return (Criteria) this;
        }

        public Criteria andCqLevelIsNotNull() {
            addCriterion("cq_level is not null");
            return (Criteria) this;
        }

        public Criteria andCqLevelEqualTo(String value) {
            addCriterion("cq_level =", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelNotEqualTo(String value) {
            addCriterion("cq_level <>", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelGreaterThan(String value) {
            addCriterion("cq_level >", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelGreaterThanOrEqualTo(String value) {
            addCriterion("cq_level >=", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelLessThan(String value) {
            addCriterion("cq_level <", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelLessThanOrEqualTo(String value) {
            addCriterion("cq_level <=", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelLike(String value) {
            addCriterion("cq_level like", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelNotLike(String value) {
            addCriterion("cq_level not like", value, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelIn(List<String> values) {
            addCriterion("cq_level in", values, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelNotIn(List<String> values) {
            addCriterion("cq_level not in", values, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelBetween(String value1, String value2) {
            addCriterion("cq_level between", value1, value2, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqLevelNotBetween(String value1, String value2) {
            addCriterion("cq_level not between", value1, value2, "cqLevel");
            return (Criteria) this;
        }

        public Criteria andCqQuestionIsNull() {
            addCriterion("cq_question is null");
            return (Criteria) this;
        }

        public Criteria andCqQuestionIsNotNull() {
            addCriterion("cq_question is not null");
            return (Criteria) this;
        }

        public Criteria andCqQuestionEqualTo(String value) {
            addCriterion("cq_question =", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionNotEqualTo(String value) {
            addCriterion("cq_question <>", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionGreaterThan(String value) {
            addCriterion("cq_question >", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("cq_question >=", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionLessThan(String value) {
            addCriterion("cq_question <", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionLessThanOrEqualTo(String value) {
            addCriterion("cq_question <=", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionLike(String value) {
            addCriterion("cq_question like", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionNotLike(String value) {
            addCriterion("cq_question not like", value, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionIn(List<String> values) {
            addCriterion("cq_question in", values, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionNotIn(List<String> values) {
            addCriterion("cq_question not in", values, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionBetween(String value1, String value2) {
            addCriterion("cq_question between", value1, value2, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqQuestionNotBetween(String value1, String value2) {
            addCriterion("cq_question not between", value1, value2, "cqQuestion");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceIsNull() {
            addCriterion("cq_achoice is null");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceIsNotNull() {
            addCriterion("cq_achoice is not null");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceEqualTo(String value) {
            addCriterion("cq_achoice =", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceNotEqualTo(String value) {
            addCriterion("cq_achoice <>", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceGreaterThan(String value) {
            addCriterion("cq_achoice >", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceGreaterThanOrEqualTo(String value) {
            addCriterion("cq_achoice >=", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceLessThan(String value) {
            addCriterion("cq_achoice <", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceLessThanOrEqualTo(String value) {
            addCriterion("cq_achoice <=", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceLike(String value) {
            addCriterion("cq_achoice like", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceNotLike(String value) {
            addCriterion("cq_achoice not like", value, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceIn(List<String> values) {
            addCriterion("cq_achoice in", values, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceNotIn(List<String> values) {
            addCriterion("cq_achoice not in", values, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceBetween(String value1, String value2) {
            addCriterion("cq_achoice between", value1, value2, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqAchoiceNotBetween(String value1, String value2) {
            addCriterion("cq_achoice not between", value1, value2, "cqAchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceIsNull() {
            addCriterion("cq_bchoice is null");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceIsNotNull() {
            addCriterion("cq_bchoice is not null");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceEqualTo(String value) {
            addCriterion("cq_bchoice =", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceNotEqualTo(String value) {
            addCriterion("cq_bchoice <>", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceGreaterThan(String value) {
            addCriterion("cq_bchoice >", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceGreaterThanOrEqualTo(String value) {
            addCriterion("cq_bchoice >=", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceLessThan(String value) {
            addCriterion("cq_bchoice <", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceLessThanOrEqualTo(String value) {
            addCriterion("cq_bchoice <=", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceLike(String value) {
            addCriterion("cq_bchoice like", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceNotLike(String value) {
            addCriterion("cq_bchoice not like", value, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceIn(List<String> values) {
            addCriterion("cq_bchoice in", values, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceNotIn(List<String> values) {
            addCriterion("cq_bchoice not in", values, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceBetween(String value1, String value2) {
            addCriterion("cq_bchoice between", value1, value2, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqBchoiceNotBetween(String value1, String value2) {
            addCriterion("cq_bchoice not between", value1, value2, "cqBchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceIsNull() {
            addCriterion("cq_cchoice is null");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceIsNotNull() {
            addCriterion("cq_cchoice is not null");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceEqualTo(String value) {
            addCriterion("cq_cchoice =", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceNotEqualTo(String value) {
            addCriterion("cq_cchoice <>", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceGreaterThan(String value) {
            addCriterion("cq_cchoice >", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceGreaterThanOrEqualTo(String value) {
            addCriterion("cq_cchoice >=", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceLessThan(String value) {
            addCriterion("cq_cchoice <", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceLessThanOrEqualTo(String value) {
            addCriterion("cq_cchoice <=", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceLike(String value) {
            addCriterion("cq_cchoice like", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceNotLike(String value) {
            addCriterion("cq_cchoice not like", value, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceIn(List<String> values) {
            addCriterion("cq_cchoice in", values, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceNotIn(List<String> values) {
            addCriterion("cq_cchoice not in", values, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceBetween(String value1, String value2) {
            addCriterion("cq_cchoice between", value1, value2, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqCchoiceNotBetween(String value1, String value2) {
            addCriterion("cq_cchoice not between", value1, value2, "cqCchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceIsNull() {
            addCriterion("cq_dchoice is null");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceIsNotNull() {
            addCriterion("cq_dchoice is not null");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceEqualTo(String value) {
            addCriterion("cq_dchoice =", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceNotEqualTo(String value) {
            addCriterion("cq_dchoice <>", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceGreaterThan(String value) {
            addCriterion("cq_dchoice >", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceGreaterThanOrEqualTo(String value) {
            addCriterion("cq_dchoice >=", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceLessThan(String value) {
            addCriterion("cq_dchoice <", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceLessThanOrEqualTo(String value) {
            addCriterion("cq_dchoice <=", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceLike(String value) {
            addCriterion("cq_dchoice like", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceNotLike(String value) {
            addCriterion("cq_dchoice not like", value, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceIn(List<String> values) {
            addCriterion("cq_dchoice in", values, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceNotIn(List<String> values) {
            addCriterion("cq_dchoice not in", values, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceBetween(String value1, String value2) {
            addCriterion("cq_dchoice between", value1, value2, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqDchoiceNotBetween(String value1, String value2) {
            addCriterion("cq_dchoice not between", value1, value2, "cqDchoice");
            return (Criteria) this;
        }

        public Criteria andCqAnswerIsNull() {
            addCriterion("cq_answer is null");
            return (Criteria) this;
        }

        public Criteria andCqAnswerIsNotNull() {
            addCriterion("cq_answer is not null");
            return (Criteria) this;
        }

        public Criteria andCqAnswerEqualTo(String value) {
            addCriterion("cq_answer =", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerNotEqualTo(String value) {
            addCriterion("cq_answer <>", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerGreaterThan(String value) {
            addCriterion("cq_answer >", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("cq_answer >=", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerLessThan(String value) {
            addCriterion("cq_answer <", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerLessThanOrEqualTo(String value) {
            addCriterion("cq_answer <=", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerLike(String value) {
            addCriterion("cq_answer like", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerNotLike(String value) {
            addCriterion("cq_answer not like", value, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerIn(List<String> values) {
            addCriterion("cq_answer in", values, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerNotIn(List<String> values) {
            addCriterion("cq_answer not in", values, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerBetween(String value1, String value2) {
            addCriterion("cq_answer between", value1, value2, "cqAnswer");
            return (Criteria) this;
        }

        public Criteria andCqAnswerNotBetween(String value1, String value2) {
            addCriterion("cq_answer not between", value1, value2, "cqAnswer");
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