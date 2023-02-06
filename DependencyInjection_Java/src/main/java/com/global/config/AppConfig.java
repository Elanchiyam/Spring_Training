package com.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.global.beans.Employee;

@Configuration
public class AppConfig {
	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setEmpId(101);
		employee.setEname("Abinaya");
		employee.setSalary(90000.f);
		
		return employee;
	}
}
