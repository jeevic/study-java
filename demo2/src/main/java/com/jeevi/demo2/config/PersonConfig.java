package com.jeevi.demo2.config;

import com.jeevi.demo2.service.PersonService;
import com.jeevi.demo2.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jeevi
 */
@Configuration
public class PersonConfig {


    @Bean
    public PersonService personService() {
        System.out.println("在容器中添加了一个组件:peronService");
        return new PersonServiceImpl();
    }
}
