package com.example.ecommerce_web.EXCEPTIONS;

public class AlreadyExistsException extends RuntimeException{
    public AlreadyExistsException(String message){
        super(message);
    }
}
