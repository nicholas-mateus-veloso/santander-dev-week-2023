package me.dio.controller;

import me.dio.domain.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public interface UserControllerAPI {

    @GetMapping("/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<User> create(@RequestBody User userToCreate);
}
