package com.global.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bill {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billableId;
	@Column
	private String billableName;
	@Column
	private String billableAddress;
	
	public Bill() {
		super();
	}
	public Bill(Integer billableId, String billableName, String billableAddress) {
		super();
		this.billableId = billableId;
		this.billableName = billableName;
		this.billableAddress = billableAddress;
	}
	public Integer getBillableId() {
		return billableId;
	}
	public void setBillableId(Integer billableId) {
		this.billableId = billableId;
	}
	public String getBillableName() {
		return billableName;
	}
	public void setBillableName(String billableName) {
		this.billableName = billableName;
	}
	public String getBillableAddress() {
		return billableAddress;
	}
	public void setBillableAddress(String billableAddress) {
		this.billableAddress = billableAddress;
	}
	
	
}
