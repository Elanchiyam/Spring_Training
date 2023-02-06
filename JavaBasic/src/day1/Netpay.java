package day1;

import java.util.Iterator;
import java.util.Scanner;

public class Netpay {
	public static void main(String[] args) {
		int[] basic = new int[5];
		int[] workingdays = new int[5];
		int[] netpay = new int[5];
		
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter basic of Employee "+ (i+1) + " : ");
			basic[i] = inp.nextInt();
			System.out.println("Enter workingdays of Employee "+ (i+1) +" : ");
			workingdays[i] = inp.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			if(workingdays[i]<30) {
				int leave = 30-workingdays[i];
				int perday = basic[i]/30;
				netpay[i] = basic[i] - (perday*leave);
			} else {
				netpay[i] = basic[i];
			}
				
		}
		
		System.out.println("Netpay of the  Employees :");
		for (int i = 0; i < netpay.length; i++) {
			System.out.println("Employee " + (i+1) + netpay[i]);
		}
	}
}
