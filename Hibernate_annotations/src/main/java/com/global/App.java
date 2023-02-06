package com.global;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");
    	EmployeeDAOImpl employeeDAOImpl = (EmployeeDAOImpl) context.getBean(EmployeeDAOImpl.class);
    	
//    	Employee employee = new Employee();
//    	Scanner scanner = new Scanner(System.in);
//    	System.out.println("Enter Employee Id");
//    	employee.setId(scanner.nextInt());
//    	System.out.println("Enter Employee name");
//    	employee.setName(scanner.next());
//    	System.out.println("Enter Employee salary");
    	employeeDAOImpl.saveEmployee(new Employee(106,"Aishu",80000));
    	employeeDAOImpl.saveEmployee(new Employee(107,"Radhika",89000));
    	employeeDAOImpl.saveEmployee(new Employee(108,"Rashmi",70000));
    	employeeDAOImpl.saveEmployee(new Employee(109,"Reka",60000));

    }
    
}
