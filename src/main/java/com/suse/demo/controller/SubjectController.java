package com.suse.demo.controller;

import com.suse.demo.entity.Subject;
import com.suse.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @GetMapping("/subjectList")
    public String subjectList(Model model){
        List<Subject> subjects=subjectService.selectAllSubjects();
        model.addAttribute("subjects",subjects);
        return "subject-list";
    }

    @GetMapping("/toSubjectAdd")
    public String toSubjectAdd(){
        return "subject-add";
    }

    @PostMapping("/subjectAdd")
    @ResponseBody
    public Boolean subjectAdd(@RequestBody Subject subject){
        int i=subjectService.subjectAdd(subject);
        return i==0?false:true;
    }

    @RequestMapping("/deleteBysubjectId")
    public String deleteBysubjectId(String subjectId){
        int i=subjectService.deleteBysubjectId(subjectId);
        return "forward:/subjectList";
    }

    @RequestMapping("/selectBysubjectId")
    public String selectByteacherId(String subjectId,Model model){
        Subject subject=subjectService.selectBysubjectId(subjectId);
        model.addAttribute("subject",subject);
        return "subject-update";
    }

    @PostMapping("/subjectUpdate")
    @ResponseBody
    public Boolean subjectUpdate(@RequestBody Subject subject){
        int i=subjectService.subjectUpdate(subject);
        return i==0?false:true;
    }
}
