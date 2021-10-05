package com.example.test.mybatis.repository;


import com.example.test.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMyBatisMapper {
    int insertUser(User user);
    List<User> selectUser();
    int updateUser(User user);
}
