package com.example.test.mybatis.service;


import com.example.test.mybatis.model.Board;
import com.example.test.mybatis.model.User;
import com.example.test.mybatis.repository.BoardMyBatisMapper;
import com.example.test.mybatis.repository.UserMyBatisMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MyBatisService {
    private final UserMyBatisMapper userMapper;
    private final BoardMyBatisMapper boardMapper;

    @Transactional
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Transactional
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Transactional
    public void insertBoard(Board board) {
        boardMapper.insertBoard(board);
    }

    public List<Board> selectBoard() {
        return boardMapper.selectBoard();
    }



}
