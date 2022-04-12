package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.atr.Coche;
import com.example.spring.core.dependencyinyection.atr.Motor;
import com.example.spring.core.dependencyinyection.profiles.EnviromentService;
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
        EnviromentService enviromentService = context.getBean(EnviromentService.class);
        log.info("EnviromentService: {}", enviromentService.getEnviroment().get());
    }

}
