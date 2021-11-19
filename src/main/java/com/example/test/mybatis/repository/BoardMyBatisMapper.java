package com.example.test.mybatis.repository;


import com.example.test.mybatis.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMyBatisMapper {
    int insertBoard(Board board);
    List<Board> selectBoard();
    int updateBoard(Board board);
    int deleteBoard(Board board);
}
