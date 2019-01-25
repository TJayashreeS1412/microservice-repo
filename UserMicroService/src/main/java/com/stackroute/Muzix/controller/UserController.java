package com.stackroute.Muzix.controller;


import com.stackroute.Muzix.domain.User;
import com.stackroute.Muzix.service.UserService;
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
public class UserController
{
    private User user;
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @ApiOperation(value = "Save all songs", response = ResponseEntity.class)

    @PostMapping("user")
    public ResponseEntity<?>saveUser(@RequestBody User User)
    {
        ResponseEntity responseEntity;
        try
        {
            userService.saveUser(user);//Call to saveUser() passing the user object recieved from request//
            responseEntity=new ResponseEntity<User>(user,HttpStatus.CREATED);
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
    @GetMapping("user")
    public ResponseEntity<?> getAllUsers() {
     ResponseEntity responseEntity;
     try {
         userService.getAllUsers();
         responseEntity=new ResponseEntity<List<User>>(HttpStatus.FOUND);

     }

     catch (Exception e){
         responseEntity=new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);

     }
     return responseEntity;
    }
    @ApiOperation(value = "Delete a User")
    @DeleteMapping(value = "user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id)
    {
        ResponseEntity responseEntity;
        try {
            userService.deleteUser(id);
            responseEntity=new ResponseEntity<>("user deleted",HttpStatus.GONE);
        }
        catch (Exception e)
        {
            responseEntity=new ResponseEntity<String>(e.getMessage(),HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    @ApiOperation(value = "Update your user list")
   @PutMapping("user")
    public ResponseEntity<?> updateusers(@RequestBody User user){
        ResponseEntity responseEntity;
        try{
            userService.updateUser(user);
            responseEntity=new ResponseEntity<>("user updated",HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            responseEntity=new ResponseEntity<>(e.getMessage(),HttpStatus.ALREADY_REPORTED);
        }
        return responseEntity;
   }
   @ApiOperation(value = "Get user by name")
    @RequestMapping("/name")
    public ResponseEntity<?> getByname(@PathVariable("name") String name){
        ResponseEntity responseEntity;
        userService.findByName(name);
       responseEntity=new ResponseEntity<>("user updated",HttpStatus.FOUND);
       return responseEntity;
   }

}
