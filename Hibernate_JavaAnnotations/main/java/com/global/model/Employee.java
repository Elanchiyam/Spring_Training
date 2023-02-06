package com.global.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private float salary;
	
	public Employee() {
		super();
	}

	public Employee(Integer id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
