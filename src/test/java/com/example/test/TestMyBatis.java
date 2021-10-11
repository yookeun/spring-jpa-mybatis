package com.example.test;

import com.example.test.mybatis.model.Board;
import com.example.test.mybatis.model.User;
import com.example.test.mybatis.service.MyBatisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class TestMyBatis {
    @Autowired
    private MyBatisService service;

    @Test
    public void Mybatis_유저등록() {
        User user = new User();
        user.setUserId("hong1");
        user.setUserName("홍길동1");
        service.insertUser(user);
    }

    @Test
    public void Mybatis_유저조회() {
        List<User> userList =  service.selectUser();
        for (User user1: userList) {
            System.out.println(user1.getUserCode() + ", " + user1.getUserId() + ", " +  user1.getUserName());
        }
    }

    @Test
    public void Mybatis_유저수정() {
        User user = new User();
        user.setUserCode(1);
        user.setUserName("홍길동1");
        user.setCreateDate(LocalDateTime.now());
        service.updateUser(user);
    }


    @Test
    public void Mybatis_게시판등록() {
        Board board = new Board();
        board.setTitle("TEST");
        board.setContent("TEST mybatis");
        board.setUserCode(11);
        board.setCreateDate(LocalDateTime.now());
        service.insertBoard(board);
    }

}
