package com.suse.demo.controller;

import com.suse.demo.entity.Admin;
import com.suse.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Admin admin, Model model,HttpSession session) {
        Admin adminInDB = adminService.login(admin);
        if (adminInDB == null) {
            model.addAttribute("admin", admin);
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        } else {
            //登录成功
            session.setAttribute("admin", adminInDB);
            session.setMaxInactiveInterval(4*60*60); //设置session会话时间，秒为单位，4小时
            return "index";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();//清除登录信息
        return "login";
    }

    @GetMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @GetMapping("/selectByName")
    @ResponseBody//表示不返回页面
    public Boolean selectByName(String name){
        //true表示用户名不存在，可以注册
        //false表示用户名存在，不能注册
        boolean flag=adminService.selectByName(name);
        return flag;
    }

    @PostMapping("/register")
    @ResponseBody
    public Boolean register(@RequestBody Admin admin){
        int i=adminService.insertAdmin(admin);
        return i==0?false:true;
    }

}
