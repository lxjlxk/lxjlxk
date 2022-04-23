package com.suse.demo.controller;

import com.suse.demo.entity.*;
import com.suse.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
public class StuController {
    @Autowired
    StuService stuService;

    @Autowired
    ClassesService classesService;
    @Autowired
    ExamListService examListService;
    @Autowired
    TestPaperService testPaperService;
    @Autowired
    PaperModuleService paperModuleService;
    @Autowired
    ChoiceQuestionService choiceQuestionService;
    @Autowired
    JudgeQuestionService judgeQuestionService;
    @Autowired
    ScoreListService scoreListService;

    Stu stuGlobal;
    TestPaper testPaper;


    @GetMapping("/stuList")
    public String stuList(Model model){
        List<Stu> stus=stuService.selectAllStus();
        model.addAttribute("stus",stus);
        return "stu-list";
    }

    @GetMapping("/toStuAdd")
    public String toStuAdd(){
        return "stu-add";
    }

    @RequestMapping("/selectBystuId")
    public String selectBystuId(String stuId,Model model){
        Stu stu=stuService.selectBystuId(stuId);
        model.addAttribute("stu",stu);
        return "stu-update";
    }

    @RequestMapping("/deleteBystuId")
    public String deleteBystuId(String stuId,Model model){
        int i=stuService.deleteBystuId(stuId);
        //model.addAttribute("flag",i==0?false:true);
        return "forward:/stuList";  //转发请求 /stuList
    }

    @PostMapping("/stuUpdate")
    @ResponseBody
    public Boolean stuUpdate(@RequestBody Stu stu){
        int i=stuService.stuUpdate(stu);
        return i==0?false:true;
    }

    @PostMapping("/stuAdd")
    @ResponseBody
    public Boolean stuAdd(@RequestBody Stu stu){
        int i=stuService.stuAdd(stu);
        return i==0?false:true;
    }

    @RequestMapping("/stu")
    public String index() {
        return "stu-login";
    }

    @RequestMapping(value = "/stulogin", method = RequestMethod.POST)
    public String stulogin(String stuUsername, String stuPassword, Model model) {
        Stu stu = stuService.stulogin(stuUsername);
        if (stu == null) {
            model.addAttribute("msg", "学号或密码错误");
            return "stu-login";
        } else {
            //验证学号和密码相同
            if(stuUsername.equals(stuPassword.trim())){
                stuGlobal=stu;
                return "stuExam-index";
            }
            else {
                model.addAttribute("msg", "学号或密码错误");
                return "stu-login";
            }
        }
    }

    @GetMapping("/stuExam")
    public String stuExam(Model model) throws ParseException {
        Stu stu =stuGlobal;
        String className;
        List<Classes> classesList=classesService.selectByGradeAndClass(stu.getStuGrade(),stu.getStuClass());
        if(classesList.size()>0) {
            className = classesList.get(0).getClassesName();
            List<ExamList> examLists=examListService.selectExamsByClass(className);
            if(examLists.size()>0) {
                List<ExamList> examListsNew = new ArrayList<>();
                List<ExamList> examListsOld = new ArrayList<>();

                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dateFormat.format(new Date());// new Date()为获取当前系统时间
                    for (int i = 0; i < examLists.size(); i++) {
                        ExamList exam = examLists.get(i);
                        if (dateFormat.parse(date).getTime() > dateFormat.parse(exam.getExamDate()).getTime()) {
                            examListsOld.add(exam);
                        } else {
                            examListsNew.add(exam);
                        }
                    }
                    model.addAttribute("examListsOld",examListsOld);
                    model.addAttribute("examListsNew",examListsNew);

                return "stuExam-list";
            }
            else{
                model.addAttribute("msg", "暂无考试");
                return "stuExam-index";
            }
        }
        else{
            model.addAttribute("msg", "暂无考试");
            return "stuExam-index";
        }
    }

    @RequestMapping("/examStart")
    public String examStart(String examId,Model model){
        ExamList exam=examListService.selectByexamId(examId);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(new Date());// new Date()为获取当前系统时间
        if (exam.getExamDate().equals(date)){
            //查找考试试卷信息
            testPaper=testPaperService.selectBypaperId(exam.getExamPaper());
            model.addAttribute("testPaper",testPaper);
            //查找试卷模块
            List<PaperModule> paperModuleList=paperModuleService.selectBySubject(testPaper.getPaperId());
            if(paperModuleList.size()>0){
                PaperModule module;
                //存储所有该学科的题
                List<ChoiceQuestion> choiceList=new ArrayList<>();
                List<JudgeQuestion> judgeList=new ArrayList<>();
                //存储随机抽取的题
                Random random = new Random();
                List<ChoiceQuestion> choiceRandomList=new ArrayList<>();
                List<JudgeQuestion> judgeRandomList=new ArrayList<>();
                for(int i=0;i<paperModuleList.size();i++){
                    module=paperModuleList.get(i);
                    if(module.getModuleType().equals("选择题")){
                        //找出属于该试卷学科的所有选择题
                        choiceList=choiceQuestionService.selectChoiceBySubject(testPaper.getPaperSubject());
                        //随机取出选择题对应的个数
                        int j = 0;
                        while (j <module.getModuleNumber()) {
                            j++;
                            int rand=random.nextInt(choiceList.size());
                            choiceRandomList.add(choiceList.get(rand));
                            choiceList.remove(rand);
                        }
                    }//找判断题
                    else {
                        judgeList=judgeQuestionService.selectJudgeBySubject(testPaper.getPaperSubject());
                        int k = 0;
                        while (k<module.getModuleNumber()) {
                            k++;
                            int rand=random.nextInt(judgeList.size());
                            judgeRandomList.add(judgeList.get(rand));
                            judgeList.remove(rand);
                        }
                    }
                }

                model.addAttribute("choiceRandomList",choiceRandomList);
                model.addAttribute("judgeRandomList",judgeRandomList);
            }
            return "stuExam-start";
        }
        else {
            model.addAttribute("msg","考试日期还没有到");
            return "forward:/stuExam";
        }
    }

    @GetMapping("/stuExamEnd")
        public String stuExamEnd(String testPaperId,int judgeRight,int choiceRight,Model model){
            int sumScore = 0;
            List<PaperModule> paperModuleList=paperModuleService.selectBySubject(testPaperId);
            for (PaperModule paperModule : paperModuleList) {
                int score = paperModule.getModuleScore() / paperModule.getModuleNumber();
                if(paperModule.getModuleType().equals("选择题")){
                    sumScore += score * judgeRight;
                }else{
                    sumScore += score * choiceRight;
                }
            }
            ScoreList scoreStu=new ScoreList();
            scoreStu.setStuId(stuGlobal.getStuId());
            scoreStu.setStuName(stuGlobal.getStuName());
            scoreStu.setStuSubject(testPaper.getPaperSubject());
            scoreStu.setStuScore(sumScore);
            int i=scoreListService.insert(scoreStu);


            model.addAttribute("end","考试已结束！");
            return "stuExam-index";
    }


}
