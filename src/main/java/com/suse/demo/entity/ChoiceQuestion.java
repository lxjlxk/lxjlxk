package com.suse.demo.entity;

public class ChoiceQuestion {
    private Integer cqId;

    private String subjectName;

    private String cqLevel;

    private String cqQuestion;

    private String cqAchoice;

    private String cqBchoice;

    private String cqCchoice;

    private String cqDchoice;

    private String cqAnswer;

    public Integer getCqId() {
        return cqId;
    }

    public void setCqId(Integer cqId) {
        this.cqId = cqId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getCqLevel() {
        return cqLevel;
    }

    public void setCqLevel(String cqLevel) {
        this.cqLevel = cqLevel == null ? null : cqLevel.trim();
    }

    public String getCqQuestion() {
        return cqQuestion;
    }

    public void setCqQuestion(String cqQuestion) {
        this.cqQuestion = cqQuestion == null ? null : cqQuestion.trim();
    }

    public String getCqAchoice() {
        return cqAchoice;
    }

    public void setCqAchoice(String cqAchoice) {
        this.cqAchoice = cqAchoice == null ? null : cqAchoice.trim();
    }

    public String getCqBchoice() {
        return cqBchoice;
    }

    public void setCqBchoice(String cqBchoice) {
        this.cqBchoice = cqBchoice == null ? null : cqBchoice.trim();
    }

    public String getCqCchoice() {
        return cqCchoice;
    }

    public void setCqCchoice(String cqCchoice) {
        this.cqCchoice = cqCchoice == null ? null : cqCchoice.trim();
    }

    public String getCqDchoice() {
        return cqDchoice;
    }

    public void setCqDchoice(String cqDchoice) {
        this.cqDchoice = cqDchoice == null ? null : cqDchoice.trim();
    }

    public String getCqAnswer() {
        return cqAnswer;
    }

    public void setCqAnswer(String cqAnswer) {
        this.cqAnswer = cqAnswer == null ? null : cqAnswer.trim();
    }
}