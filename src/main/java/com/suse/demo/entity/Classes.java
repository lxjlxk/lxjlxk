package com.suse.demo.entity;

public class Classes {
    private Integer classesId;

    private String classesName;

    private String professionalClass;

    private String grade;

    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName == null ? null : classesName.trim();
    }

    public String getProfessionalClass() {
        return professionalClass;
    }

    public void setProfessionalClass(String professionalClass) {
        this.professionalClass = professionalClass == null ? null : professionalClass.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}