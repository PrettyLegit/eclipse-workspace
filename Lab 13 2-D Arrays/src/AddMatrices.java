
/* 
Class: CSE 1321L 
Section: 	Lab 13      
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		13
 */
import java.util.Scanner;

public class AddMatrices {

	public static int[][] Addition(int[][] matrixA, int[][] matrixB){
		int[][] sumArray = new int[3][3];
		
		int count = 0;
		
		
		for(int row = 0; row < 3; row++) {
			
			for(int column = 0; column < 3; column++) {
				
				int countA = 0;
				int countB = 0;
				countA += matrixA[row][column];
				countB += matrixB[row][column];
				count = countA + countB;
				sumArray[row][column] = count;
			}
			count = 0;
		}
		
		return sumArray;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		int[][] matrixSum = new int[3][3];

		// the below variables are in charge of invoking the switch
		int selectMatrix = 0;
		int printMatrix = 0;
		/*
		 * because we only are only working with two matricies i would like to use
		 * switch and for loop. it reduces the amount of code needed to achieve a
		 * solution.
		 */

		for (int i = 0; i < 2; i++) {

			for (int row = 0; row < 3; row++) {

				for (int column = 0; column < 3; column++) {

					switch (selectMatrix) {
					case 0:
						System.out.println("Enter value for matrix A [" + row + ", " + column + "]");
						matrixA[row][column] = reader.nextInt();
						break;
					case 1:
						System.out.println("Enter value for matrix B [" + row + ", " + column + "]");
						matrixB[row][column] = reader.nextInt();
						break;
					}
				}
			}
			
			selectMatrix++;
		}

		for (int i = 0; i < 2; i++) {
			
			if(i == 0) {
				System.out.println("Matrix A:");
			}else {
				System.out.println("Matrix B:");
			}
			
			for (int row = 0; row < 3; row++) {

				for (int column = 0; column < 3; column++) {

					switch (printMatrix) {
					case 0:
						
						System.out.print(matrixA[row][column] + "\t");
						break;
					case 1:
						
						System.out.print(matrixB[row][column] + "\t");
						break;
					}
				}
				
				System.out.println("\n");
			}
			
			printMatrix++;
		}
		
		matrixSum = Addition(matrixA, matrixB);
		
		System.out.println("A + B: ");
		
		for(int row = 0; row < 3; row++) {
			
			for(int column = 0; column < 3; column++) {
				
				System.out.print(matrixSum[row][column] + "\t");
			}
			System.out.println();
		}
		
	}
}