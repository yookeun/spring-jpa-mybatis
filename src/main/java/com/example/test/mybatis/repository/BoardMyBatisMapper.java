package com.example.test.mybatis.repository;


import com.example.test.mybatis.model.Board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMyBatisMapper {
    int insertBoard(Board board);
}
