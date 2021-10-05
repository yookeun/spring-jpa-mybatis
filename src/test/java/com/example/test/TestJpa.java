package com.example.test;

import com.example.test.jpa.service.UserJpaService;
import com.example.test.jpa.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;


@SpringBootTest
public class TestJpa {
    @Autowired
    private UserJpaService userJpaService;


    @Test
    public void JPA_유저등록() {
        User user = new User();
        user.setUserId("hong2");
        user.setUserName("홍길동2");
        user.setCreateDate(LocalDateTime.now());
        userJpaService.insertUser(user);
    }



}
