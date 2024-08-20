package com.ha.pattern.chain_of_responsibility.controller;

import com.ha.pattern.chain_of_responsibility.model.User;
import com.ha.pattern.chain_of_responsibility.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping
  public ResponseEntity<User> create(@RequestBody User user) throws Exception {
    return ResponseEntity.ok(userService.create(user));
  }
}
