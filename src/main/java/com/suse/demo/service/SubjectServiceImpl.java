package com.suse.demo.service;

import com.suse.demo.entity.Subject;
import com.suse.demo.entity.SubjectExample;
import com.suse.demo.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    SubjectMapper subjectMapper;

    @Override
    public List<Subject> selectAllSubjects() {
        SubjectExample subjectExample=new SubjectExample();
        List<Subject> subjects=subjectMapper.selectByExample(subjectExample);
        return subjects;
    }

    @Override
    public int subjectAdd(Subject subject) {
        return subjectMapper.insert(subject);
    }

    @Override
    public int deleteBysubjectId(String subjectId) {
        return subjectMapper.deleteByPrimaryKey(subjectId);
    }

    @Override
    public Subject selectBysubjectId(String subjectId) {
        return subjectMapper.selectByPrimaryKey(subjectId);
    }

    @Override
    public int subjectUpdate(Subject subject) {
        return subjectMapper.updateByPrimaryKey(subject);
    }
}
