package com.tc3.thinkInJava.dao;

import com.tc3.thinkInJava.bean.User;

import java.util.List;

public interface UserMapper {

    void addUser(User user);

    void deleteUserById(int id);

    void updateUser(User user);

    User getUserById(int id);

    List<User> getAllUser();
}
