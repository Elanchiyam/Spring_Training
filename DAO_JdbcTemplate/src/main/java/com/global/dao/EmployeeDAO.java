package com.global.dao;

import java.util.List;

import com.global.model.Employee;

public interface EmployeeDAO {
	public int saveEmployee(Employee e);
	public int updateEmployee(Employee e);
	public int deleteById(int id);
	public Employee getById(int id);
	public List<Employee> getAll();
}
