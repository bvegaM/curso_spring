package com.example.spring.core.dependencyinyection.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TargetObject {

    private static final Logger log = LoggerFactory.getLogger(TargetObject.class);

    public void doSomething() {
        log.info("doSomething()");
    }

    public void validate() {
        log.info("validate()");
    }
}
