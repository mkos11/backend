package com.backend.project.controller;

import com.backend.project.model.User;
import com.backend.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
      User createdUser =  userService.createUser(user);
      if(createdUser != null){
          return createdUser;
      }else {
          return null;
      }
    }

    @GetMapping("/fetch")
    public List<User> fetchAllusers(){
        return userService.fetchUsers();
    }

    @GetMapping("/fetch/{id}")
    public User fetchUserByid(@PathVariable("id") int id){
        return userService.findByUserId(id);
    }

}
