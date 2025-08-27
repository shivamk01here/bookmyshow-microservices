// src/main/java/com/bms/userservice/controller/UserController.java
package com.bms.userservice.controller;

import com.bms.userservice.model.User;
import com.bms.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "Register new user")
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @Operation(summary = "Find user by email")
    @GetMapping("/find")
    public User findByEmail(@RequestParam String email) {
        return userService.findByEmail(email);
    }
}
