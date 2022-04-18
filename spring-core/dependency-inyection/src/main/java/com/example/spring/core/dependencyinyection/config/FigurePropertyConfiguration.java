package com.example.spring.core.dependencyinyection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:areas.properties")
public class FigurePropertyConfiguration {

    @Bean
    public PropertySourcesPlaceholderConfigurer getPropertiesConfig(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
