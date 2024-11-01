package com.colak.springtutorial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
class HelloController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        log.info("---------Hello method started---------");
        return "Hello world";
    }
}
