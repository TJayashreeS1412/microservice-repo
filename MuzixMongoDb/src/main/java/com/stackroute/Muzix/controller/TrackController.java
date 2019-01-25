package com.stackroute.Muzix.controller;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exception.NoSongListedException;
import com.stackroute.Muzix.service.TrackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/v1")
@Api(value="SongMangaer", description="add delete update and see all your songs")
public class TrackController
{

    private TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService)
    {
        this.trackService = trackService;
    }

    @ApiOperation(value = "Save all songs", response = ResponseEntity.class)

    @PostMapping("track")
    public ResponseEntity<?>saveTrack(@RequestBody Track track)
    {
        ResponseEntity responseEntity;
        try
        {
            trackService.saveTrack(track);//Call to saveUser() passing the user object recieved from request//
            responseEntity=new ResponseEntity<Track>(track,HttpStatus.CREATED);
        }
        catch (Exception exception)
        {
            responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    @ApiOperation(value = "View a list of available songs", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @GetMapping("track")
    public ResponseEntity<?> getAllTracks() {
     ResponseEntity responseEntity;
     try {
         trackService.getAllTracks();
         responseEntity=new ResponseEntity<List<Track>>(HttpStatus.FOUND);

     }

     catch (Exception e){
         responseEntity=new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);

     }
     return responseEntity;
    }
    @ApiOperation(value = "Delete a track")
    @DeleteMapping(value = "track/{id}")
    public ResponseEntity<?> deleteTrack(@PathVariable("id") int id)
    {
        ResponseEntity responseEntity;
        try {
            trackService.deleteTrack(id);
            responseEntity=new ResponseEntity<>("track deleted",HttpStatus.GONE);
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    @ApiOperation(value = "Update your track list")
   @PutMapping("track")
    public ResponseEntity<?> updateTracks(@RequestBody Track track){
        ResponseEntity responseEntity;
        try{
            trackService.updateTrack(track);
            responseEntity=new ResponseEntity<>("track updated",HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.ALREADY_REPORTED);
        }
        return responseEntity;
   }
   @ApiOperation(value = "Get track by name")
    @RequestMapping("/name")
    public ResponseEntity<?> getByname(@PathVariable("name") String name){
        ResponseEntity responseEntity;
        trackService.findByName(name);
       responseEntity=new ResponseEntity<>("track updated",HttpStatus.FOUND);
       return responseEntity;
   }

}
