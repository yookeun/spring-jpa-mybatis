package com.example.test.mybatis.service;


import com.example.test.mybatis.model.Board;
import com.example.test.mybatis.repository.BoardMyBatisMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MyBatisService {
    private final BoardMyBatisMapper boardMapper;

    @Transactional
    public int insertBoard(Board board) {
        return boardMapper.insertBoard(board);
    }

    public List<Board> selectBoard() {
        return boardMapper.selectBoard();
    }

    @Transactional
    public int updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

    @Transactional
    public int deleteBoard(Board board) {
        return boardMapper.deleteBoard(board);
    }

}
