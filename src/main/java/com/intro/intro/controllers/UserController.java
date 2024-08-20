package com.intro.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.intro.intro.models.User;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Coscu","El princie");
        model.addAttribute("title", "First try with SpringBoot");
        model.addAttribute("user", user);
        return "details";
    }
}
