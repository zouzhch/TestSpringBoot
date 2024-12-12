package com.qfedu.zayn.testspringboot.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHandler {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("world")
    public String sayWorld() {
        return "World!";
    }
}
