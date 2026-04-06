package com.alok.jobportal.service.impl;

import com.alok.jobportal.dto.RegisterRequest;
import com.alok.jobportal.entity.Role;
import com.alok.jobportal.entity.User;
import com.alok.jobportal.repository.UserRepository;
import com.alok.jobportal.service.AuthService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public User register(RegisterRequest request) {

        // Check if email already exists
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        // Convert DTO → Entity
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword()) // later we will encrypt 🔐
                .role(Role.USER)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        return userRepository.save(user);
    }
}