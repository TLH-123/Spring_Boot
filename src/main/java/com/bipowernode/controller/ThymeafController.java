package com.bipowernode.controller;


import com.bipowernode.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tpl")
public class ThymeafController {

    //标准变量表达式
    @GetMapping("/expression1")
    public String expression1(Model model){
        //添加数据到model
        model.addAttribute("site","www.bjpowernode.com");
        model.addAttribute("myuser",new SysUser(1001,"李四","男",12));

        //指定视图
        return "expression1";
    }

    //标准变量表达式
    @GetMapping("/expression2")
    public String expression2(Model model){
        //添加数据到model
        model.addAttribute("site","www.bjpowernode.com");
        model.addAttribute("myuser",new SysUser(1001,"李四","男",12));

        //指定视图
        return "expression2";
    }

    //连接表达式
    @GetMapping("/link")
    public String link(Model model){
        model.addAttribute("userId",1002);

        return "link";
    }

    //测试连接表达式的地址
    @GetMapping("queryAccount")
    @ResponseBody
    public String queryAccount(Integer id){
        return "queryAccount,参数id="+id;

    }

    //有两个参数的地址
    @GetMapping("/queryUser")
    @ResponseBody
        public String queryUser(String name,Integer age){
        return "queryUser,有两个参数：name"+name+",age="+age;
    }

    //循环list
    @GetMapping("/eachList")
        public String eachList(Model model){
        List<SysUser> users = new ArrayList<>();
        return "";
    }
}
