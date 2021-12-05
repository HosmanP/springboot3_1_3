package com.example.springboot.service;

import com.example.springboot.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public void updateUser(User user, Long id);
    public User getUserById(Long id);
    public User getUserByName(String name);
    void removeUser(Long id);
}
