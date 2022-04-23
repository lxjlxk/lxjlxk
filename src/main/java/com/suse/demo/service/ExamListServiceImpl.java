package com.suse.demo.service;

import com.suse.demo.entity.ExamList;
import com.suse.demo.entity.ExamListExample;
import com.suse.demo.mapper.ExamListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamListServiceImpl implements ExamListService{
    @Autowired
    ExamListMapper examListMapper;

    @Override
    public List<ExamList> selectAllExams() {
        ExamListExample examListExample=new ExamListExample();
        List<ExamList> examLists=examListMapper.selectByExample(examListExample);
        return examLists;
    }

    @Override
    public int examAdd(ExamList examList) {
        return examListMapper.insert(examList);
    }

    @Override
    public int deleteByexamId(String examId) {
        return examListMapper.deleteByPrimaryKey(examId);
    }

    @Override
    public ExamList selectByexamId(String examId) {
        return examListMapper.selectByPrimaryKey(examId);
    }

    @Override
    public int examUpdate(ExamList examList) {
        return examListMapper.updateByPrimaryKey(examList);
    }

    @Override
    public List<ExamList> selectExamsByClass(String className) {
        ExamListExample example=new ExamListExample();
        example.createCriteria().andExamClassEqualTo(className);
        List<ExamList> lists=examListMapper.selectByExample(example);
        return lists;
    }
}
