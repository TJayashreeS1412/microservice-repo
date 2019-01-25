package com.stackroute.Muzix.repository;


import com.stackroute.Muzix.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.jpa.repository.Mon;

@Repository
public interface UserRepository extends MongoRepository<User,Integer>
{
    //CRUD operations present in JpaRepository//
    public User findByName(String name);
}
