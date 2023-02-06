package day1;

import java.util.Iterator;
import java.util.Scanner;

public class Loan {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Select Degree type : "
				+ "1. Engineering "
				+ "2. Arts "
				+ "3. Masters");
		int degreeChoice = inp.nextInt();
		int year = 0;
		if(degreeChoice == 1)
			year = 4;
		else if(degreeChoice == 2)
			year = 5;
		else if(degreeChoice == 3)
			year = 3;
		else {
			System.err.println("Please select correct degree choice!");
			return;
		}
	    System.out.println("Your year is : " + year);
	    System.out.println("Enter loan Amount : ");
		long loanamount=inp.nextLong();
		float MonthlyAmount = loanamount / (12*year);
		
		
		for (int i = 1; i <= year; i++) {
			float interestAmount = (float) ((loanamount * i* 0.02)/12);
			float repayment =  MonthlyAmount + interestAmount ;
			 System.out.println("Monthly payment for " + loanamount + " year " + i + " is : rs. " + repayment );
		}
		
		
	}
}
