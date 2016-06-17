package com.muks.spring.springfunc.InheritanceInSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by 15692 on 16/06/16.
 */
public class InheritanceTest {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("aipplicationContextInheritance.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Employee e1=(Employee)factory.getBean("e2");
        e1.show();
    }
}
