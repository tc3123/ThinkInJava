package com.tc3.thinkInJava.service.impl;

import com.tc3.thinkInJava.bean.User;
import com.tc3.thinkInJava.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/mybaits-cfg.xml"})
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void addUser() {
    }

    @Test
    public void deleteUserById() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void getAllUser() {
        List<User> users = userService.getAllUser();
        Assert.assertEquals(0,users.size());
    }
}