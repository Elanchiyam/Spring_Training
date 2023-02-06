package com.global.service;

import com.global.dao.EmployeeDAOImpl;
import com.global.model.Employee;

public class EmployeeService {
	
	EmployeeDAOImpl employeeDAOImpl;
	
	public EmployeeDAOImpl getEmployeeDAOImpl() {
		return employeeDAOImpl;
	}

	public void setEmployeeDAOImpl(EmployeeDAOImpl employeeDAOImpl) {
		this.employeeDAOImpl = employeeDAOImpl;
	}

	public void saveEmployee(Employee employee) {
		int result = employeeDAOImpl.saveEmployee(employee);
		System.out.println(result);
	}
	
	public void updateEmployee(Employee employee) {
		int result = employeeDAOImpl.updateEmployee(employee);
		System.out.println(result);
	}
	
	public void deleteEmployee(int id) {
		int result = employeeDAOImpl.deleteById(id);
		System.out.println(result);
	}
	
}
