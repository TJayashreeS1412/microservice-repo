package com.stackroute.Muzix.service;

import com.stackroute.Muzix.domain.User;
import com.stackroute.Muzix.exception.NoSongListedException;
import com.stackroute.Muzix.exception.NoUserFoundException;
import com.stackroute.Muzix.exception.SongAlreadyExistException;

import java.util.List;

public interface UserService
{
    public User saveUser(User user) throws SongAlreadyExistException, NoSongListedException;

    public List<User> getAllUsers() throws NoSongListedException;

    public boolean deleteUser(int id) throws NoSongListedException;

    public User updateUser(User user) throws NoUserFoundException;
    public User findByName(String name);

}
