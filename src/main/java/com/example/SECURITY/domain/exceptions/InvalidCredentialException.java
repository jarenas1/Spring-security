package com.example.SECURITY.domain.exceptions;

public class InvalidCredentialException extends RuntimeException{
    public  InvalidCredentialException(String message){
        super(message);
    }
}
