package com.global.service;

import java.util.HashSet;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.global.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	HashSet<Employee> employeeList = new HashSet<>();
	@Override
	public HashSet<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.getEmpId()==id)
				return employee;
		}
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeList.add(employee);
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeList.clear();
	}

}
