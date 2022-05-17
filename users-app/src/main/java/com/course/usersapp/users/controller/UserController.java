package com.course.usersapp.users.controller;

import com.course.usersapp.users.domain.User;
import com.course.usersapp.users.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getByUsername(@PathVariable("username") String username){
        return new ResponseEntity<>(userService.findByUsername(username), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(this.userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping("/{username}")
    public ResponseEntity<User> updateUser(@PathVariable("username") String username, @RequestBody User user){
        return new ResponseEntity<>(this.userService.update(user,username), HttpStatus.OK);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable("username") String username){
        this.userService.delete(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
