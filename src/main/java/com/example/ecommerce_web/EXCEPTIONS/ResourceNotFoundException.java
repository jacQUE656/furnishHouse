package com.example.ecommerce_web.EXCEPTIONS;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message){
        super(message);
    }
}
