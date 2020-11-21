package com.gpw.test;

import com.gpw.servlet.BookServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test() {
        Object bookDao = ioc.getBean("bookDao");
        Object bookDao1 = ioc.getBean("bookDao");
        System.out.println(bookDao == bookDao1);
    }

    @Test
    public void test01() {
        BookServlet bookServlet = ioc.getBean(BookServlet.class);
        bookServlet.doGet();
    }

}
