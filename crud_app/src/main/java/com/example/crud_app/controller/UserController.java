package com.example.crud_app.controller;


import com.example.crud_app.exception.UserNotFound;
import com.example.crud_app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.crud_app.repository.UserRepository;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody  User user) {
        return userRepository.save(user);

    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @GetMapping("/user/{id}")
    User getUser(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFound(id));
    }

}
