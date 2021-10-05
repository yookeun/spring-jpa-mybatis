package com.example.test.mybatis.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Getter
@Setter
@Alias("user")
public class User {
    private int userCode;
    private String userId;
    private String userName;
    private LocalDateTime createDate;
}
