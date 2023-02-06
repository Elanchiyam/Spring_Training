package com.global;

import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.global.beans.Employee;

/**
 * Hello world!
 *
 */
public class TestMain 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Resource resource = new ClassPathResource("resources/Spring.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        Employee emp = (Employee) beanFactory.getBean("employee");
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");
        Employee emp = (Employee) context.getBean("employee");
        
        System.out.println("***Employee Details - Setter injection");
        System.out.println("Employee Id " + emp.getEmpId());
        System.out.println("Employee Name " + emp.getEname());
        System.out.println("Employee Salary " + emp.getSalary());
        System.out.println("Employee skill set : ");
        emp.getSkillSet().forEach(System.out::println);
        System.out.println("Security Questions");
        emp.getSecurityQuestion().forEach((k,v)->{
        	System.out.println(k + " : " + v);	
        });
        System.out.println("Address : " + emp.getAddress().toString());  
        
        
        
        System.out.println();
        
        Employee emp2 = (Employee) context.getBean("employee1");
        
        System.out.println("***Employee Details - Constructor Injection");
        System.out.println("Employee Id " + emp2.getEmpId());
        System.out.println("Employee Name " + emp2.getEname());
        System.out.println("Employee Salary " + emp2.getSalary());
    }
}
