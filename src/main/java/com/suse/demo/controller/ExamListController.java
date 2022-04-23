package com.suse.demo.controller;

import com.suse.demo.entity.ExamList;
import com.suse.demo.service.ClassesService;
import com.suse.demo.service.ExamListService;
import com.suse.demo.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ExamListController {
    @Autowired
    ExamListService examListService;
    @Autowired
    StuService stuService;
    @Autowired
    ClassesService classesService;

    @GetMapping("/examList")
    public String examList(Model model){
        List<ExamList> examLists=examListService.selectAllExams();
        model.addAttribute("examLists",examLists);
        return "exam-list";
    }

    @GetMapping("/toExamAdd")
    public String toExamAdd(){
        return "exam-add";
    }

    @PostMapping("/examAdd")
    @ResponseBody
    public Boolean examAdd(@RequestBody ExamList examList){
        int i=examListService.examAdd(examList);
        return i==0?false:true;
    }

    @RequestMapping("/deleteByexamId")
    public String deleteByexamId(String examId){
        int i=examListService.deleteByexamId(examId);
        return "forward:/examList";
    }

    @RequestMapping("/selectByexamId")
    public String selectByexamId(String examId,Model model){
        ExamList examList=examListService.selectByexamId(examId);
        model.addAttribute("examList",examList);
        return "exam-update";
    }

    @PostMapping("/examUpdate")
    @ResponseBody
    public Boolean examUpdate(@RequestBody ExamList examList){
        int i=examListService.examUpdate(examList);
        return i==0?false:true;
    }
}
