package com.suse.demo.entity;

public class ExamList {
    private String examId;

    private String examPaper;

    private String examDate;

    private String examPublisher;

    private String examClass;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    public String getExamPaper() {
        return examPaper;
    }

    public void setExamPaper(String examPaper) {
        this.examPaper = examPaper == null ? null : examPaper.trim();
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate == null ? null : examDate.trim();
    }

    public String getExamPublisher() {
        return examPublisher;
    }

    public void setExamPublisher(String examPublisher) {
        this.examPublisher = examPublisher == null ? null : examPublisher.trim();
    }

    public String getExamClass() {
        return examClass;
    }

    public void setExamClass(String examClass) {
        this.examClass = examClass == null ? null : examClass.trim();
    }
}