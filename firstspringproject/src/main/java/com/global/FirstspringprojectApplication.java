package com.global;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.global.beans.Address;
import com.global.beans.Employee;

@SpringBootApplication
public class FirstspringprojectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstspringprojectApplication.class, args);
//		System.out.println("Hello world");
		ConfigurableApplicationContext context = SpringApplication.run(FirstspringprojectApplication.class, args);
		
		Employee employee = context.getBean(Employee.class);
		employee.setEmpId(101);
		employee.setEname("Siva");
		employee.setSalary(90000);
		
		Address address = new Address();
		address.setCity("Tirupathy");
		address.setState("Andra pradesh");
		address.setPincode("574968");
		
		employee.setAddress(address);
		
		System.out.println("-----------------------------------");
		System.out.println("    Employee Details    ");
		System.out.println("-----------------------------------");
		System.out.println("Id       :  " + employee.getEmpId());
		System.out.println("Name     :  " + employee.getEname());
		System.out.println("Salary   :  " + employee.getSalary());
		System.out.println("City     :  " + employee.getAddress().getCity());
		System.out.println("State    :  " + employee.getAddress().getState());
		System.out.println("Pincode  :  " + employee.getAddress().getPincode());
	}

}
