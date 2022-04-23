package com.suse.demo.service;

import com.suse.demo.entity.TestPaper;

import java.util.List;

public interface TestPaperService {
    List<TestPaper> selectAllPapers();

    int paperAdd(TestPaper testPaper);

    int deleteBypaperId(String paperId);

    TestPaper selectBypaperId(String paperId);

    int paperUpdate(TestPaper testPaper);
}
