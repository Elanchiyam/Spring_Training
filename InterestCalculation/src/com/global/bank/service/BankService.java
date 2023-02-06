package com.global.bank.service;

import com.global.bank.acc.RDAccount;
import com.global.bank.exception.BankValidationException;

public class BankService {
	public boolean validateData(float principal, int tenure, int age,String gender) throws BankValidationException {
		
		try {
			if(principal>=500 && 
					(tenure>=5 && tenure<=10) &&
					 (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) &&
					 (age>=1 && age<=100) 
					 
					) {
				return true;
			} else 
				throw new BankValidationException();
			
		} catch (BankValidationException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		return false;
	}
	
	public void calculate(float principal,int tenure, int age, String gender) throws BankValidationException {
		if(validateData(principal, tenure, age, gender)) {
			RDAccount rdAccount= new RDAccount(tenure, principal);
			rdAccount.setInterest(age, gender);
			float interest = rdAccount.calculateInterest();
			System.out.println("Interest : " + interest);
			System.out.println("Amount deposited : " + rdAccount.calculateAmountDeposited());
			System.out.println( "Maturity Amount : " + rdAccount.calculateMaturityAmount(rdAccount.calculateAmountDeposited(), interest));
		}
	}
}
