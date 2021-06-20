package com.example.springjpamybatis.mybatis.repository;


import com.example.springjpamybatis.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(User user);
}
