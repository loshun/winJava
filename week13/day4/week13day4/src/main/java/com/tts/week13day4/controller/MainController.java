package com.tts.week13day4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController("/main")
public class MainController {

    // this an endpoint
    // we can access this resource on this endpoint
    // all that we get back is a string
    @RequestMapping("/hello")
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String homeWithName(@PathVariable String name) {
        return "Hello " + name;
    }

    //going to an endpoint will resolve the method
    // meaning that any algorithms will also resolve
    @GetMapping("/math")
    public Integer doMath() {
        return 5 + 4;
    }

    @RequestMapping("/print")
    public void doPrint() {
        System.out.println("Hello from the terminal");
    }

    @GetMapping("/parammath/{x}/{y}")
    public Integer doMathWithParams(@PathVariable int x,
                                    @PathVariable int y) {
        return x +y;
    }

    // x and y act like placeholders
    // an end user can put in any legal integer
    // so that the method resolves
    // x and y will be used as method arguments
    // this works because of the annotation @PathVariable
    // thus, our endpoint resource is dynamic
    @GetMapping("/math/sub/{x}/{y}")
    public Integer doSubtraction (@PathVariable int x, @PathVariable int y) {
        return x - y;
    }
}
