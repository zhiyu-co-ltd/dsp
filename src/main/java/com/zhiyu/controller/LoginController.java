package com.zhiyu.controller;

import com.github.pagehelper.PageInfo;
import com.zhiyu.model.Country;
import com.zhiyu.model.User;
import com.zhiyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zhaojianfan on 16/12/30.
 */
@Controller
@RequestMapping("/test")
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/view/{id}")
    @ResponseBody
    public User view(@PathVariable Integer id) {
       // ModelAndView result = new ModelAndView("index");
        User user = userService.getById(id);
        System.out.println("user:"+user.getId()+user.getEmail());
        return user;
    }

    @RequestMapping
    public ModelAndView getAll() {
        ModelAndView result = new ModelAndView("index");
        return result;
    }
}
