package com.example.spring.core.dependencyinyection.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class MyAspect {

    private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

    @Before("PointcutExample.targetMethod()")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("0 modifiers {}", joinPoint.getSignature().getModifiers());
        log.info("0 method {}", joinPoint.getSignature().getName());
        log.info("0 target class {}", joinPoint.getTarget().getClass().getName());
        log.info("0 args {}", joinPoint.getArgs());
        log.info("0 Before advice");
    }
}
