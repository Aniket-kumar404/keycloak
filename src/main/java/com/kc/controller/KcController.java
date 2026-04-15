package com.kc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KcController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint - no auth required";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "User endpoint - USER role required";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Admin endpoint - ADMIN role required";
    }
}