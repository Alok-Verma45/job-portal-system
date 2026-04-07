package com.alok.jobportal.service;

import com.alok.jobportal.dto.AuthResponse;
import com.alok.jobportal.dto.LoginRequest;
import com.alok.jobportal.dto.RegisterRequest;
import com.alok.jobportal.entity.User;

public interface AuthService {

    User register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}