package com.global.dao;

import java.util.List;   

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.global.beans.Employee;

public interface EmployeeDao {
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate);
	public void saveEmployee(Employee employee);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(Employee employee);
    public Employee   findByEmployeeId(Integer employeeId);
   
}
