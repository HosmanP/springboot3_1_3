package com.example.springboot.controller;

import com.example.springboot.service.RoleService;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    UserService userService;
    RoleService roleService;

    @Autowired
    public MyController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/admin/")
    public String goAdmin() {
       ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("allUsers");
        modelAndView.addObject("users", userService.getAllUsers());
        modelAndView.addObject("roles", roleService.getAllRoles());
        return "allUsers";
    }

    @GetMapping("/user/")
    public String goUser() {
        return "user";
    }
}
