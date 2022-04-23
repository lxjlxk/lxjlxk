package com.suse.demo.mapper;

import com.suse.demo.entity.TestPaper;
import com.suse.demo.entity.TestPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestPaperMapper {
    long countByExample(TestPaperExample example);

    int deleteByExample(TestPaperExample example);

    int deleteByPrimaryKey(String paperId);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    List<TestPaper> selectByExample(TestPaperExample example);

    TestPaper selectByPrimaryKey(String paperId);

    int updateByExampleSelective(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByExample(@Param("record") TestPaper record, @Param("example") TestPaperExample example);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);
}