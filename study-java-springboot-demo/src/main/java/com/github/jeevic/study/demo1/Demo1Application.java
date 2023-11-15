package com.github.jeevic.study.demo1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author jeevi
 */
@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args)  {
        SpringApplication.run(Demo1Application.class, args);
    }
}



