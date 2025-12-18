package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;
@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(Resource)
}
