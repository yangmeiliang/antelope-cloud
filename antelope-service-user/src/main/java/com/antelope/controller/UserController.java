package com.antelope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmeiliang
 */
@RestController
public class UserController {

    @GetMapping("/users/{userId}")
    public String user(@PathVariable Integer userId) {
        return "user-".concat(userId.toString());
    }
}
