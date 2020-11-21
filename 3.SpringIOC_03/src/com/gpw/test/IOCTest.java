package com.gpw.test;

import com.gpw.service.BookService;
import com.gpw.servlet.BookServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IOCTest {
    private ApplicationContext ioc = null;

    @Autowired
    BookServlet bookServlet;
    @Autowired
    BookService bookService;

    @Test
    public void test() {
        System.out.println(bookServlet);
        System.out.println(bookService);
    }

    @Test
    public void test02() {
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
