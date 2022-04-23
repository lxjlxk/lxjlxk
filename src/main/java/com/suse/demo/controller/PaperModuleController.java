package com.suse.demo.controller;

import com.suse.demo.entity.PaperModule;
import com.suse.demo.service.PaperModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PaperModuleController {
    @Autowired
    PaperModuleService paperModuleService;

    String moduleSubjectNumber;

    @RequestMapping("/selectBypaperModul")
    public String selectBypaperModul(String moduleSubject, Model model){
        moduleSubjectNumber=moduleSubject;
        List<PaperModule> paperModules=paperModuleService.selectBypaperModul(moduleSubject);
        if(paperModules.size()>0){
            model.addAttribute("paperModules",paperModules);
            return "paperModule-list";
        }
        else return "paperModule2-list";
    }

    @GetMapping("/toPaperModuAdd")
    public String toPaperModuAdd(Model model){
        model.addAttribute("moduleSubject",moduleSubjectNumber);
        return "paperModule-add";
    }

    @PostMapping("/moduleAdd")
    @ResponseBody
    public Boolean moduleAdd(@RequestBody PaperModule paperModule){
        int i=paperModuleService.moduleAdd(paperModule);
        return i==0?false:true;
    }

    @RequestMapping("/deleteBymoduleId")
    public String deleteBymoduleId(Integer moduleId){
        int i=paperModuleService.deleteBymoduleId(moduleId);
        return "forward:/selectBypaperModul?moduleSubject="+moduleSubjectNumber;
    }

    @RequestMapping("/selectBymoduleId")
    public String selectBymoduleId(Integer moduleId,Model model){
        PaperModule paperModule=paperModuleService.selectModuleBymoduleId(moduleId);
        model.addAttribute("paperModule",paperModule);
        model.addAttribute("moduleSubject",moduleSubjectNumber);
        return "paperModule-update";
    }

    @PostMapping("/moduleUpdate")
    @ResponseBody
    public Boolean moduleUpdate(@RequestBody PaperModule paperModule){
        int i=paperModuleService.moduleUpdate(paperModule);
        return i==0?false:true;
    }
}
