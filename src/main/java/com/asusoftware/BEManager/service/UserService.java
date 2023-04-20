package com.asusoftware.BEManager.service;

import com.asusoftware.BEManager.model.User;
import com.asusoftware.BEManager.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User findUserById(UUID id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
}
