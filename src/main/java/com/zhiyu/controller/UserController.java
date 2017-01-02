package com.zhiyu.controller;

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
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping
    public ModelAndView getAll() {
        ModelAndView result = new ModelAndView("index");
        List<User> userList = userService.getAll();
        for(int i=0;i<userList.size();i++){
            User user=userList.get(i);
            System.out.println("user"+user.getEmail());
        }
        return result;
    }
    @RequestMapping(value = "/view/{id}")
    @ResponseBody
    public User view(@PathVariable Integer id) {
       // ModelAndView result = new ModelAndView("index");
        User user = userService.getById(id);
        System.out.println("user:"+user.getId()+user.getEmail());
        return user;
    }
}
