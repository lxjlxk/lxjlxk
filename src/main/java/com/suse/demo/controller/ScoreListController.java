package com.suse.demo.controller;

import com.suse.demo.entity.ScoreList;
import com.suse.demo.service.ScoreListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreListController {
    @Autowired
    ScoreListService scoreListService;

    @GetMapping("/scoreList")
    public String scoreList(Model model){
        List<ScoreList> scoreLists=scoreListService.selectAllScores();
        model.addAttribute("scoreLists",scoreLists);
        return "score-list";
    }

    @GetMapping("/selectScoreBystuId")
    @ResponseBody
    public ScoreList selectScoreBystuId(String stuId){
        ScoreList scoreList=scoreListService.selectScoreBystuId(stuId);
        return  scoreList;
    }
}
