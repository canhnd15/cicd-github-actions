package com.davidnguyen.cicd.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class ApiResponse<T> {
    private String message;
    private int code;
    private T response;
}
