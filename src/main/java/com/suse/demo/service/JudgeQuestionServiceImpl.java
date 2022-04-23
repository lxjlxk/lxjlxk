package com.suse.demo.service;

import com.github.pagehelper.PageHelper;
import com.suse.demo.entity.JudgeQuestion;
import com.suse.demo.entity.JudgeQuestionExample;
import com.suse.demo.mapper.JudgeQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudgeQuestionServiceImpl implements JudgeQuestionService {
    @Autowired
    JudgeQuestionMapper judgeQuestionMapper;

    @Override
    public List<JudgeQuestion> selectAllJudges() {
        JudgeQuestionExample judgeExample=new JudgeQuestionExample();
        List<JudgeQuestion> judgeQuestions=judgeQuestionMapper.selectByExample(judgeExample);
        return judgeQuestions;
    }

    @Override
    public List<JudgeQuestion> selectPageJudges(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        JudgeQuestionExample judgeExample=new JudgeQuestionExample();
        List<JudgeQuestion> judgeQuestions=judgeQuestionMapper.selectByExample(judgeExample);
        return judgeQuestions;
    }

    @Override
    public List<JudgeQuestion> selectJudgeBySubject(String paperSubject) {
        JudgeQuestionExample example=new JudgeQuestionExample();
        example.createCriteria().andJudgeSubjectEqualTo(paperSubject);
        return judgeQuestionMapper.selectByExample(example);
    }

    @Override
    public int judgeAdd(JudgeQuestion judgeQuestion) {
        return judgeQuestionMapper.insert(judgeQuestion);
    }

    @Override
    public int deleteByjudgeId(Integer judgeId) {
        return judgeQuestionMapper.deleteByPrimaryKey(judgeId);
    }

    @Override
    public JudgeQuestion selectByjudgeId(Integer judgeId) {
        return judgeQuestionMapper.selectByPrimaryKey(judgeId);
    }

    @Override
    public int judgeUpdate(JudgeQuestion judgeQuestion) {
        return judgeQuestionMapper.updateByPrimaryKey(judgeQuestion);
    }
}
