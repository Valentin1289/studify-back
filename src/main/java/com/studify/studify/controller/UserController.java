package com.studify.studify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/user" })
public class UserController {

    @GetMapping()
    public String hello() {
        return "Hello";
    }

    @GetMapping("/1")
    public String hello1() {
        return "Hello1";
    }

}
