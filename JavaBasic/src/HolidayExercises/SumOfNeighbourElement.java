package HolidayExercises;

import java.util.Scanner;

public class SumOfNeighbourElement {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter row size of an array : ");
		int row = inp.nextInt();
		System.out.println("Enter column size of an array : ");;
		int col = inp.nextInt();
		int[][] array = new int[row][col];
		if(row==1 && col==2) {
			System.out.println("Give proper input");
			return;
		}
		System.out.println("Enter array elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = inp.nextInt();
			}
		}
		
		int[][] result = calculateSumOfAllNeighbourElements(array);
		if(result !=null) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		} 
	}
	

	public static int[][] calculateSumOfAllNeighbourElements(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		if(row<col)
			return null;
		int result[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				if (i == 0) {
                    if (j == 0) {
                    	//dells with the top left corner
                        result[i][j] = arr[i + 1][j + 1] + arr[i][j + 1] + arr[i + 1][j];
                    } else if (j == arr[i].length - 1) {
                    	//dells with the top right corner
                        result[i][j] = arr[i + 1][j - 1] + arr[i][j - 1] + arr[i + 1][j];
                    } else {
                    	//top middles
                        result[i][j] = arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j + 1] + arr[i + 1][j - 1] + arr[i + 1][j];
                    }
                } else if (i == arr.length - 1) {
                    if (j == 0) {
                    	//dells with the bottom left corner
                        result[i][j] = arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j + 1];
                    } else if (j == arr[i].length - 1) {
                    	//dells with the bottom right corner
                        result[i][j] = arr[i - 1][j] + arr[i][j - 1] + arr[i - 1][j - 1];
                    } else {
                    	//dells with the bottom middles
                        result[i][j] = arr[i - 1][j] + arr[i - 1][j - 1] + arr[i - 1][j + 1] + arr[i][j + 1] + arr[i][j - 1];
                    }
                } else if (j == 0) {
                	//first column
                    if ((i != 0) && (i != arr.length - 1))
                    	//dells with the left middles
                        result[i][j] = arr[i - 1][j] + arr[i + 1][j] + arr[i + 1][j + 1] + arr[i - 1][j + 1] + arr[i][j + 1];
                } else if (j == arr[i].length - 1) {
                	//last column
                    if ((i != 0) && (i != arr.length - 1))
                    	//dells with the right  middles
                        result[i][j] = arr[i - 1][j] + arr[i + 1][j] + arr[i - 1][j - 1] + arr[i][j - 1] + arr[i + 1][j - 1];
                } else {
                	//dells with the all the rest
                    result[i][j] = arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j - 1] + arr[i + 1][j + 1] + arr[i - 1][j] + arr[i - 1][j - 1] + arr[i - 1][j + 1];
                }
			}
			
		}
		return result;
	}
}
