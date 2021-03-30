
/* 
Class: CSE 1321L 
Section: 	Lab 13      
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		13
 */
import java.util.Scanner;

public class SumArrayColumns {

	public static int[] sumColumns(int[][] userArray) {
		int[] sumColumnArray = new int[4];
		int count = 0;

		for (int column = 0; column < 4; column++) {
			for (int row = 0; row < 3; row++) {

				count += userArray[row][column];

			}
			sumColumnArray[column] = count;
			count = 0;
		}

		return sumColumnArray;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[][] userArray = new int[3][4];
		int[] sumColumnArray;

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

		sumColumnArray = sumColumns(userArray);

		for (int i = 0; i < sumColumnArray.length; i++) {
			System.out.println("Sum of column " + i + " is " + sumColumnArray[i]);
		}
	}
}
