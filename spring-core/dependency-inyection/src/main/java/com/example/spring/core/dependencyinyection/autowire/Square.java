package com.example.spring.core.dependencyinyection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Square implements Figure{

    @Value("2")
    private Double side;

    @Override
    public Optional<Double> calculateArea() {
        return Optional.of(side * side);
    }
}
