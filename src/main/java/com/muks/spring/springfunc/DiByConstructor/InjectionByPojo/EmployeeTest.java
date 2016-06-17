package com.muks.spring.springfunc.DiByConstructor.InjectionByPojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by 15692 on 16/06/16.
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Employee s=(Employee)factory.getBean("e");
        s.show();

        Employee emp1 =(Employee)factory.getBean("employee1");
        emp1.showAll();

    }
}
