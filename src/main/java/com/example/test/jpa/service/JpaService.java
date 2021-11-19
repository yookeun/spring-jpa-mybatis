package com.example.test.jpa.service;

import com.example.test.jpa.dto.BoardDto;
import com.example.test.jpa.mapper.BoardMapper;
import com.example.test.jpa.model.Board;
import com.example.test.jpa.model.User;
import com.example.test.jpa.repository.BoardJpaRepository;
import com.example.test.jpa.repository.UserJpaRepository;
import com.querydsl.core.QueryResults;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class JpaService {
    private final UserJpaRepository userJpaRepository;
    private final BoardJpaRepository boardJpaRepository;
    private final BoardMapper boardMapper;

    @Transactional
    public void saveUser(User user) {
        userJpaRepository.save(user);
    }

    public User findUser(Integer userCode) {
        return userJpaRepository.findByUserCode(userCode);
    }

    @Transactional
    public void saveBoard(Board board) { boardJpaRepository.save(board); }

    public List<Board> selectBoard() { return boardJpaRepository.findAll(); }

    public QueryResults<BoardDto> selectBoardQueryDsl() { return boardJpaRepository.selectBoardQueryDsl(); }

    @Transactional
    public Board insertBoard(BoardDto boardDto) {
        //Board board = boardMapper.toEntity(boardDto);
        Board board = new Board();
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());
        board.setCreateDate(LocalDateTime.now());
        return boardJpaRepository.save(board);
    }
}
