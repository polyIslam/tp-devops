
package com.tp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevOps version 1.0.0 !";
    }

    @GetMapping("/version")
    public String version() {
        return "1.0.0";
    }
}
