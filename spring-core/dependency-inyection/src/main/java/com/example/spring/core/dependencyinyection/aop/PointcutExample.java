package com.example.spring.core.dependencyinyection.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {

    @Pointcut("execution(* com.example.spring.core.dependencyinyection.aop.TargetObject.*(..))")
    public void targetMethod() {
    }
}
