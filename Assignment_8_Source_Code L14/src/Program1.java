/* 
Class: CSE 1321L 
Section: 	Assignemnt 8 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	public static boolean isEquivalent(int[] arrayAClone, int[] arrayBClone) {

		int[] arrayASorted;
		int[] arrayBSorted;

		arrayASorted = BubbleSort(arrayAClone);
		arrayBSorted = BubbleSort(arrayBClone);

		if (Arrays.equals(arrayASorted, arrayBSorted)) {
			return true;
		}
		return false;
	}

	public static int[] BubbleSort(int[] array) {
		int n = array.length;
		int[] array2 = array.clone();
		//int count = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				if (array2[j] > array2[j + 1]) {

					int temp = array2[j];
					array2[j] = array2[j + 1];
					array2[j + 1] = temp;
					//count++;
				}
			}
		}
		return array2;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		boolean judgement = false;
		int[][] arrayA = new int[3][3];
		int[][] arrayB = new int[3][3];
		int[] arrayAClone = new int[9];
		int[] arrayBClone = new int[9];
		int count = 0;

		System.out.println("Enter in values for the first array.");

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 3; column++) {

				System.out.println("Enter value for [" + row + ", " + column + "]");
				
				arrayA[row][column] = reader.nextInt();
				arrayAClone[count] = arrayA[row][column];
				count++;
				
			}

		}
		count = 0;

		System.out.println("Enter in values for the second array.");

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 3; column++) {

				System.out.println("Enter value for [" + row + ", " + column + "]");
				
				arrayB[row][column] = reader.nextInt();
				arrayBClone[count] = arrayB[row][column];
				count++;
			}

		}

		System.out.println("Array A:");

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 3; column++) {

				System.out.print("\t" + arrayA[row][column] + "\t");
			}

			System.out.println("\n");
		}

		System.out.println("Array B:");

		for (int row = 0; row < 3; row++) {

			for (int column = 0; column < 3; column++) {

				System.out.print("\t" + arrayB[row][column] + "\t");
			}

			System.out.println("\n");
		}

		judgement = isEquivalent(arrayAClone, arrayBClone);
		
		if(judgement) {
			System.out.println("Judgement: The arrays are equivalent.");
		}else {
			System.out.println("Judgement: The arrays are not equivalent.");
		}
	}
}
