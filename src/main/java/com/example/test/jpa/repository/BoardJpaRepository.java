package com.example.test.jpa.repository;

import com.example.test.jpa.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BoardJpaRepository extends JpaRepository<Board, Integer>, BoardJpaRepositoryCustom {
    List<Board> findAll();
    Board findBoardByBoardNo(Integer boardNo);
}