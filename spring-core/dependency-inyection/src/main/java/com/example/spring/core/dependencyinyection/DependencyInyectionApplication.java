package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.scopes.EjemploScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    @Bean
    public String getAplicationName(){
        return "Bryam Vega: Beans de anotacion explicita";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        String nombreAplicacion = context.getBean(String.class);
        log.info("Nombre de la aplicación: {}", nombreAplicacion);
    }

}
