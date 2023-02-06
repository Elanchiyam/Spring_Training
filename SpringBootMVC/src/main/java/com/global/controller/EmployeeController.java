package com.global.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.global.model.Employee;
import com.global.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
//	@RequestMapping(value = "/hello",method=RequestMethod.GET)
//	public String show() {
//		return "Hello from the controller";
//	}
//	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody Employee employee) {
		employeeServiceImpl.addEmployee(employee);
	}
	
	@GetMapping("/getEmployees")
	public HashSet<Employee> getAllEmployees() {
		return employeeServiceImpl.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return employeeServiceImpl.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteEmployees() {
		employeeServiceImpl.deleteAllEmployees();
	}
}
