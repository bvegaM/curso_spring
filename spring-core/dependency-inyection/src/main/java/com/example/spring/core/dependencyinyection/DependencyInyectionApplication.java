package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.autowire.AreaCalculateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
/* Estas tres anotaciones es lo mismo que solamente poner la anotacion @SpringBootApplication
*@Configuration
@EnableAutoConfiguration
@ComponentScan
*/
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    public static void main(String[] args) {
        /*
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        AreaCalculateService areaCalculateService = context.getBean(AreaCalculateService.class);
        log.info("Area: {}", areaCalculateService.calcAreas().isPresent()?areaCalculateService.calcAreas().get():"");
        */

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("20<10? '20 mayor que 10':'10 mayor que 20'");
        log.info("Expression: {}", exp.getValue());
    }

}
