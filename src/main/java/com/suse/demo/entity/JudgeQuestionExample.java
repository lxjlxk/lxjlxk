package com.suse.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class JudgeQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JudgeQuestionExample() {
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

        public Criteria andJudgeIdIsNull() {
            addCriterion("judge_id is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIsNotNull() {
            addCriterion("judge_id is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdEqualTo(Integer value) {
            addCriterion("judge_id =", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotEqualTo(Integer value) {
            addCriterion("judge_id <>", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThan(Integer value) {
            addCriterion("judge_id >", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_id >=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThan(Integer value) {
            addCriterion("judge_id <", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("judge_id <=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIn(List<Integer> values) {
            addCriterion("judge_id in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotIn(List<Integer> values) {
            addCriterion("judge_id not in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdBetween(Integer value1, Integer value2) {
            addCriterion("judge_id between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_id not between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectIsNull() {
            addCriterion("judge_subject is null");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectIsNotNull() {
            addCriterion("judge_subject is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectEqualTo(String value) {
            addCriterion("judge_subject =", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectNotEqualTo(String value) {
            addCriterion("judge_subject <>", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectGreaterThan(String value) {
            addCriterion("judge_subject >", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("judge_subject >=", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectLessThan(String value) {
            addCriterion("judge_subject <", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectLessThanOrEqualTo(String value) {
            addCriterion("judge_subject <=", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectLike(String value) {
            addCriterion("judge_subject like", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectNotLike(String value) {
            addCriterion("judge_subject not like", value, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectIn(List<String> values) {
            addCriterion("judge_subject in", values, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectNotIn(List<String> values) {
            addCriterion("judge_subject not in", values, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectBetween(String value1, String value2) {
            addCriterion("judge_subject between", value1, value2, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeSubjectNotBetween(String value1, String value2) {
            addCriterion("judge_subject not between", value1, value2, "judgeSubject");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelIsNull() {
            addCriterion("judge_level is null");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelIsNotNull() {
            addCriterion("judge_level is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelEqualTo(String value) {
            addCriterion("judge_level =", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelNotEqualTo(String value) {
            addCriterion("judge_level <>", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelGreaterThan(String value) {
            addCriterion("judge_level >", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("judge_level >=", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelLessThan(String value) {
            addCriterion("judge_level <", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelLessThanOrEqualTo(String value) {
            addCriterion("judge_level <=", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelLike(String value) {
            addCriterion("judge_level like", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelNotLike(String value) {
            addCriterion("judge_level not like", value, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelIn(List<String> values) {
            addCriterion("judge_level in", values, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelNotIn(List<String> values) {
            addCriterion("judge_level not in", values, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelBetween(String value1, String value2) {
            addCriterion("judge_level between", value1, value2, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeLevelNotBetween(String value1, String value2) {
            addCriterion("judge_level not between", value1, value2, "judgeLevel");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionIsNull() {
            addCriterion("judge_question is null");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionIsNotNull() {
            addCriterion("judge_question is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionEqualTo(String value) {
            addCriterion("judge_question =", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionNotEqualTo(String value) {
            addCriterion("judge_question <>", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionGreaterThan(String value) {
            addCriterion("judge_question >", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("judge_question >=", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionLessThan(String value) {
            addCriterion("judge_question <", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionLessThanOrEqualTo(String value) {
            addCriterion("judge_question <=", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionLike(String value) {
            addCriterion("judge_question like", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionNotLike(String value) {
            addCriterion("judge_question not like", value, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionIn(List<String> values) {
            addCriterion("judge_question in", values, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionNotIn(List<String> values) {
            addCriterion("judge_question not in", values, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionBetween(String value1, String value2) {
            addCriterion("judge_question between", value1, value2, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeQuestionNotBetween(String value1, String value2) {
            addCriterion("judge_question not between", value1, value2, "judgeQuestion");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIsNull() {
            addCriterion("judge_answer is null");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIsNotNull() {
            addCriterion("judge_answer is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerEqualTo(String value) {
            addCriterion("judge_answer =", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotEqualTo(String value) {
            addCriterion("judge_answer <>", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerGreaterThan(String value) {
            addCriterion("judge_answer >", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("judge_answer >=", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLessThan(String value) {
            addCriterion("judge_answer <", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLessThanOrEqualTo(String value) {
            addCriterion("judge_answer <=", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLike(String value) {
            addCriterion("judge_answer like", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotLike(String value) {
            addCriterion("judge_answer not like", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIn(List<String> values) {
            addCriterion("judge_answer in", values, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotIn(List<String> values) {
            addCriterion("judge_answer not in", values, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerBetween(String value1, String value2) {
            addCriterion("judge_answer between", value1, value2, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotBetween(String value1, String value2) {
            addCriterion("judge_answer not between", value1, value2, "judgeAnswer");
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