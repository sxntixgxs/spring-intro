package com.intro.intro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intro.intro.models.User;
import com.intro.intro.models.dto.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDTO details() {
        UserDTO userDto = new UserDTO();
        User user = new User("Till","Collapse");
        userDto.setTitle("Second try with SpringBoot");
        userDto.setUser(user);
        return userDto;
    }

    @GetMapping("/list-details")
    public List<User> listdetails(){
        User user = new User("Emmanuel", "Gazmey");
        User user2 = new User("Re","Malo");
        User user3 = new User("Post","Malon");
        List<User> listUsers = new ArrayList<>();
        listUsers.add(user);
        listUsers.add(user2);
        listUsers.add(user3);
        return listUsers;
    }
    

}
