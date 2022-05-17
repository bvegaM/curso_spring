package com.course.usersapp.users.service;

import com.course.usersapp.users.domain.User;
import com.course.usersapp.users.repository.UserRepository;
import com.course.usersapp.users.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        if(this.userRepository.getUsers().stream().anyMatch(u -> u.getUsername().equals(user.getUsername()))) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, String.format("User with username %s already exists", user.getUsername()));
        }
        return this.userRepository.save(user);
    }

    @Override
    public User update(User user, String username) {
        User userToUpdate = this.userRepository.findByUsername(username);
        userToUpdate.setNickname(user.getNickname());
        userToUpdate.setPassword(user.getPassword());
        return this.userRepository.update(userToUpdate, username);
    }

    @Override
    public void delete(String username) {
        User userToDelete = this.userRepository.findByUsername(username);
        this.userRepository.delete(userToDelete);
    }

}
