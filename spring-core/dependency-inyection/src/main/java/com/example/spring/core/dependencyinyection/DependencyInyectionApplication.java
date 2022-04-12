package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.atr.Coche;
import com.example.spring.core.dependencyinyection.atr.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInyectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        Coche coche = context.getBean(Coche.class);
        System.out.println(coche);

        /*
        Motor motor = new Motor("Ducati",1981);
        Coche coche = new Coche("Ferrari",1986, motor);
        System.out.println(coche);
        */
    }

}
