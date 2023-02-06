package com.global.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.global.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Siva");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
