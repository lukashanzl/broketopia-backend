package com.broketopia.broketopiabackend.controllers.user;

import com.broketopia.broketopiabackend.models.User;
import com.broketopia.broketopiabackend.repositories.UserRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable @Validated Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
