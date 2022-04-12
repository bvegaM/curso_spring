package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.atr.Coche;
import com.example.spring.core.dependencyinyection.atr.Motor;
import com.example.spring.core.dependencyinyection.qualifiers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

        Perro perro = context.getBean(Perro.class);
        log.info("Perro: {}", perro.getNombre());
        Pajaro pajaro = context.getBean(Pajaro.class);
        log.info("Pajaro: {}", pajaro.getNombre());
        Avion avion = context.getBean(Avion.class);
        avion.volar();

        /*
        Cuando tenemos mas de dos beans con el mismo nombre, Spring no sabe cual es el que va a ser
        por lo que nos devuelve una excepcion
        La solucion es usar el qualifier para decirle a Spring el bean que queremos usar
         */
        Animal animal = context.getBean("perro",Animal.class);
        log.info("Animal: {}", animal.getNombre());

        Nido nido = context.getBean(Nido.class);
        nido.imprimirAnimal();
    }

}
