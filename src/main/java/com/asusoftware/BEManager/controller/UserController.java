package com.asusoftware.BEManager.controller;

import com.asusoftware.BEManager.model.User;
import com.asusoftware.BEManager.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private UserService userService;

    @GetMapping(path = "/findById/{id}")
    public User findByName(@PathVariable(name = "id") UUID id) {
        System.out.println(id);
        User user = userService.findUserById(id);
        System.out.println(user);
      return user;
    }
}
