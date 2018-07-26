package com.tc3.thinkInJava.service.impl;

import com.tc3.thinkInJava.bean.User;
import com.tc3.thinkInJava.dao.UserMapper;
import com.tc3.thinkInJava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User getUserById(int id) {
        return  userMapper.getUserById(id);
    }

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
