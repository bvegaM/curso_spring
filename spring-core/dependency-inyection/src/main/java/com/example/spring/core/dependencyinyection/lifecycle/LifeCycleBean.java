package com.example.spring.core.dependencyinyection.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class LifeCycleBean implements BeanNameAware {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    @Override
    public void setBeanName(String s) {
        log.info("Bean name is {}", s);
    }

    /*
    * Se ejecutará despues de la inyección de dependencias
    */
    @PostConstruct
    public void init(){
        log.info("Bean is initialized");
    }

    /*
    * Se ejecutará antes de que el bean sea destruido
    * No se ejecutan para beans prototype
    * Solo se ejecutan durante una terminación normal de la JVM
    */
    @PreDestroy
    public void destroy(){
        log.info("Bean is destroyed");
    }
}
