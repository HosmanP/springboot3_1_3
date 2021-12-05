package com.example.springboot.dao;

import com.example.springboot.model.User;
import java.util.List;

public interface UserDao {
    void updateUser(User user);
    User getUserById(Long id);
    void saveUser(User user);
    void removeUser(Long id);
    List<User> getAllUsers();
    User getUserByName(String name);
}
