package com.suse.demo.entity;

public class ScoreList {
    private String stuId;

    private String stuName;

    private String stuSubject;

    private Integer stuScore;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSubject() {
        return stuSubject;
    }

    public void setStuSubject(String stuSubject) {
        this.stuSubject = stuSubject == null ? null : stuSubject.trim();
    }

    public Integer getStuScore() {
        return stuScore;
    }

    public void setStuScore(Integer stuScore) {
        this.stuScore = stuScore;
    }
}