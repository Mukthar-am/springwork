package com.muks.spring.springfunc.DiBySetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15692 on 16/06/16.
 */
public class DiBySetterTest2 {
    public static void main(String[] args) {
//	Resource r=new ClassPathResource("applicationContext.xml");
//	BeanFactory factory=new XmlBeanFactory(r);
        ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContextDiBySetters.xml");

        Employee e=(Employee)factory.getBean("obj2");
        e.display();


    }
}
