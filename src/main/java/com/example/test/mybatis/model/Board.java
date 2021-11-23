package com.example.test.mybatis.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Getter
@Setter
@Alias("board")
public class Board {
    private int boardNo;
    private String title;
    private String content;
    private int userCode;
    private LocalDateTime createDate;
    private String userId;
    private String userName;
}
