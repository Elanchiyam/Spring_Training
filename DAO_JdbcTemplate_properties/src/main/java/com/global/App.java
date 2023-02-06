package com.global;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.global.config.AppConfig;
import com.global.dao.EmployeeDAOImpl;
import com.global.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	EmployeeDAOImpl employeeDAOImpl = context.getBean(EmployeeDAOImpl.class);
    	
    	Scanner scanner = new Scanner(System.in);
    	Employee emp = new Employee();
    	System.out.println("Enter employee Id : ");
    	emp.setId(scanner.nextInt());
    	System.out.println("Enter employee name : ");
    	emp.setName(scanner.next());
    	System.out.println("Enter employee salary : ");
    	emp.setSalary(scanner.nextFloat());
    	
    	System.out.println(emp.toString());
    	employeeDAOImpl.saveEmployee(emp);
    	employeeDAOImpl.getAllEmployees().forEach(System.out::println);
    }
}
