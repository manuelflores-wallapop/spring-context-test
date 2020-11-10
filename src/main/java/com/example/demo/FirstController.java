package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private final VeryImportant veryImportant;

    public FirstController(VeryImportant veryImportant) {
        this.veryImportant = veryImportant;
    }

    @GetMapping("/interfaz")
    public String interfaz() {
        return "Con Interfaz: " + veryImportant.message();
    }
}
