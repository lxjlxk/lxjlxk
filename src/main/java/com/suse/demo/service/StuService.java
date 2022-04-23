package com.suse.demo.service;

import com.suse.demo.entity.Stu;

import java.util.List;

public interface StuService {
    List<Stu> selectAllStus();

    Stu selectBystuId(String stuId);

    int stuUpdate(Stu stu);

    int stuAdd(Stu stu);

    int deleteBystuId(String stuId);

    List<Stu> selectFlagStus(String grade, String professionalClass);

    Stu stulogin(String stuUsername);
}
