package com.suse.demo.service;


import com.suse.demo.entity.Classes;
import com.suse.demo.entity.ClassesExample;
import com.suse.demo.mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService{
    @Autowired
    ClassesMapper classesMapper;

    @Override
    public List<Classes> selectAllClasses() {
        ClassesExample classesExample=new ClassesExample();
        List<Classes> classes=classesMapper.selectByExample(classesExample);
        return classes;
    }

    @Override
    public int classAdd(Classes classes) {
        return classesMapper.insert(classes);
    }

    @Override
    public int deleteByclassId(Integer classesId) {
        return classesMapper.deleteByPrimaryKey(classesId);
    }

    @Override
    public Classes selectByclassId(Integer classesId) {
        return classesMapper.selectByPrimaryKey(classesId);
    }

    @Override
    public int classUpdate(Classes classes) {
        return classesMapper.updateByPrimaryKey(classes);
    }

    @Override
    public List<Classes> selectClassByClassName(String examClass) {
        ClassesExample classesExample=new ClassesExample();
        classesExample.createCriteria().andClassesNameEqualTo(examClass);
        return classesMapper.selectByExample(classesExample);
    }

    @Override
    public List<Classes> selectByGradeAndClass(String stuGrade, String stuClass) {
        ClassesExample example=new ClassesExample();
        example.createCriteria().andGradeEqualTo(stuGrade).andProfessionalClassEqualTo(stuClass);
        List<Classes> classesList=classesMapper.selectByExample(example);
        return classesList;
    }


}
