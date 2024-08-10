package com.davidnguyen.cicd.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
}
