package com.global.dao;

import java.util.List; 

import com.global.beans.User;



public interface UserDao {
   void add(User user);
   List<User> listUsers();
}