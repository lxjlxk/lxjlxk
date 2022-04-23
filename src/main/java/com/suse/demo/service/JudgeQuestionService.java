package com.suse.demo.service;

import com.suse.demo.entity.JudgeQuestion;

import java.util.List;

public interface JudgeQuestionService {

    int judgeAdd(JudgeQuestion judgeQuestion);

    int deleteByjudgeId(Integer judgeId);

    JudgeQuestion selectByjudgeId(Integer judgeId);

    int judgeUpdate(JudgeQuestion judgeQuestion);

    List<JudgeQuestion> selectAllJudges();

    List<JudgeQuestion> selectPageJudges(int pageNum, int pageSize);

    List<JudgeQuestion> selectJudgeBySubject(String paperSubject);
}
