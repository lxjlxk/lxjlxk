package com.suse.demo.mapper;

import com.suse.demo.entity.PaperModule;
import com.suse.demo.entity.PaperModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperModuleMapper {
    long countByExample(PaperModuleExample example);

    int deleteByExample(PaperModuleExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(PaperModule record);

    int insertSelective(PaperModule record);

    List<PaperModule> selectByExample(PaperModuleExample example);

    PaperModule selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") PaperModule record, @Param("example") PaperModuleExample example);

    int updateByExample(@Param("record") PaperModule record, @Param("example") PaperModuleExample example);

    int updateByPrimaryKeySelective(PaperModule record);

    int updateByPrimaryKey(PaperModule record);
}