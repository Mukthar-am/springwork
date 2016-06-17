package com.muks.spring.springfunc.DiBySetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by 15692 on 16/06/16.
 */
public class DiBySetterTest {
    public static void main(String[] args) {

        Resource r=new ClassPathResource("applicationContextDiBySetters.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Employee e=(Employee)factory.getBean("obj");
        e.display();
    }
}
