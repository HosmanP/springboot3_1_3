package com.example.springboot.dao;

import com.example.springboot.model.User;
import java.util.List;

public interface UserDao {
    void updateUser(User user);
    User getUser(Long id);
    void saveUser(User user);
    void removeUser(Long id);
    List<User> getAllUsers();
    User findByUserName(String name);
}
