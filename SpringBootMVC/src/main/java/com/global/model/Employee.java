package com.global.model;


public class Employee {
	private Integer empId;
	private String ename;
	private Integer salary;
	
	public Employee(Integer empId, String ename, Integer salary) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
}
