package com.example.springboot.config;


import com.example.springboot.model.Role;
import com.example.springboot.model.User;
import com.example.springboot.service.RoleService;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class UserAdminInit {

    private UserService userService;
    private RoleService roleService;

    @Autowired
    public UserAdminInit(UserService userService, RoleService roleDao) {
        this.userService = userService;
        this.roleService = roleDao;
    }

    @PostConstruct
    void init() {
        Set<Role> setAdmin = new HashSet<>();
        Role roleUser = new Role("USER");
        Role roleAdmin = new Role("ADMIN");
        roleService.saveRole(roleUser);
        roleService.saveRole(roleAdmin);
        setAdmin.add(roleService.findByRoleId(1L));
        setAdmin.add(roleService.findByRoleId(2L));
        User admin = new User("ADMIN", "ADMIN", "ADMIN", setAdmin);
        Set<Role> setUser = new HashSet<>();
        setUser.add(roleService.findByRoleId(1L));
        User normalUser = new User("USER", "USER", "USER", setUser);
        userService.saveUser(admin);
        userService.saveUser(normalUser);
    }
}
