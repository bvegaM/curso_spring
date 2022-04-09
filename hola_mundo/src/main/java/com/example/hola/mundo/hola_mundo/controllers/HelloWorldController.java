package com.example.hola.mundo.hola_mundo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bryam on 12/10/16.
 */
@RestController
@RequestMapping(value = "/hola_mundo")
public class HelloWorldController {

    @GetMapping(value = "/")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hola Mundo", HttpStatus.OK);
    }
}

