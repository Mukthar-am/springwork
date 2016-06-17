package com.muks.spring.springfunc.DiBySetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Unit test for simple Student.
 */
public class StudentTest {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = (Student) context.getBean("studentbean");
        System.out.println("# From application context: ");
        student1.displayInfo();

    }

}
