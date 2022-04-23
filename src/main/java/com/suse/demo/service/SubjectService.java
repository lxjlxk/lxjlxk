package com.suse.demo.service;

import com.suse.demo.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> selectAllSubjects();

    int subjectAdd(Subject subject);

    int deleteBysubjectId(String subjectId);

    Subject selectBysubjectId(String subjectId);

    int subjectUpdate(Subject subject);
}
