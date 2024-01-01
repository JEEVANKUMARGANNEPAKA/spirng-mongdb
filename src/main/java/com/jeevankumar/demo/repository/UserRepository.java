package com.jeevankumar.demo.repository;

import com.jeevankumar.demo.entity.YourEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<YourEntity,Long> {
}
