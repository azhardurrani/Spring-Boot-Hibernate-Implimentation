package com.example.demo.controller;


import com.example.demo.model.UserDetails;
import com.example.demo.model.Users;
import com.example.demo.service.UserDetailsService;
import com.example.demo.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    UsersService usersService;

    @Autowired
    UserDetailsService userDetailsService;


    @GetMapping("/getAllUsers")
    List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("/getAllUserDetails")
    List<UserDetails> getAllUserDetails(){
        return userDetailsService.getAllUserDetails();
    }

    @PostMapping("/saveUser")
    Users saveUser(@RequestBody Users user){
        return usersService.addUsers(user);
    }

    @PostMapping("/saveUserDetails")
    UserDetails saveUser(@RequestBody UserDetails userDetails){
        return userDetailsService.saveUserDetails(userDetails);
    }


}
