package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    private final VeryImportant veryImportantImpl;

    public SecondController(HelloWorld veryImportantImpl) {
        this.veryImportantImpl = veryImportantImpl;
    }

    @GetMapping("/class")
    public String withClass() {
        return "Con class: " + veryImportantImpl.message();
    }
}
