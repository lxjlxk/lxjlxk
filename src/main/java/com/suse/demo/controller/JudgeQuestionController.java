package com.suse.demo.controller;

import com.suse.demo.entity.ChoiceQuestion;
import com.suse.demo.entity.JudgeQuestion;
import com.suse.demo.entity.Subject;
import com.suse.demo.service.JudgeQuestionService;
import com.suse.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class JudgeQuestionController {
    @Autowired
    JudgeQuestionService judgeQuestionService;
    @Autowired
    SubjectService subjectService;

    @GetMapping("/judgeList")
    public String judgeList(Model model,@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "7") int pageSize){
        List<JudgeQuestion> judgeAll=judgeQuestionService.selectAllJudges();
        Integer pageMax=judgeAll.size();
        List<JudgeQuestion> judgeQuestions=judgeQuestionService.selectPageJudges(pageNum,pageSize);
        pageMax=pageMax/pageSize + 1;
        model.addAttribute("judges",judgeQuestions);
        model.addAttribute("pageMax",pageMax);
        model.addAttribute("pageNum",pageNum);
        return "judge-list";
    }

    @GetMapping("/toJudgeAdd")
    public String toJudgeAdd(Model model){
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        return "judge-add";
    }

    @PostMapping("/judgeAdd")
    @ResponseBody
    public Boolean judgeAdd(@RequestBody JudgeQuestion judgeQuestion){
        int i=judgeQuestionService.judgeAdd(judgeQuestion);
        return i==0?false:true;
    }

    @RequestMapping("/deleteByjudgeId")
    public String deleteByjudgeId(Integer judgeId){
        int i=judgeQuestionService.deleteByjudgeId(judgeId);
        return "forward:/judgeList";
    }

    @RequestMapping("/selectByjudgeId")
    public String selectByjudgeId(Integer judgeId,Model model){
        JudgeQuestion judgeQuestion =judgeQuestionService.selectByjudgeId(judgeId);
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        model.addAttribute("judge",judgeQuestion);
        return "judge-update";
    }

    @PostMapping("/judgeUpdate")
    @ResponseBody
    public Boolean judgeUpdate(@RequestBody JudgeQuestion judgeQuestion){
        int i=judgeQuestionService.judgeUpdate(judgeQuestion);
        return i==0?false:true;
    }

}
