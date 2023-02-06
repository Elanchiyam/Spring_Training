package com.global.bank.acc;

public class RDAccount extends Account {
	
	
	public RDAccount(int tenure, float principal) {
		super(tenure, principal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateInterest() {
		// TODO Auto-generated method stub
		float n = 4;
        double amount = principal * Math.pow(1 + (rateOfInterest / n), n * tenure);
        System.out.println(principal + " " + rateOfInterest);
        System.out.println(rateOfInterest/100);
        System.out.println(1 + rateOfInterest/n);
        float months = n*tenure;
        return (float) amount;
	}

	@Override
	public float calculateAmountDeposited() {
		// TODO Auto-generated method stub
		float amt = this.principal * this.tenure *12;
		return amt;
	}

}
