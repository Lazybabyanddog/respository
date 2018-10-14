package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/controllerDemo")
public class ControllerDemo {

    @RequestMapping("/param")
    public String param(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "scuuess";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }
}
