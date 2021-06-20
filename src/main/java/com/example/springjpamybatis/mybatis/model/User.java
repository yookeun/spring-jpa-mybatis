package com.example.springjpamybatis.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private int userNo;
    private String userId;
    private String userName;
    private LocalDateTime createDate;
}
