package com.jeevi.www;

import com.jeevi.www.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SampleApplicationTests {

    @Autowired
    HelloService helloService;


    @Test
    public void testHelloService() {
        System.out.print(helloService.sayHello("jeevi"));
    }
}
