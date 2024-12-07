package com.example.userapi.model.User;

import com.example.userapi.repository.UserRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User userDetials) {
        User user = userRepository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));

        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        User user = userRepository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));

        userRepository.delete(user);
    }
}
