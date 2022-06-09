package com.example.pgelasticsync.controller;

import com.example.pgelasticsync.model.User;
import com.example.pgelasticsync.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
