package com.backend.project.service;

import com.backend.project.model.User;
import com.backend.project.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepository repository;

    public User createUser(User user){
         return repository.save(user);
    }

    public List<User> fetchUsers() {
        return repository.findAll();
    }

    public User findByUserId(int id) {
        return repository.findById(id).get();
    }
}
