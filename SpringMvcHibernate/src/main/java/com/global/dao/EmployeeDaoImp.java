package com.global.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;  
import org.springframework.transaction.annotation.Transactional;

import com.global.beans.Employee;

 
public class EmployeeDaoImp implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;
	@Override
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		
		this.hibernateTemplate=hibernateTemplate;
	}

	@Transactional
	@Override
	public void saveEmployee(Employee employee) {
	Integer i = (Integer)  hibernateTemplate.save(employee);
	     if(i==employee.getId()) {
	    	 System.out.println("Employee record is inserted");
	     } else {
	    	 System.out.println("Employee record is not inserted");
	     }
	
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee findByEmployeeId(Integer employeeId) {
		Employee emp = (Employee)hibernateTemplate.get(Employee.class, employeeId);
		return emp;
	}

	public Employee getEmployee(int id) {
		Employee emp = (Employee)hibernateTemplate.get(Employee.class, id);
		return emp;
	}


	
		

}
