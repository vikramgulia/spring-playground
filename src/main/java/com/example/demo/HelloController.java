package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions/bysurvey")
public class HelloController {

    @GetMapping("/all")
    public String helloWorld() {
        return "Hello from Spring!";
    }

}