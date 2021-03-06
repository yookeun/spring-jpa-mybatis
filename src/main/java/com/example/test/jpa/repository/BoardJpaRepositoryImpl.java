package com.example.test.jpa.repository;

import com.example.test.jpa.dto.BoardDto;
import com.example.test.jpa.dto.QBoardDto;
import com.example.test.jpa.model.Board;
import com.example.test.jpa.model.QBoard;
import com.example.test.jpa.model.QUser;
import com.querydsl.core.QueryResults;
import org.springframework.stereotype.Repository;

@Repository
public class BoardJpaRepositoryImpl extends QuerydslRepositorySupportExtended implements BoardJpaRepositoryCustom {

    private final QBoard qBoard = QBoard.board;
    private final QUser qUser = QUser.user;

    public BoardJpaRepositoryImpl() {
        super(Board.class);
    }

    //QueryResults : 조회한 리스트 + 전체 개수를 포함한 QueryResults 반환. count 쿼리가 추가로 실행된다.
    @Override
    public QueryResults<BoardDto> selectBoardQueryDsl() {
        return jpaQueryFactory().select(new QBoardDto(
                    qBoard.boardNo,
                    qBoard.title,
                    qBoard.content,
                    qBoard.createDate,
                    qUser.userCode,
                    qUser.userId,
                    qUser.userName
                ))
                .from(qBoard)
                .innerJoin(qUser)
                .on(qBoard.user.userCode.eq(qUser.userCode))
                .orderBy(qBoard.createDate.desc())
                .fetchResults();
    }
}