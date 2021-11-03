package com.example.test.jpa.repository;

import com.example.test.jpa.dto.BoardDto;
import com.querydsl.core.QueryResults;

public interface BoardJpaRepositoryCustom {
    QueryResults<BoardDto> selectBoardQueryDsl();
}
