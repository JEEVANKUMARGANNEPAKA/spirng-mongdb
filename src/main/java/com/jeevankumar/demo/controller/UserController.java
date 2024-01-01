package com.jeevankumar.demo.controller;

import com.jeevankumar.demo.entity.YourEntity;
import com.jeevankumar.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/createUser")
    @ResponseStatus(HttpStatus.CREATED)
    public YourEntity createUser(@RequestBody YourEntity yourEntity) {
        return service.createUser(yourEntity);
    }

}
