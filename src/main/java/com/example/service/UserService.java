package com.example.service;

import com.example.modal.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public List<User> findAll();
    public User findById(int userId);

}
