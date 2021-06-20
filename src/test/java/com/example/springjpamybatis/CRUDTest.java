package com.example.springjpamybatis;

import com.example.springjpamybatis.mybatis.model.User;
import com.example.springjpamybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CRUDTest {
    @Autowired
    private UserService userService;

    @Test
    public void 마이바티스_사용자_등록() {
        User user = new User();
        user.setUserId("hong2");
        user.setUserName("홍길동2");
        userService.insertUser(user);
    }
}
