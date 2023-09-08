package main.java.com.jeevi.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jeevi
 */
public class MainApp {
    public static void main(String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
        HelloWorld obj1 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(obj.getMessage());
        System.out.println(obj);
        System.out.println(obj1);

    }
}
