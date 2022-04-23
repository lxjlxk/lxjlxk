package com.suse.demo.mapper;

import com.suse.demo.entity.JudgeQuestion;
import com.suse.demo.entity.JudgeQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JudgeQuestionMapper {
    long countByExample(JudgeQuestionExample example);

    int deleteByExample(JudgeQuestionExample example);

    int deleteByPrimaryKey(Integer judgeId);

    int insert(JudgeQuestion record);

    int insertSelective(JudgeQuestion record);

    List<JudgeQuestion> selectByExample(JudgeQuestionExample example);

    JudgeQuestion selectByPrimaryKey(Integer judgeId);

    int updateByExampleSelective(@Param("record") JudgeQuestion record, @Param("example") JudgeQuestionExample example);

    int updateByExample(@Param("record") JudgeQuestion record, @Param("example") JudgeQuestionExample example);

    int updateByPrimaryKeySelective(JudgeQuestion record);

    int updateByPrimaryKey(JudgeQuestion record);
}