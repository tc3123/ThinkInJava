package com.tc3.thinkInJava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {


    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String toUser(){
        return "user";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/role")
    public String toRole(){
        return "role";
    }


    @RequestMapping(method = RequestMethod.GET,value = "/permission")
    public String toPermission(){
        return "permission";
    }

}
