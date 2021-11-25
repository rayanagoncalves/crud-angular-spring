package com.rayana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class CrudSpringController {

    @GetMapping
    public String hello() {
        return "Hello, World!";
    }

}
