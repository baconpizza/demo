package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String SearchId(int id){
        User user = userMapper.selectById(id);
        if (user != null)
            return user.toString();
        return "";
    }

    public String SelectUser(String name){
        User user = userMapper.selectUser(name);
        if (user != null)
            return user.toString();
        return "error";
    }
}
