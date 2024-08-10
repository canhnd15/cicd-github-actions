package com.davidnguyen.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<ApiResponse<?>> getUsers() {
        List<User> users = IntStream.range(0, 10).mapToObj(i -> User.builder()
                        .firstName("firstname " + i)
                        .lastName("lastname " + i)
                        .username("username " + i)
                        .email("email_" + i + "@gmail.com")
                        .build())
                .collect(Collectors.toList());

        return ResponseEntity.ok(ApiResponse.builder()
                        .message("get users successfully!")
                        .code(100)
                        .response(users)
                .build());
    }
}
