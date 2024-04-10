package com.meetings.manager.controller;

import com.meetings.manager.model.User;
import com.meetings.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/meeting")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> usersList() {
        return userService.usersList();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> listUserById(@PathVariable Long id) {
        User user = userService.userListById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable String id) {
        long idUser = Long.parseLong(id);
        userService.deleteUserById(idUser);
        return ResponseEntity.ok().build();
    }
}
