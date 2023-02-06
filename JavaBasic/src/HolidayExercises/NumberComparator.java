package HolidayExercises;
import java.util.Scanner;

public class NumberComparator {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		int num3 = inp.nextInt();
		int num4 = inp.nextInt();
		
		String str = numberComparator(num1, num2, num3, num4);
		System.out.println(str);
	}
	
	static String numberComparator(int num1, int num2, int num3, int num4) {
		int temp ;
		if(num1>num2) {temp=num1;num1 = num2;num2=temp;}
		if(num3>num4) {temp=num3;num3 = num4;num4=temp;}
		if(num1>num3) {temp=num1;num1 = num3;num3=temp;}
		if(num2>num4) {temp=num2;num2 = num4;num4=temp;}
		if(num2>num3) {temp=num2;num2 = num3;num3=temp;}
		
		return num1 + " " + num2 + " " + num3 + " " + num4;
	}
}
