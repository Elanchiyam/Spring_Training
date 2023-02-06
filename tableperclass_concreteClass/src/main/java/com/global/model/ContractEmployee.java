package com.global.model;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ContractEmployee")
@PrimaryKeyJoinColumn(name="Id")
public class ContractEmployee extends Employee {
	@Column(name ="HourlyRate")
	private double hourlyRate;

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

}
