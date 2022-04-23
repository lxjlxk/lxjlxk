package com.suse.demo.mapper;

import com.suse.demo.entity.ChoiceQuestion;
import com.suse.demo.entity.ChoiceQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoiceQuestionMapper {
    long countByExample(ChoiceQuestionExample example);

    int deleteByExample(ChoiceQuestionExample example);

    int deleteByPrimaryKey(Integer cqId);

    int insert(ChoiceQuestion record);

    int insertSelective(ChoiceQuestion record);

    List<ChoiceQuestion> selectByExample(ChoiceQuestionExample example);

    ChoiceQuestion selectByPrimaryKey(Integer cqId);

    int updateByExampleSelective(@Param("record") ChoiceQuestion record, @Param("example") ChoiceQuestionExample example);

    int updateByExample(@Param("record") ChoiceQuestion record, @Param("example") ChoiceQuestionExample example);

    int updateByPrimaryKeySelective(ChoiceQuestion record);

    int updateByPrimaryKey(ChoiceQuestion record);
}