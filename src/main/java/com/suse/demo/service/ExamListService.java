package com.suse.demo.service;

import com.suse.demo.entity.ExamList;

import java.util.List;

public interface ExamListService {
    List<ExamList> selectAllExams();

    int examAdd(ExamList examList);

    int deleteByexamId(String examId);

    ExamList selectByexamId(String examId);

    int examUpdate(ExamList examList);

    List<ExamList> selectExamsByClass(String className);
}
