package com.stackroute.Muzix.exception;

public class NoTrackFoundException extends Exception {
    private String message;
    public NoTrackFoundException(){}
    public NoTrackFoundException(String message){
        super(message);
        this.message=message;
    }
}
