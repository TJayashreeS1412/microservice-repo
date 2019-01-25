package com.stackroute.Muzix.exception;

public class SongAlreadyExistException extends Exception {
    private String message1;
    public SongAlreadyExistException(String message1)
    {
        super(message1);
        this.message1 = message1;
    }
    public SongAlreadyExistException()
    {    }
}
