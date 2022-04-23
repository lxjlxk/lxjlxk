package com.suse.demo.service;

import com.suse.demo.entity.TestPaper;
import com.suse.demo.entity.TestPaperExample;
import com.suse.demo.mapper.TestPaperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestPaperServiceImpl implements TestPaperService{
    @Autowired
    TestPaperMapper testPaperMapper;

    @Override
    public List<TestPaper> selectAllPapers() {
        TestPaperExample testPaperExample=new TestPaperExample();
        List<TestPaper> testPapers=testPaperMapper.selectByExample(testPaperExample);
        return testPapers;
    }

    @Override
    public int paperAdd(TestPaper testPaper) {
        return testPaperMapper.insert(testPaper);
    }

    @Override
    public int deleteBypaperId(String paperId) {
        return testPaperMapper.deleteByPrimaryKey(paperId);
    }

    @Override
    public TestPaper selectBypaperId(String paperId) {
        return testPaperMapper.selectByPrimaryKey(paperId);
    }

    @Override
    public int paperUpdate(TestPaper testPaper) {
        return testPaperMapper.updateByPrimaryKey(testPaper);
    }

}
