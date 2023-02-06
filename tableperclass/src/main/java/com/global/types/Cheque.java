package com.global.types;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ch1")
public class Cheque {
	@Id
	@Column(name = "chequeno")
	private int chequeno;
	@Column(name = "chequetype")
	private String chequeType;
	public int getChequeno() {
		return chequeno;
	}
	public void setChequeno(int chequeno) {
		this.chequeno = chequeno;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	public void setAmount(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
