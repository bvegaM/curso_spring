package com.course.usersapp.users.repository;

import com.course.usersapp.users.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findByUsername(String username);
    User save(User user);
    User update(User user, String username);
    void delete(String username);
}
