package com.demo.demo2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.demo2.entity.User;
import com.demo.demo2.repo.UserRepo;

@Controller
public class UserController {
    
    @Autowired(required = true)
    private UserRepo repo;

    @GetMapping("/")
    public String login(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("/userLogin")
    public String loginUser(@ModelAttribute("user") User user){
       
       
        String username=user.getUsername();
       Optional<User> userdata= repo.findById(username);
       if(user.getPassword().equals(userdata.get().getPassword())){
            return "home";
       }
       else{
            return "error";
       }
    }
}

