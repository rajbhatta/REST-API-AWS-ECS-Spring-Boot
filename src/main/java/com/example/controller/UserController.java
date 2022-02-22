package com.example.controller;

import com.example.exception.ResourceNotFoundException;
import com.example.modal.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /*
        Input: No input
        Output: return 200, with json body
     */
    @GetMapping("/api/v1/users")
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    /*
        Input: userId
        Output: return 200, with json body
     */
    @GetMapping("/api/v1/users/{userId}")
    public ResponseEntity<User> findUserById(@PathVariable int userId) {
        try {
            User user = userService.findById(userId);
            return ResponseEntity.ok(user);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // return 404, with null body
        }
    }
}
