package com.stackroute.Muzix.exception;

public class NoUserFoundException extends Exception {
    private String message;
    public NoUserFoundException(){}
    public NoUserFoundException(String message){
        super(message);
        this.message=message;
    }
}
