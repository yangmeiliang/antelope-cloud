package com.antelope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmeiliang
 */
@RestController
public class UserController {

    @GetMapping("/users/{}")
    public String user() {
        return "Tom";
    }
}
