package com.global.bank.main;

import java.util.Scanner;

import com.global.bank.exception.BankValidationException;
import com.global.bank.service.BankService;

public class MainClass {
	public static void main(String[] args) throws BankValidationException {

		Scanner input = new Scanner(System.in);
		 System.out.println("Enter tenure : ");
		 int tenure = input.nextInt();
		 System.out.println("Enter principal Amount : ");
		 float principal = input.nextFloat();
		 System.out.println("Enter age : ");
		 int age = input.nextInt();
		 System.out.println("Enter gender : ");
		 String gender = input.next();
		 
		 BankService b=new BankService();
		 b.calculate(principal, tenure, age, gender);
	}
}
