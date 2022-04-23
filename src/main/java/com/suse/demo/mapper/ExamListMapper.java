package com.suse.demo.mapper;

import com.suse.demo.entity.ExamList;
import com.suse.demo.entity.ExamListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamListMapper {
    long countByExample(ExamListExample example);

    int deleteByExample(ExamListExample example);

    int deleteByPrimaryKey(String examId);

    int insert(ExamList record);

    int insertSelective(ExamList record);

    List<ExamList> selectByExample(ExamListExample example);

    ExamList selectByPrimaryKey(String examId);

    int updateByExampleSelective(@Param("record") ExamList record, @Param("example") ExamListExample example);

    int updateByExample(@Param("record") ExamList record, @Param("example") ExamListExample example);

    int updateByPrimaryKeySelective(ExamList record);

    int updateByPrimaryKey(ExamList record);
}