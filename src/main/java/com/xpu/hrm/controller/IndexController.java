package com.xpu.hrm.controller;


import com.xpu.hrm.bean.PPlan;
import com.xpu.hrm.bean.UserInfo;
import com.xpu.hrm.service.PlanService;
import com.xpu.hrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Date 2019/7/9 9:54
 * @Created yangluo
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String getIndex(UserInfo userInfo){
        System.out.println(userInfo.getUserName());
        System.out.println(userInfo.getUserPassword());
        UserInfo user = userService.getUserByNameAndPwd(userInfo.getUserName(), userInfo.getUserPassword());
        if(user==null){
            //用户不存在
            return "index";
        }else if(user.getUserPassword().equals(userInfo.getUserPassword())){
            //密码正确
            return "action";
        }else{
            return "index";
        }
    }
}
