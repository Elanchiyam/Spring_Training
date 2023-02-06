package com.global.beans;

import javax.persistence.Column;     
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee8")
public class Employee {

	@Id
	//@GeneratedValue
	@Column(name="empId")
	private int id;
	@Column(name="empName")
	private String name;
	@Column(name="empSalary")
	private float salary;
	
	public Employee()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
