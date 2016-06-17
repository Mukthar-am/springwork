package com.muks.spring.springfunc.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15692 on 16/06/16.
 */
public class AutoWireTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("appcontextAutoWire.xml");
        A a=context.getBean("a",A.class);
        a.display();
    }
}
