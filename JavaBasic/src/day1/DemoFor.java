package day1;

import java.util.Scanner;

public class DemoFor {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter "+ i +" number : ");
			arr[i] = inp.nextInt();
		}
		
		findAverage(arr);
	}
	
	public static void findAverage(int arr[]) {
		int sum = 0;
		for(int i=0;i<5;i++) {
			if(arr[i]<0) {
				System.err.println("The number should not be negative!");
				return;
			}
			sum += arr[i];
		}
		System.out.println("Average : " + sum/arr.length);
	}
}
