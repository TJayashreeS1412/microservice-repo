package com.stackroute.Muzix.globalexceptionhandler;


import com.stackroute.Muzix.exception.NoSongListedException;
import com.stackroute.Muzix.exception.NoUserFoundException;
import com.stackroute.Muzix.exception.SongAlreadyExistException;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseStatus;



    @ControllerAdvice



    public class TrackExceptionHandler

    {

        //Logger logger = LoggerFactory.getLogger(TrackExceptionHandler.class);



        //logger.Info()



        @ResponseStatus(value= HttpStatus.BAD_REQUEST)

        @ExceptionHandler(NoUserFoundException.class)

        public void handleEmptyTrackListException(NoUserFoundException e)

        {

            //log.error("Not all mandatory fields are filled", e);

        }



        @ResponseStatus(value= HttpStatus.CONFLICT)

        @ExceptionHandler(SongAlreadyExistException.class)

        public void handleTrackAlreadyExistsException(SongAlreadyExistException e)

        {

            //log.error("User already exists", e);

        }



        @ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "Track Does Not Exist123")

        @ExceptionHandler(NoSongListedException.class)

        public void handleTrackDoesNotExistException(NoSongListedException e)

        {

            //logger.error("User does not exist", e);

            System.out.println(e.getMessage());

        }

    }



