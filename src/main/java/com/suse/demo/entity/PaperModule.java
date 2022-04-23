package com.suse.demo.entity;

public class PaperModule {
    private Integer moduleId;

    private String moduleType;

    private Integer moduleNumber;

    private Integer moduleScore;

    private String moduleSubject;

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType == null ? null : moduleType.trim();
    }

    public Integer getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleNumber(Integer moduleNumber) {
        this.moduleNumber = moduleNumber;
    }

    public Integer getModuleScore() {
        return moduleScore;
    }

    public void setModuleScore(Integer moduleScore) {
        this.moduleScore = moduleScore;
    }

    public String getModuleSubject() {
        return moduleSubject;
    }

    public void setModuleSubject(String moduleSubject) {
        this.moduleSubject = moduleSubject == null ? null : moduleSubject.trim();
    }
}