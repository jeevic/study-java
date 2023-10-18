package org.jeevi.demo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: org.jeevi.demo1 -> TestCounter
 * @description:
 * @author: jeevi
 * @createDate: 2023/10/17 20:13
 * @version: 1.0
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TestCounter {

    @Test
    void counter() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        new Thread(() -> {c1.add(1);}).start();
        new Thread(() -> {c1.dec(1);}).start();

        new Thread(() -> {c2.add(1);}).start();
        new Thread(() -> {c2.dec(1);}).start();
    }
}
