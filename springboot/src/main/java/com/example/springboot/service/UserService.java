package com.example.springboot.service;


import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Long id);

    public void removeUser(Long id);

    public User findByUserName(String username);
}
