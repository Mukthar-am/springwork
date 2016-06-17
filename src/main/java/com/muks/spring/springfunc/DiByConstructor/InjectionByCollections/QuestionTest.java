package com.muks.spring.springfunc.DiByConstructor.InjectionByCollections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by 15692 on 16/06/16.
 */
public class QuestionTest {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

//        Question q=(Question)factory.getBean("q");
//        q.displayInfo();



        Question ans2 = (Question)factory.getBean("q2");
        ans2.displayInfoGeneric();


        Question mapq = (Question)factory.getBean("mapq");
        mapq.displayInfoMapAns();

        Question nonstringmap = (Question)factory.getBean("nonstringmap");
        nonstringmap.displayInfoNonGenMaps();

    }
}
