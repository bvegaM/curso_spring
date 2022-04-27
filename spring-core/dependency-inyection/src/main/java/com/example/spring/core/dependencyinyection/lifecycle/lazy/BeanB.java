package com.example.spring.core.dependencyinyection.lifecycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class BeanB {

    private static final Logger log = LoggerFactory.getLogger(BeanB.class);

    @PostConstruct
    public void init(){
        log.info("BeanB init");
    }
}
