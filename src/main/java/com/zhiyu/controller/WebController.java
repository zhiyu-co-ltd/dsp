package com.zhiyu.controller;

import com.zhiyu.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanpuhujin on 2016/12/23.
 */
@Controller
public class WebController {
    @RequestMapping("/test1")
    public String test1(Model model){
        model.addAttribute("msg","in test1");
        model.addAttribute("user","zhangsan");
        return "test";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public Object testJson(){
        //model.addAttribute("msg","in test1");
        User user = new User();
        user.setUserId("userId1");
        user.setUserName("zhangsan");
        return user;
    }
}
