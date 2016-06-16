package com.muks.springeg.DiByFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15692 on 16/06/16.
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("appContextFactoryMethod.xml");
        A a = (A)context.getBean("a");
        a.msg();
    }
}
