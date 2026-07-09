package com.devtiro.Blog.service;

import com.devtiro.Blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
