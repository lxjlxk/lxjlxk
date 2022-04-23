package com.suse.demo.service;

import com.suse.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> selectAllTeachers();

    int teacherAdd(Teacher teacher);

    int deleteByteacherId(String teacherId);

    Teacher selectByteacherId(String teacherId);

    int teacherUpdate(Teacher teacher);
}
