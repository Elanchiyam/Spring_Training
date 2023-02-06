package com.global.service;

import java.util.List; 

import com.global.beans.User;

public interface UserService {
    void add(User user);
    List<User> listUsers();
}
