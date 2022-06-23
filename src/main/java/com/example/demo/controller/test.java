package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @RequestMapping("/web")
public class test {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String s(){
        return "123";
    }
    @RequestMapping("/SearchId")
    public String SearchId(int id){
        return userService.SearchId(id);
    }

    @RequestMapping("/SelectUser")
    public String SelectUser(String name){
        return userService.SelectUser(name);
    }


}
