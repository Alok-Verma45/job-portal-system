package com.alok.jobportal.service;

import com.alok.jobportal.dto.RegisterRequest;
import com.alok.jobportal.entity.User;

public interface AuthService {

    User register(RegisterRequest request);
}