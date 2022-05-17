package com.course.usersapp.users.service;

import com.course.usersapp.users.repository.UserRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserRepository {

    @Autowired
    private Faker faker;
}
