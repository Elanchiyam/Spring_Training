package com.global;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.global.beans.Employee;
import com.global.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = context.getBean(Employee.class);
		System.out.println("Employee Details");
		System.out.println("-------------------------------");
		System.out.println("Employee Id " + emp.getEmpId());
		System.out.println("Employee Name " + emp.getEname());
		System.out.println("Employee Salary " + emp.getSalary());
         
    }
}
