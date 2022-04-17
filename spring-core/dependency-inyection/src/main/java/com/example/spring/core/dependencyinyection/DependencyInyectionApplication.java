package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.autowire.AreaCalculateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
/* Estas tres anotaciones es lo mismo que solamente poner la anotacion @SpringBootApplication
*@Configuration
@EnableAutoConfiguration
@ComponentScan
*/
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        AreaCalculateService areaCalculateService = context.getBean(AreaCalculateService.class);
        log.info("Area: {}", areaCalculateService.calcAreas().isPresent()?areaCalculateService.calcAreas().get():"");
    }

}
