package com.global.beans;

import java.util.List;
import java.util.Map;

public class Employee {
	private Integer empId;
	private String ename;
	private Float salary;
//	private List<String> skillSet;
//	private Map<String, String> securityQuestion;
	
	public Employee() {
		super();
	}
	public Employee(Integer empId, String ename, Float salary) {
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
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
//	public List<String> getSkillSet() {
//		return skillSet;
//	}
//	public void setSkillSet(List<String> skillSet) {
//		this.skillSet = skillSet;
//	}
//	public Map<String, String> getSecurityQuestion() {
//		return securityQuestion;
//	}
//	public void setSecurityQuestion(Map<String, String> securityQuestion) {
//		this.securityQuestion = securityQuestion;
//	}

	
}
