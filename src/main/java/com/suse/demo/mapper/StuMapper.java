package com.suse.demo.mapper;

import com.suse.demo.entity.Stu;
import com.suse.demo.entity.StuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuMapper {
    long countByExample(StuExample example);

    int deleteByExample(StuExample example);

    int deleteByPrimaryKey(String stuId);

    int insert(Stu record);

    int insertSelective(Stu record);

    List<Stu> selectByExample(StuExample example);

    Stu selectByPrimaryKey(String stuId);

    int updateByExampleSelective(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByExample(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
}