package com.example.spring.core.dependencyinyection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Circle implements Figure{

    @Value("${circle.radius:1}")
    private Double radius;

    @Override
    public Optional<Double> calculateArea() {
        return Optional.of(Math.PI * radius * radius);
    }
}
