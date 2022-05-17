package com.course.usersapp.users.repository;

import com.course.usersapp.users.domain.User;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private Faker faker;

    private final List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        for (int i = 0; i < 100 ; i++) {
            this.users.add(new User(faker.funnyName().name(), faker.name().name(), faker.dragonBall().character()));
        }
    }

    public List<User> findAll(){
        return this.users;
    }

    public User findByUsername(String username){
        return this.users.stream().filter(user -> user.getUsername().equals(username))
                .findAny().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User with username %s not found", username)));
    }

    public User save(User user){
        this.users.add(user);
        return user;
    }

    public List<User> getUsers() {
        return users;
    }

    public User update(User user, String username){
        User userToUpdate = this.findByUsername(username);
        userToUpdate.setUsername(user.getUsername());
        userToUpdate.setPassword(user.getPassword());
        return userToUpdate;
    }

    public void delete(User user){
        this.users.remove(user);
    }
}
