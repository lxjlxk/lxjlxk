package com.suse.demo.entity;

public class JudgeQuestion {
    private Integer judgeId;

    private String judgeSubject;

    private String judgeLevel;

    private String judgeQuestion;

    private String judgeAnswer;

    public Integer getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(Integer judgeId) {
        this.judgeId = judgeId;
    }

    public String getJudgeSubject() {
        return judgeSubject;
    }

    public void setJudgeSubject(String judgeSubject) {
        this.judgeSubject = judgeSubject == null ? null : judgeSubject.trim();
    }

    public String getJudgeLevel() {
        return judgeLevel;
    }

    public void setJudgeLevel(String judgeLevel) {
        this.judgeLevel = judgeLevel == null ? null : judgeLevel.trim();
    }

    public String getJudgeQuestion() {
        return judgeQuestion;
    }

    public void setJudgeQuestion(String judgeQuestion) {
        this.judgeQuestion = judgeQuestion == null ? null : judgeQuestion.trim();
    }

    public String getJudgeAnswer() {
        return judgeAnswer;
    }

    public void setJudgeAnswer(String judgeAnswer) {
        this.judgeAnswer = judgeAnswer == null ? null : judgeAnswer.trim();
    }
}