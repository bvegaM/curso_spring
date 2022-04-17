package com.example.spring.core.dependencyinyection.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaCalculateService {

    @Autowired
    private List<Figure> figures;

    public Optional<Double> calcAreas(){
        return Optional.of(figures.stream().mapToDouble(figure -> figure.calculateArea().get()).sum());
    }
}
