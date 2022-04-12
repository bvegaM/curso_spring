package com.example.spring.core.dependencyinyection.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perro extends Animal {

    public Perro(@Value("1") Integer edad,@Value("rocky") String nombre) {
        super(edad, nombre);
    }
}
