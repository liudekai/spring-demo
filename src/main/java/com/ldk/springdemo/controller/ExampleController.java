package com.ldk.springdemo.controller;

import com.ldk.springdemo.entity.UserEntity;
import com.ldk.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public UserEntity getUser(@RequestParam(required = true) Long id){
        return userService.findById(id);
    }
}
