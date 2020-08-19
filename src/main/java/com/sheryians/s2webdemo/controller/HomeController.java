package com.sheryians.s2webdemo.controller;

import com.sheryians.s2webdemo.model.User;
import com.sheryians.s2webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "index";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.removeUserById(id);
        return "redirect:/";

    }
    @GetMapping("/register")
    public String registerGet(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
    @PostMapping("/register")
    public String registerPost(@ModelAttribute("user") User user){
        System.out.println("naye user ki id " + user.getId());
        userService.addUser(user);
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String registerGet(@PathVariable int id, Model model) {
        Optional<User> user = userService.getUserById(id);
        if(user.isPresent()) {
            model.addAttribute("user", user.get());
            return "register";
        } else
            return "usernotfound";
    }

}
