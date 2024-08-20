package com.intro.intro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intro.intro.models.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String,Object> details() {
        User user = new User("Menor","Acuaman");
        Map<String,Object> body = new HashMap<>();
        body.put("title", "first try with SpringBoot");
        body.put("user",user);
        return body;
    }
    

}
