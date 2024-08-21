package com.intro.intro.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> userList = Arrays.asList(
            new User("La", "DobleA","la@doblea"),
            new User("Neutro","Big","big@neutro"),
            new User("how","cani","be@mybish")
        );
        model.addAttribute("title","Showing content of a list");
        model.addAttribute("users",userList);
        return "list";//Here is the view name
    }
}
