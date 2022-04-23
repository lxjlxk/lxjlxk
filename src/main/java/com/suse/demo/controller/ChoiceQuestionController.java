package com.suse.demo.controller;

import com.suse.demo.entity.ChoiceQuestion;
import com.suse.demo.entity.Subject;
import com.suse.demo.service.ChoiceQuestionService;
import com.suse.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ChoiceQuestionController {
    @Autowired
    ChoiceQuestionService choiceQuestionService;

    @Autowired
    SubjectService subjectService;


    @GetMapping("/choiceList")
    public String choiceList(Model model,@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "7") int pageSize){
        List<ChoiceQuestion> choicesAll=choiceQuestionService.selectAllChoices();
        Integer pageMax=choicesAll.size();
        List<ChoiceQuestion> choices=choiceQuestionService.selectPageChoices(pageNum,pageSize);
        pageMax=pageMax/pageSize + 1;
        model.addAttribute("choices",choices);
        model.addAttribute("pageMax",pageMax);
        model.addAttribute("pageNum",pageNum);
        return "choice-list";
    }

    @GetMapping("/toChoiceAdd")
    public String toChoiceAdd(Model model){
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        return "choice-add";
    }

    @PostMapping("/choiceAdd")
    @ResponseBody
    public Boolean choiceAdd(@RequestBody ChoiceQuestion choiceQuestion){
        int i=choiceQuestionService.choiceAdd(choiceQuestion);
        return i==0?false:true;
    }

    @RequestMapping("/deleteBychoiceId")
    public String deleteBychoiceId(Integer cqId){
        int i=choiceQuestionService.deleteBychoiceId(cqId);
        return "forward:/choiceList";
    }

    @RequestMapping("/selectBychoiceId")
    public String selectBychoiceId(Integer cqId,Model model){
        ChoiceQuestion choiceQuestion=choiceQuestionService.selectBychoiceId(cqId);
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        model.addAttribute("choice",choiceQuestion);
        return "choice-update";
    }

    @PostMapping("/choiceUpdate")
    @ResponseBody
    public Boolean choiceUpdate(@RequestBody ChoiceQuestion choiceQuestion){
        int i=choiceQuestionService.choiceUpdate(choiceQuestion);
        return i==0?false:true;
    }

    @GetMapping("/getChoiceBycqId")
    @ResponseBody
    public ChoiceQuestion getChoiceBycqId(Integer cqId){
        ChoiceQuestion choiceQuestions=choiceQuestionService.getChoiceBycqId(cqId);
        return  choiceQuestions;
    }
}
