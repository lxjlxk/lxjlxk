package com.suse.demo.controller;

import com.suse.demo.entity.Subject;
import com.suse.demo.entity.TestPaper;
import com.suse.demo.service.SubjectService;
import com.suse.demo.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TestPaperController {
    @Autowired
    TestPaperService testPaperService;
    @Autowired
    SubjectService subjectService;

    @GetMapping("/paperList")
    public String paperList(Model model){
        List<TestPaper> testPapers=testPaperService.selectAllPapers();
        model.addAttribute("testPapers",testPapers);
        return "paper-list";
    }

    @GetMapping("/toPaperAdd")
    public String toPaperAdd(Model model){
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        return "paper-add";
    }

    @PostMapping("/paperAdd")
    @ResponseBody
    public Boolean paperAdd(@RequestBody TestPaper testPaper){
        int i=testPaperService.paperAdd(testPaper);
        return i==0?false:true;
    }

    @RequestMapping("/deleteBypaperId")
    public String deleteBypaperId(String paperId){
        int i=testPaperService.deleteBypaperId(paperId);
        return "forward:/paperList";
    }

    @RequestMapping("/selectBypaperId")
    public String selectBypaperId(String paperId,Model model){
        TestPaper testPaper=testPaperService.selectBypaperId(paperId);
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        model.addAttribute("testPaper",testPaper);
        return "paper-update";
    }

    @PostMapping("/paperUpdate")
    @ResponseBody
    public Boolean paperUpdate(@RequestBody TestPaper testPaper){
        int i=testPaperService.paperUpdate(testPaper);
        return i==0?false:true;
    }

}
