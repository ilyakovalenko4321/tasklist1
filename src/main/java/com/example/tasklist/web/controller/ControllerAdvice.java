package com.example.tasklist.web.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler
    public String handle(Exception e){
        e.printStackTrace();
        return e.getMessage();
    }

}
