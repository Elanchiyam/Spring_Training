package com.global.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private Integer empId;
	private String ename;

	
	public Employee() {
		super();
	}
	
	public Employee(Integer empId, String ename) {
	super();
	this.empId = empId;
	this.ename = ename;
}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
