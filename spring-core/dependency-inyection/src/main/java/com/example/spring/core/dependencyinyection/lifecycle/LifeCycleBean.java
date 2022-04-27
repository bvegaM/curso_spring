package com.example.spring.core.dependencyinyection.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Lazy -- se ejecuta solamente si es que se inyecta si es lazy(false) se ejecuta inmediatamente
//@Scope("prototype") -- recordemos de pre destroy no se ejecuta para beans de tipo prototype
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    // se ejecuta durante la construccion del bean "BeanNameAware"
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
    public void destroyBean(){
        log.info("Bean is destroyed");
    }


    @Override
    public void destroy() throws Exception {
        log.info("Destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("After properties set method");
    }
}
