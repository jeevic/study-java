package org.jeevi.demo1;

import org.jeevi.demo1.Demo1Application;
import org.jeevi.demo1.util.PrivateIpUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.concurrent.CountDownLatch;

/**
 * @className: com.qihoo.finance.dspmanage.controller -> org.jeevi.demo1.TestPrivateIpUtil
 * @description:
 * @author: jeevi
 * @createDate: 2023/5/24 18:25
 * @version: 1.0
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TestPrivateIpUtil {

    @Test
    void isValidIPv4() {
        String ip = "192.169.0.1";
        assert PrivateIpUtil.isValidIPv4(ip);

        ip = "192.169.0.01";
        assert PrivateIpUtil.isValidIPv4(ip);

        ip = "192.169.0";
        assert PrivateIpUtil.isValidIPv4(ip) == false;

        ip = "192.169";
        assert PrivateIpUtil.isValidIPv4(ip) == false;


        ip = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        assert PrivateIpUtil.isValidIPv4(ip) == false;

        ip = "ip";
        assert PrivateIpUtil.isValidIPv4(ip) == false;

        ip = "192.169.0.01L";
        assert PrivateIpUtil.isValidIPv4(ip) == false;

    }

    @Test
    void isPrivateIpV4() {
        String ip = "192.168.0.1";
        assert PrivateIpUtil.isPrivateIPv4(ip);

        ip = "192.169.0.01";
        assert PrivateIpUtil.isPrivateIPv4(ip) == false;

        ip = "192.169.0";
        assert PrivateIpUtil.isPrivateIPv4(ip) == false;

        ip = "192.169";
        assert PrivateIpUtil.isPrivateIPv4(ip) == false;

        ip = "10.220.1.9";
        assert PrivateIpUtil.isPrivateIPv4(ip);

        ip = "10.220.250.160";
        assert PrivateIpUtil.isPrivateIPv4(ip);

    }


}
