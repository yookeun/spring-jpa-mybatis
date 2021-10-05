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
    private int userNo;
    private LocalDateTime createDate;
}