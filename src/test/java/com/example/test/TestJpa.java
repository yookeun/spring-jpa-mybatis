package com.example.test;

import com.example.test.jpa.service.UserJpaService;
import com.example.test.jpa.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


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
        userJpaService.saveUser(user);
    }

    @Test
    public void JPA_유저수정() {
        User user = new User();
        user.setUserCode(2);
        user.setUserId("hong1");
        user.setUserName("홍길동22");
        user.setCreateDate(LocalDateTime.now());
        userJpaService.saveUser(user);
    }

    @Test
    public void JPA_특정유저_가져오기() {
        User user = userJpaService.findUser(1);
        System.out.println(user.getUserCode() + ", " + user.getUserId() + ", " + user.getUserName());
    }



}
