package com.global.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.global.model.Employee;

public interface EmployeeDAO {
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate);
	public void saveEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Integer id);
	public Employee findEmployeeById(Integer employeeId);
}
