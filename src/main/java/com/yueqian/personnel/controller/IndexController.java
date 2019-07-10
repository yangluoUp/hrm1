package com.yueqian.personnel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Date 2019/7/9 9:54
 * @Created yangluo
 */
@Controller
@RequestMapping("/user")
public class IndexController {


    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }
}
