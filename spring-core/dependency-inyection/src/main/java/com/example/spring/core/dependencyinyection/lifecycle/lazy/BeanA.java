package com.example.spring.core.dependencyinyection.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@Lazy // si el bean padre tiene una dependencia y el padre es un eager, sus bean dependientes seran eager asi esten como lazy
public class BeanA {
    private static final Logger log = LoggerFactory.getLogger(BeanA.class);

    @Autowired
    private BeanB beanB;

    @PostConstruct
    public void init(){
        log.info("BeanA init");
    }
}
