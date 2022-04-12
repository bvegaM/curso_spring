package com.example.spring.core.dependencyinyection.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {

    private static final Logger log = LoggerFactory.getLogger(Nido.class);

    @Autowired
    @Qualifier("pajaro")
    private Animal animal;

    public void imprimirAnimal() {
        log.info("Animal:  nombre = {} edad = {}",animal.getNombre(),animal.getEdad());
    }
}
