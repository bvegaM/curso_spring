package com.example.spring.core.dependencyinyection.lifecycle;

import com.example.spring.core.dependencyinyection.autowire.Square;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BvegaBeanPostProcessor implements BeanPostProcessor {

    private static final Logger log = LoggerFactory.getLogger(BvegaBeanPostProcessor.class);
    
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBean)
            log.info("postProcessBeforeInitialization() called for bean: {}", beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof LifeCycleBean)
            log.info("postProcessAfterInitialization() called for bean: {}", beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
