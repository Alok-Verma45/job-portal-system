package com.alok.jobportal.service;

import com.alok.jobportal.dto.UserResponse;

public interface UserService {
    UserResponse getProfile(String email);
}
