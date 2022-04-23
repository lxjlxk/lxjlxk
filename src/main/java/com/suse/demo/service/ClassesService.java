package com.suse.demo.service;

import com.suse.demo.entity.Classes;

import java.util.List;

public interface ClassesService {
    List<Classes> selectAllClasses();

    int classAdd(Classes classes);

    int deleteByclassId(Integer classesId);

    Classes selectByclassId(Integer classesId);

    int classUpdate(Classes classes);

    List<Classes> selectClassByClassName(String examClass);

    List<Classes> selectByGradeAndClass(String stuGrade, String stuClass);
}
