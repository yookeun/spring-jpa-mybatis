package com.example.test.jpa.repository;

import com.example.test.jpa.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardJpaRepository extends JpaRepository<Board, Integer> {
}
