package crud.controller;

import crud.model.User;
import crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class userController {


    UserService userService;

    @Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String getAllUsers(ModelMap model){
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

//    @GetMapping("/{id}/updateUser")
//    public String updateUser(@PathVariable("id") Long id, ModelMap model) {
//     //   model.addAttribute("user", userService.getUserById(id));
//        User user = userService.getUserById(id);
//        userService.updateUser(user);
//        model.addAttribute("user", user);
//        return "update";
//    }

    @GetMapping("/{id}/updateUser")
    public String updateUser(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("user", userService.getUserById(id));
        return "update";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

//    @PostMapping("/updateUser")
//    public String updateUser(@ModelAttribute("user") User user) {
//        userService.updateUser(user);
//        return "redirect:/";
//    }

    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.removeUser(id);
        return "redirect:/";
    }

    @GetMapping("/addUser")
    public String createUser(ModelMap model) {
        User user = new User();
        model.addAttribute("users", user);
        return "adduser";
    }
}
