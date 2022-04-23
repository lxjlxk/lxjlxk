package com.suse.demo.controller;

import com.suse.demo.entity.Classes;
import com.suse.demo.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClassesController {
    @Autowired
    ClassesService classesService;

    @GetMapping("/classesList")
    public String classesList(Model model){
        List<Classes> classes=classesService.selectAllClasses();
        model.addAttribute("classes",classes);
        return "classes-list";
    }

    @GetMapping("/toClassAdd")
    public String toClassAdd(){
        return "classes-add";
    }

    @PostMapping("/classAdd")
    @ResponseBody
    public Boolean classAdd(@RequestBody Classes classes){
        int i=classesService.classAdd(classes);
        return i==0?false:true;
    }

    @RequestMapping("/deleteByclassId")
    public String deleteByclassId(Integer classesId){
        int i=classesService.deleteByclassId(classesId);
        return "forward:/classesList";
    }

    @RequestMapping("/selectByclassId")
    public String selectByteacherId(Integer classesId,Model model){
        Classes classes=classesService.selectByclassId(classesId);
        model.addAttribute("classes",classes);
        return "classes-update";
    }

    @PostMapping("/classUpdate")
    @ResponseBody
    public Boolean classUpdate(@RequestBody Classes classes){
        int i=classesService.classUpdate(classes);
        return i==0?false:true;
    }
}
