package com.suse.demo.service;

import com.suse.demo.entity.ScoreList;
import com.suse.demo.entity.ScoreListExample;
import com.suse.demo.mapper.ScoreListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreListServiceImpl implements ScoreListService {
    @Autowired
    ScoreListMapper scoreListMapper;

    @Override
    public List<ScoreList> selectAllScores() {
        ScoreListExample scoreListExample=new ScoreListExample();
        List<ScoreList> scoreLists=scoreListMapper.selectByExample(scoreListExample);
        return scoreLists;
    }

    @Override
    public ScoreList selectScoreBystuId(String stuId) {
        return scoreListMapper.selectByPrimaryKey(stuId);
    }

    public int insert(ScoreList scoreList) {
        return scoreListMapper.insert(scoreList);
    }
}
