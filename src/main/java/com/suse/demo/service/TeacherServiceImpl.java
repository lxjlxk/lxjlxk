package com.suse.demo.service;

import com.suse.demo.entity.Teacher;
import com.suse.demo.entity.TeacherExample;
import com.suse.demo.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> selectAllTeachers() {
        TeacherExample teacherExample=new TeacherExample();
        List<Teacher> teachers=teacherMapper.selectByExample(teacherExample);
        return teachers;
    }

    @Override
    public int teacherAdd(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public int deleteByteacherId(String teacherId) {
        return teacherMapper.deleteByPrimaryKey(teacherId);
    }

    @Override
    public Teacher selectByteacherId(String teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public int teacherUpdate(Teacher teacher) {
        return teacherMapper.updateByPrimaryKey(teacher);
    }


}
