package com.habeebcycle.onlinepoll.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // Status 500
public class AppException extends RuntimeException{

    public AppException(String message){
        super(message);
    }

    public AppException(String message, Throwable cause){
        super(message, cause);
    }
}
