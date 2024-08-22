package com.intro.intro.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intro.intro.models.User;
import com.intro.intro.models.dto.UserDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
    
    @GetMapping("/list-array-details")
    public List<User> listArrayDetails(){
        User user = new User("Zion","Lenox");
        User user2  = new User("Daddy","Bori");
        User user3 = new User("Menor","Targaryen");
        List<User> listUsers = Arrays.asList(user,user2,user3);
        return listUsers;
    }
    @GetMapping("/users")
    public List<User> usersModel(){
        List<User> users = Arrays.asList(
            new User("Sorry","I dont wanna"),
            new User("Shorty","I wanna do this"),
            new User("And this"," another")
        );
        return users;
    }
    @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name",defaultValue = "world")
        String name, Model model){
            model.addAttribute("title","This is the greeting view");
            model.addAttribute("name",name);
            return "greeting";
        }
    @GetMapping("/search")
    public String search(@RequestParam("query") String query, Model model){
        model.addAttribute("title","This is the @RequestParam example");
        model.addAttribute("query",query);
        return "search";
    }   
    @GetMapping("/user")
    public String user(@RequestParam(name="id",required = false) String id, Model model){
        model.addAttribute("id",id);
        return "userProfile";
    }
}
