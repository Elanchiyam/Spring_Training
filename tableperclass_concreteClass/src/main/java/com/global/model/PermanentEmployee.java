package com.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="PermanentEmployee")
@PrimaryKeyJoinColumn(name="Id")
public class PermanentEmployee extends Employee{
	
	@Column(name = "Salary")
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
