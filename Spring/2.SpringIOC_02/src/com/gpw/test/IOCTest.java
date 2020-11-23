package com.gpw.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class IOCTest {
    private ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    @Test
    public void test() throws SQLException {
        DataSource bean = ioc.getBean(DataSource.class);
        System.out.println(bean.getConnection());
    }
}
