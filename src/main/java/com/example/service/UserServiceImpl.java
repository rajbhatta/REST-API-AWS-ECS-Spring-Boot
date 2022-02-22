package com.example.service;

import com.example.modal.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    @Override
    public List<User> findAll() {
        List<User> usersList= new ArrayList<>();
        usersList.add(new User(1,"User1", 28, 400000));
        usersList.add(new User(2,"User2", 38, 450000));
        usersList.add(new User(3,"User3", 39, 490000));
        usersList.add(new User(6,"User8", 38, 450000));
        usersList.add(new User(8,"User6", 39, 490000));
        return usersList;
    }

    @Override
    public User findById(int userId) {
        return new User(1,"User1", 28, 400000);
    }
}
