package com.stackroute.Muzix.service;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exception.NoSongListedException;
import com.stackroute.Muzix.exception.NoTrackFoundException;
import com.stackroute.Muzix.exception.SongAlreadyExistException;
import com.stackroute.Muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService
{
    private TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository)
    {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) throws SongAlreadyExistException, NoSongListedException {
        if(trackRepository.existsById(track.getId())){
            throw new SongAlreadyExistException("Song is already exist");
        }
        Track savedTrack= trackRepository.save(track);
        if(savedTrack==null)
            throw new NoSongListedException("No Song Enlisted");
        return savedTrack;
    }

    @Override
    public List<Track> getAllTracks() throws NoSongListedException {
        if (trackRepository.findAll()==null)
            throw new NoSongListedException("No song listed");
        return trackRepository.findAll();
    }

    @Override
    public boolean deleteTrack(int id) throws NoSongListedException {
        trackRepository.deleteById(id);
        return true;
    }

    @Override
    public Track updateTrack(Track track) throws NoTrackFoundException {
        Track updateTrack;
        if (trackRepository.existsById(track.getId())){
            updateTrack=trackRepository.save(track);
        }
        else{
            throw new NoTrackFoundException("not found");
        }

        return updateTrack;
    }

    @Override
    public Track findByName(String name) {
        System.out.println(trackRepository.findByName(name));
        return trackRepository.findByName(name);
    }


}
