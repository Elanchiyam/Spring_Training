package com.global;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.global.model.Employee;
import com.global.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");
    	EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
    	
    	Scanner scanner = new Scanner(System.in);
    	Employee emp = new Employee();
    	System.out.println("Enter employee Id : ");
    	emp.setId(scanner.nextInt());
    	System.out.println("Enter employee name : ");
    	emp.setName(scanner.next());
    	System.out.println("Enter employee salary : ");
    	emp.setSalary(scanner.nextFloat());
    	
    	employeeService.saveEmployee(emp);
    	
    }
}
