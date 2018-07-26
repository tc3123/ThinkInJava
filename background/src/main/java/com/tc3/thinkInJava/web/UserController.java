package com.tc3.thinkInJava.web;

import com.alibaba.fastjson.JSON;
import com.tc3.thinkInJava.bean.User;
import com.tc3.thinkInJava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/list/all",method=RequestMethod.GET)
    @ResponseBody
    public String getAllUser(){
        List<User> users = userService.getAllUser();
        String usersJson = JSON.toJSONString(users);
        return usersJson;
    }


}
