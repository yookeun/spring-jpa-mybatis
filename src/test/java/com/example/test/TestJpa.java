package com.example.test;

import com.example.test.jpa.model.Board;
import com.example.test.jpa.service.JpaService;
import com.example.test.jpa.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDateTime;


@SpringBootTest
public class TestJpa {
    @Autowired
    private JpaService service;


    @Test
    public void JPA_유저등록() {
        User user = new User();
        user.setUserId("hong2");
        user.setUserName("홍길동2");
        user.setCreateDate(LocalDateTime.now());
        service.saveUser(user);
    }

    @Test
    public void JPA_유저수정() {
        User user = new User();
        user.setUserCode(2);
        user.setUserId("hong1");
        user.setUserName("홍길동22");
        user.setCreateDate(LocalDateTime.now());
        service.saveUser(user);
    }

    @Test
    public void JPA_특정유저_가져오기() {
        User user = service.findUser(1);
        System.out.println(user.getUserCode() + ", " + user.getUserId() + ", " + user.getUserName());
    }

    @Test
    public void JPA_게시판등록() {
        Board board = new Board();
        board.setTitle("TEST2");
        board.setContent("TEST2 JPA");
        board.getUser().setUserCode(11);
        board.setCreateDate(LocalDateTime.now());
        service.saveBoard(board);




    }




}
