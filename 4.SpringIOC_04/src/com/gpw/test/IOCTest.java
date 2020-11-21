package com.gpw.test;

import com.gpw.service.BookService;
import com.gpw.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test() {
        BookService bookService = ioc.getBean(BookService.class);
        UserService userService = ioc.getBean(UserService.class);

        bookService.save();
        userService.save();
    }

}
