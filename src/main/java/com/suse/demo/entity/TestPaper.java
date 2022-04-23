package com.suse.demo.entity;

public class TestPaper {
    private String paperId;

    private String paperSubject;

    private Integer paperTime;

    private String paperType;

    private Integer paperScore;

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    public String getPaperSubject() {
        return paperSubject;
    }

    public void setPaperSubject(String paperSubject) {
        this.paperSubject = paperSubject == null ? null : paperSubject.trim();
    }

    public Integer getPaperTime() {
        return paperTime;
    }

    public void setPaperTime(Integer paperTime) {
        this.paperTime = paperTime;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType == null ? null : paperType.trim();
    }

    public Integer getPaperScore() {
        return paperScore;
    }

    public void setPaperScore(Integer paperScore) {
        this.paperScore = paperScore;
    }
}