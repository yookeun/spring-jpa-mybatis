package com.example.test;

import com.example.test.mybatis.model.User;
import com.example.test.mybatis.service.UserMyBatisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMyBatis {
    @Autowired
    private UserMyBatisService userService;

    @Test
    public void Mybatis_유저등록() {
        User user = new User();
        user.setUserId("hong3");
        user.setUserName("홍길동3");
        userService.insertUser(user);
    }

    @Test
    public void Mybatis_유저조회() {
        User user = new User();
        user.setUserId("hong");
        user.setUserName("홍길동");
        List<User> userList =  userService.selectUser();
        for (User user1: userList) {
            System.out.println(user1.getUserCode() + ", " + user1.getUserId() + ", " +  user1.getUserName());
        }
    }

    @Test
    public void Mybatis_유저수정() {
        User user = new User();
        user.setUserCode(1);
        user.setUserName("홍길동1");
        userService.updateUser(user);
    }

}
