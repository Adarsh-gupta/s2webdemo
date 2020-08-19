package com.sheryians.s2webdemo.service;

import com.sheryians.s2webdemo.model.User;
import com.sheryians.s2webdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser() {


       return userRepository.findAll();
    }
    public Optional<User> getUserById(int id) {
       return  userRepository.findById(id);
    }
    public void removeUserById(int id) {
        userRepository.deleteById(id);
    }
    public void addUser(User user) {
     userRepository.save(user);
    }


}
