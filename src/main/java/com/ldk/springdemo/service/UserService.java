package com.ldk.springdemo.service;

import com.ldk.springdemo.entity.UserEntity;
import com.ldk.springdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public UserEntity findById(Long id){
        return userMapper.findById(id);
    }
}
