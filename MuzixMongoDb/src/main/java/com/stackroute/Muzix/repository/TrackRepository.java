package com.stackroute.Muzix.repository;

import com.stackroute.Muzix.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.Mon;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer>
{
    //CRUD operations present in JpaRepository//
    public Track findByName(String name);
}
