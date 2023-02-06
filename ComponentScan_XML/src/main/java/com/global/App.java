package com.global;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.global.beans.Employee;
import com.global.service.EmployeeService;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml");
    	EmployeeService service = (EmployeeService) context.getBean("employeeService");
    	service.setEmployee(new Employee(101, "Elan"));
    	Employee emp = service.getEmployee();
    	System.out.println("Id = " + emp.getEmpId() + " Name = " + emp.getEname());
    	
    }
}
