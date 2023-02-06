package day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
				
		String options = "yes";
		
		do {
			System.out.println("Enter first number : ");
			int number1 = inp.nextInt();
			
			System.out.println("Enter second number : ");
			int number2 = inp.nextInt();
			
			System.out.println("Choose operator : \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division ");
			int choice = inp.nextInt();
			
			calculate(number1, number2, choice);
			
			System.out.println("Do you want to continue? type 'yes' or 'no'");
			options = inp.next();
		}while(options.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you!");
	}
	
	public static void calculate(int number1, int number2, int choice) {
		
		switch (choice) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 * number2);
			break;
		case 4:
			System.out.println(number1 / number2);
			break;
	
		default:
			System.err.println("Please choose correct option! ");
			break;
		}
	}
}
