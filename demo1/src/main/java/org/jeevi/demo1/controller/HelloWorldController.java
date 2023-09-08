package org.jeevi.demo1.controller;


import com.sun.tracing.ProviderFactory;
import org.apache.logging.log4j.spi.Provider;
import org.omg.CORBA.ByteHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.spi.TimeZoneNameProvider;


@Controller
class HelloWorldController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        Thread t = new Thread();
        Lock lock = new ReentrantLock(false);
        lock.tryLock();
        FutureTask
        return "Hello World!";
    }
}
