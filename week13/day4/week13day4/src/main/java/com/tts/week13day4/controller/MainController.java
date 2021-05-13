package com.tts.week13day4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

    // this an endpoint
    // we can access this resource on this endpoint
    // all that we get back is a string
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    //going to an endpoint will resolve the method
    // meaning that any algorithms will also resolve
    @GetMapping("/math")
    public Integer doMath() {
        return 5 + 4;
    }

}
