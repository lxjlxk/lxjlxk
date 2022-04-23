package com.suse.demo.service;

import com.suse.demo.entity.ChoiceQuestion;

import java.util.List;

public interface ChoiceQuestionService {

    int choiceAdd(ChoiceQuestion choiceQuestion);

    int deleteBychoiceId(Integer cqId);

    ChoiceQuestion selectBychoiceId(Integer cqId);

    int choiceUpdate(ChoiceQuestion choiceQuestion);

    ChoiceQuestion getChoiceBycqId(Integer cqId);

    List<ChoiceQuestion> selectAllChoices();

    List<ChoiceQuestion> selectPageChoices(int pageNum, int pageSize);

    List<ChoiceQuestion> selectChoiceBySubject(String paperSubject);
}
