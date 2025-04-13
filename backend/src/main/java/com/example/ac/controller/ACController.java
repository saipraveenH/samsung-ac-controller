package com.example.ac.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ACController {
    @PostMapping("/api/ac/on")
    public String turnOn() {
        return "AC turned on";
    }

    @PostMapping("/api/ac/off")
    public String turnOff() {
        return "AC turned off";
    }

    @PostMapping("/api/ac/temp")
    public String setTemp(@RequestParam int temperature) {
        return "Temperature set to " + temperature;
    }
}
