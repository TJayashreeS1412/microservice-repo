package com.stackroute.Muzix.exception;

public class NoSongListedException extends Exception {
    private String message;
    public NoSongListedException(){}
    public NoSongListedException(String message){
        super(message);
        this.message=message;
    }
}
