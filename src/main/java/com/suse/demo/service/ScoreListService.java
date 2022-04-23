package com.suse.demo.service;

import com.suse.demo.entity.ScoreList;

import java.util.List;

public interface ScoreListService {
    List<ScoreList> selectAllScores();

    ScoreList selectScoreBystuId(String stuId);
    int insert(ScoreList scoreList);
}
