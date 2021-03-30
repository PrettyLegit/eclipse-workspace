
/* 
Class: CSE 1321L 
Section: 	Lab 13      
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		13
 */
import java.util.Scanner;

public class LocateLargestElement {

	public static int[] locateLargest(int[][] userArray) {

		int[] largestValueArray = new int[2];
		int maxNum;
		int xAxis;
		int yAxis;
		int count = 0;
		
		maxNum = userArray[0][0];
		xAxis = 0;
		yAxis = 0;

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 4; column++) {

				if (maxNum < userArray[row][column]) {
					maxNum = userArray[row][column];

					xAxis = row;

					yAxis = column;
				}
			}
		}
		
		largestValueArray[count] = xAxis;
		
		count++;
		
		largestValueArray[count] = yAxis;
	
		return largestValueArray;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[][] userArray = new int[3][4];
		int[] largestValueArray;

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 4; column++) {
				System.out.println("Enter value for [" + row + ", " + column + "]");

				userArray[row][column] = reader.nextInt();
			}
		}

		System.out.println("The entered matrix:");

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 4; column++) {

				System.out.print(userArray[row][column] + "\t");
			}

			System.out.println("\n");
		}

		largestValueArray = locateLargest(userArray);

		System.out.println("First largest value is located row " + largestValueArray[0] +
				" and column " + largestValueArray[1]);
		
	}
}
