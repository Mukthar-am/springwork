package com.muks.springeg.JdbcTemplates;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 15692 on 16/06/16.
 */
public class EmployeeTest {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("appContextJdbcTemplate.xml");

        EmployeeDao dao = (EmployeeDao)ctx.getBean("edao");
        int status = dao.saveEmployee(new Employee(102,"Amit",35000));
        System.out.println(status);

    /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
    System.out.println(status);
    */

    /*Employee e=new Employee();
    e.setId(102);
    int status=dao.deleteEmployee(e);
    System.out.println(status);*/

    }

    public void testPreparedStatement() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
        dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));
    }

    public void testResultsetExtractor() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao2");
        List<Employee> list=dao.getAllEmployees();

        for(Employee e:list)
            System.out.println(e);

    }

}
