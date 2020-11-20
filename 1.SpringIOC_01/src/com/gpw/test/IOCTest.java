package com.gpw.test;

import com.gpw.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
    private ApplicationContext ioc2 = new ClassPathXmlApplicationContext("ioc2.xml");

    @Test
    public void test01() {
        // 代表IOC容器
        Person preson1 = (Person) ioc.getBean("person01");
        System.out.println(preson1);
    }

    @Test
    public void test02() {
        // 代表IOC容器
//        Person bean = ioc.getBean(Person.class);
//        System.out.println(bean);

        Person person02 = ioc.getBean("person02", Person.class);
        System.out.println(person02);

        Person person03 = ioc.getBean("person03", Person.class);
        System.out.println(person03);

        Person person04 = ioc.getBean("person04", Person.class);
        System.out.println(person04);

        Person person05 = ioc.getBean("person05", Person.class);
        System.out.println(person05);
    }

    @Test
    public void test03() {
        Person person01 = ioc2.getBean("person01", Person.class);
        System.out.println(person01);
    }
}
