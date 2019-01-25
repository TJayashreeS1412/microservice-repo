package com.stackroute.Muzix.service;

import com.stackroute.Muzix.domain.Track;
import com.stackroute.Muzix.exception.NoSongListedException;
import com.stackroute.Muzix.exception.NoTrackFoundException;
import com.stackroute.Muzix.exception.SongAlreadyExistException;

import java.util.List;

public interface TrackService
{
    public Track saveTrack(Track track) throws SongAlreadyExistException, NoSongListedException;

    public List<Track> getAllTracks() throws NoSongListedException;

    public boolean deleteTrack(int id) throws NoSongListedException;

    public Track updateTrack(Track track) throws NoTrackFoundException;
    public Track findByName(String name);

}
