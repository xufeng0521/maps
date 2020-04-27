package com.example.maps.service;

import com.example.maps.bean.User;
import com.example.maps.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 @author xuwenfeng
 */
@Service("UserService")
public class UserService {
    @Autowired(required = false)
    UserMapper userMapper;
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUsername());
    }
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

}
