package com.example.test.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private int userCode;
    private LocalDateTime createDate;

    //user
    private String userId;
    private String userName;

}
