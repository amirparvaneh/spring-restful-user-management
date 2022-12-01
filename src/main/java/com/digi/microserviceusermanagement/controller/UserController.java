package com.digi.microserviceusermanagement.controller;


import com.digi.microserviceusermanagement.model.entity.User;
import com.digi.microserviceusermanagement.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping
    public User getUserById(@RequestParam Long userId) {
        return userService.findById(userId);
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userService.findAll();
    }

    @PostMapping
    public ResponseEntity<User> saveUserById(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(user);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        userService.update(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(user);
    }

    @DeleteMapping
    public ResponseEntity<User> deleteUserById(@RequestParam Long userId) {
        userService.delete(userId);
        User user = userService.findById(userId);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(user);
    }
}
