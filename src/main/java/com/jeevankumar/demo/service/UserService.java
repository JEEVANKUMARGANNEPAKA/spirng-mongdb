package com.jeevankumar.demo.service;

import com.jeevankumar.demo.entity.YourEntity;
import com.jeevankumar.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository repository;

    public YourEntity createUser(YourEntity yourEntity){
        log.info("starting User save to database........!");
        YourEntity entity= repository.save(yourEntity);
        return yourEntity;

    }
}
