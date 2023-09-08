package com.jeevi.demo2;

import com.jeevi.demo2.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    //数据源组件
    @Autowired
    DataSource dataSource;
    //用于访问数据库的组件
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Test
    void contextLoads() throws SQLException{
        System.out.println("默认数据源为：" + dataSource.getClass());
        System.out.println("数据库连接实例：" + dataSource.getConnection());
        Integer i = jdbcTemplate.queryForObject("SELECT count(*) from `flag`", Integer.class);
        System.out.println("user 表中共有" + i + "条数据。");
        System.out.println(person);
    }

    @Test
    public void testHelloService() {
        //校验 IOC 容器中是否包含组件 personService
        boolean b = ioc.containsBean("personService");
        if (b) {
            System.out.println("personService 已经添加到 IOC 容器中");
        } else {
            System.out.println("personService 没添加到 IOC 容器中");
        }

    }


}
