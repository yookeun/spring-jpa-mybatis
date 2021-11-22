package com.example.test.jpa.service;

import com.example.test.jpa.dto.BoardDto;
import com.example.test.jpa.mapper.BoardMapper;
import com.example.test.jpa.model.Board;
import com.example.test.jpa.repository.BoardJpaRepository;
import com.querydsl.core.QueryResults;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class JpaService {
    private final BoardJpaRepository boardJpaRepository;
    private final BoardMapper boardMapper;

    public QueryResults<BoardDto> selectBoardQueryDsl() { return boardJpaRepository.selectBoardQueryDsl(); }

    @Transactional
    public Board saveBoard(BoardDto boardDto) {
        Board board = boardMapper.toEntity(boardDto);
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setCreateDate(LocalDateTime.now());
        return boardJpaRepository.save(board);
    }

    @Transactional
    public Board deleteBoard(BoardDto boardDto) {
        Board board = boardJpaRepository.findBoardByBoardNo(boardDto.getBoardNo());
        if (board == null) return null;
        boardJpaRepository.delete(board);
        return board;
    }
}
