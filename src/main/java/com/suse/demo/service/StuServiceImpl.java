package com.suse.demo.service;

import com.github.pagehelper.PageHelper;
import com.suse.demo.entity.Stu;
import com.suse.demo.entity.StuExample;
import com.suse.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuServiceImpl implements StuService{
    @Autowired
    StuMapper stuMapper;

    @Override
    public List<Stu> selectAllStus() {
        /*//前台传过来页码 页面大小
        PageHelper.startPage(2,2);//第一页 每页5条数据
*/
        StuExample stuExample=new StuExample();
        List<Stu> stus=stuMapper.selectByExample(stuExample);
        return stus;
    }

    @Override
    public Stu selectBystuId(String stuId) {
        return stuMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public int stuUpdate(Stu stu) {
        return stuMapper.updateByPrimaryKey(stu);
    }

    @Override
    public int stuAdd(Stu stu) {
        return stuMapper.insert(stu);
    }

    @Override
    public int deleteBystuId(String stuId) {
        return stuMapper.deleteByPrimaryKey(stuId);
    }

    @Override
    public List<Stu> selectFlagStus(String grade, String professionalClass) {
        StuExample stuExample=new StuExample();
        stuExample.createCriteria().andStuClassEqualTo(professionalClass).andStuGradeEqualTo(grade);
        List<Stu> stus=stuMapper.selectByExample(stuExample);
        return stus;
    }

    @Override
    public Stu stulogin(String stuUsername) {
        Stu stu=stuMapper.selectByPrimaryKey(stuUsername);
        return stu;
    }

}
