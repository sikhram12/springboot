package com.example.sikhram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * Returns the user's details from the active session.
     * 
     * @return user details
     */
    @GetMapping(value = "/test")
    public String test() {

        return "Hello World";
    }
    
    @GetMapping(value = "/user/{name}")
    public String returnUserDetails(@PathVariable("name") String name) {

        return "Hello "+name;
    }
}