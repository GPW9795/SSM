package com.gpw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleDepend {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceA a = context.getBean("a", ServiceA.class);
        ServiceB b = context.getBean("b", ServiceB.class);
    }
}
