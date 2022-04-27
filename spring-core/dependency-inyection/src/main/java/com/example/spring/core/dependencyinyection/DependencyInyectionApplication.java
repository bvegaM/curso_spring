package com.example.spring.core.dependencyinyection;

import com.example.spring.core.dependencyinyection.lifecycle.ExplicitBean;
import com.example.spring.core.dependencyinyection.lifecycle.LifeCycleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInyectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    //@Bean(initMethod = "init", destroyMethod = "destroy")
    //public ExplicitBean getBean(){
    //    return new ExplicitBean();
    //}

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        LifeCycleBean bean = context.getBean(LifeCycleBean.class);
    }

}
