package com.example.test.jpa.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BoardDto {
    private int boardNo;
    private String title;
    private String content;
    private int userCode;

    public LocalDateTime createDate;
    private String userId;
    private String userName;

    @QueryProjection
    public BoardDto(int boardNo, String title, String content, LocalDateTime createDate, int userCode, String userId, String userName) {
        this.boardNo = boardNo;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.userCode = userCode;
        this.userId = userId;
        this.userName = userName;
    }
}
