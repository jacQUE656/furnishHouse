package com.example.ecommerce_web.EXCEPTIONS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> HandleAccessDeniedException(AccessDeniedException ex){
        String message="You do not have permission for this action";
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
}
