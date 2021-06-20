package com.example.springjpamybatis.service;


import com.example.springjpamybatis.mybatis.model.User;
import com.example.springjpamybatis.mybatis.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    @Transactional
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}
