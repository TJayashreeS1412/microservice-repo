package com.stackroute.Muzix.service;


import com.stackroute.Muzix.domain.User;
import com.stackroute.Muzix.exception.NoSongListedException;
import com.stackroute.Muzix.exception.NoUserFoundException;
import com.stackroute.Muzix.exception.SongAlreadyExistException;
import com.stackroute.Muzix.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws SongAlreadyExistException, NoSongListedException {
        if(userRepository.existsById(user.getId())){
            throw new SongAlreadyExistException("Song is already exist");
        }
        User savedUser= userRepository.save(user);
        if(savedUser==null)
            throw new NoSongListedException("No Song Enlisted");
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() throws NoSongListedException {
        if (userRepository.findAll()==null)
            throw new NoSongListedException("No song listed");
        return userRepository.findAll();
    }

    @Override
    public boolean deleteUser(int id) throws NoSongListedException {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public User updateUser(User user) throws NoUserFoundException {
        User updateUser;
        if (userRepository.existsById(user.getId())){
            updateUser=userRepository.save(user);
        }
        else{
            throw new NoUserFoundException("not found");
        }

        return updateUser;
    }

    @Override
    public User findByName(String name) {
        System.out.println(userRepository.findByName(name));
        return userRepository.findByName(name);
    }


}
