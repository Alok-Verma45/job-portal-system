package com.alok.jobportal.controller;

import com.alok.jobportal.dto.RegisterRequest;
import com.alok.jobportal.entity.User;
import com.alok.jobportal.service.AuthService;

import jakarta.validation.Valid;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public User register(@Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }
}