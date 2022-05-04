package com.example.spring.core.dependencyinyection.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

    @Before("execution(* com.example.spring.core.dependencyinyection.aop.TargetObject.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("modifiers {}", joinPoint.getSignature().getModifiers());
        log.info("method {}", joinPoint.getSignature().getName());
        log.info("target class {}", joinPoint.getTarget().getClass().getName());
        log.info("args {}", joinPoint.getArgs());
        log.info("Before advice");
    }
}
