package com.global.bank.acc;

public abstract class Account {
	int tenure; 
	float principal;
	float rateOfInterest;
	
	
	public Account(int tenure, float principal) {
		super();
		this.tenure = tenure;
		this.principal = principal;
	}
	public void setInterest(int age, String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			if(age<60)
				this.rateOfInterest=9.8f;
			else
				this.rateOfInterest=10.5f;
			
		} else {
			if(age<58)
				this.rateOfInterest=10.2f;
			else
				this.rateOfInterest=10.8f;
		}
			
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,	float maturityInterest) {
		return totalPrincipleDeposited + maturityInterest;
	}
	public abstract float calculateInterest();
	
	public abstract float calculateAmountDeposited();
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getPrincipal() {
		return principal;
	}
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	} 
	
	
}
