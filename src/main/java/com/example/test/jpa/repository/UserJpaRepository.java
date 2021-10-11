package com.example.test.jpa.repository;

import com.example.test.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Integer> {
    User findByUserCode(Integer userCode);
}
