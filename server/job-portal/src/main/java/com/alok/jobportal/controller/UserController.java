package com.alok.jobportal.controller;

import com.alok.jobportal.dto.UserResponse;
import com.alok.jobportal.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    public UserResponse getProfile(Authentication authentication) {

        String email = authentication.getName(); // comes from JWT

        return userService.getProfile(email);
    }
}