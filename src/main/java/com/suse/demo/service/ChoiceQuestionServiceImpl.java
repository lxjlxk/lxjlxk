package com.suse.demo.service;

import com.github.pagehelper.PageHelper;
import com.suse.demo.entity.ChoiceQuestion;
import com.suse.demo.entity.ChoiceQuestionExample;
import com.suse.demo.mapper.ChoiceQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceQuestionServiceImpl implements ChoiceQuestionService{
    @Autowired
    ChoiceQuestionMapper choiceQuestionMapper;

    @Override
    public List<ChoiceQuestion> selectAllChoices() {
        ChoiceQuestionExample choiceExample=new ChoiceQuestionExample();
        List<ChoiceQuestion> choices=choiceQuestionMapper.selectByExample(choiceExample);
        return choices;
    }

    @Override
    public List<ChoiceQuestion> selectPageChoices(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        ChoiceQuestionExample choiceExample=new ChoiceQuestionExample();
        List<ChoiceQuestion> choices=choiceQuestionMapper.selectByExample(choiceExample);
        return choices;
    }

    @Override
    public List<ChoiceQuestion> selectChoiceBySubject(String paperSubject) {
        ChoiceQuestionExample example=new ChoiceQuestionExample();
        example.createCriteria().andSubjectNameEqualTo(paperSubject);
        return choiceQuestionMapper.selectByExample(example);
    }

    @Override
    public int choiceAdd(ChoiceQuestion choiceQuestion) {
        return choiceQuestionMapper.insert(choiceQuestion);
    }

    @Override
    public int deleteBychoiceId(Integer cqId) {
        return choiceQuestionMapper.deleteByPrimaryKey(cqId);
    }

    @Override
    public ChoiceQuestion selectBychoiceId(Integer cqId) {
        return choiceQuestionMapper.selectByPrimaryKey(cqId);
    }

    @Override
    public int choiceUpdate(ChoiceQuestion choiceQuestion) {
        return choiceQuestionMapper.updateByPrimaryKey(choiceQuestion);
    }

    @Override
    public ChoiceQuestion getChoiceBycqId(Integer cqId) {
        return choiceQuestionMapper.selectByPrimaryKey(cqId);
    }

}
