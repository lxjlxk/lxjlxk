package com.suse.demo.controller;

import com.suse.demo.entity.Teacher;
import com.suse.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/teacherList")
    public String teacherList(Model model){
        List<Teacher> teachers=teacherService.selectAllTeachers();
        model.addAttribute("teachers",teachers);
        return "teacher-list";
    }

    @GetMapping("/toTeacherAdd")
    public String toTeacherAdd(){
        return "teacher-add";
    }

    @PostMapping("/teacherAdd")
    @ResponseBody
    public Boolean teacherAdd(@RequestBody Teacher teacher){
        int i=teacherService.teacherAdd(teacher);
        return i==0?false:true;
    }

    @RequestMapping("/deleteByteacherId")
    public String deleteByteacherId(String teacherId){
        int i=teacherService.deleteByteacherId(teacherId);
        return "forward:/teacherList";
    }

    @RequestMapping("/selectByteacherId")
    public String selectByteacherId(String teacherId,Model model){
        Teacher teacher=teacherService.selectByteacherId(teacherId);
        model.addAttribute("teacher",teacher);
        return "teacher-update";
    }

    @PostMapping("/teacherUpdate")
    @ResponseBody
    public Boolean teacherUpdate(@RequestBody Teacher teacher){
        int i=teacherService.teacherUpdate(teacher);
        return i==0?false:true;
    }
}
