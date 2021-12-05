package com.example.springboot.controller;


import com.example.springboot.model.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/user")
	public String getUsers(ModelMap model, @AuthenticationPrincipal UserDetails currentUser) {
		User user = userService.getUserByName(currentUser.getUsername());
		model.addAttribute("user", user);
		return "user";
	}
}