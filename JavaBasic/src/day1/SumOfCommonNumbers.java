package day1;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfCommonNumbers {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter array 1 size : ");
		int m = inp.nextInt();
		
		System.out.print("Enter array 2 size : ");
		int n = inp.nextInt();
		
		int array1[] = new int[m];
		int array2[] = new int[n];
		
		System.out.println("Enter first array :");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = inp.nextInt();
		}
		
		System.out.println("Enter second array :");
		for (int i = 0; i < array1.length; i++) {
			array2[i] = inp.nextInt();
		}
		
		Arrays.sort(array2);
		
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					sum+=array1[i];		
				}
				if(array2[j]>array1[i])
					break;
			}
		}
		System.out.println("Common Sum : "+ sum);
	}

}
