package com.example.test.jpa.service;

import com.example.test.jpa.model.User;
import com.example.test.jpa.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class UserJpaService {
    private final UserJpaRepository userJpaRepository;

    @Transactional
    public void insertUser(User user) {
        userJpaRepository.save(user);
    }
}
