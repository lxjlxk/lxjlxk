package com.suse.demo.mapper;

import com.suse.demo.entity.ScoreList;
import com.suse.demo.entity.ScoreListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreListMapper {
    long countByExample(ScoreListExample example);

    int deleteByExample(ScoreListExample example);

    int deleteByPrimaryKey(String stuId);

    int insert(ScoreList record);

    int insertSelective(ScoreList record);

    List<ScoreList> selectByExample(ScoreListExample example);

    ScoreList selectByPrimaryKey(String stuId);

    int updateByExampleSelective(@Param("record") ScoreList record, @Param("example") ScoreListExample example);

    int updateByExample(@Param("record") ScoreList record, @Param("example") ScoreListExample example);

    int updateByPrimaryKeySelective(ScoreList record);

    int updateByPrimaryKey(ScoreList record);
}