
/* 
Class: CSE 1321L 
Section: 	Module 7       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		12
 */
import java.util.Scanner;
import java.util.Arrays;

public class CompareArray {

	public static boolean Compare(int[] arr1, int[] arr2) {

		if (Arrays.equals(arr1, arr2)) {
			return true;
		} else {
			return false;

		}

	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int arraySize = 0;
		int arr1[];
		int arr2[];
		String judgement = "Judegement: The arrays are identical";

		System.out.println("Define array size.");
		arraySize = reader.nextInt();

		arr1 = new int[arraySize];
		arr2 = new int[arraySize];

		System.out.println("Enter in integer values into array 1.");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = reader.nextInt();
		}

		System.out.println("Enter in integer values into array 2.");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = reader.nextInt();
		}
		
		System.out.println("Array Size: " + arraySize);
		System.out.println("First array: " + Arrays.toString(arr1));
		System.out.println("Second array: " + Arrays.toString(arr2));
		
		// calling compare method
		boolean Compare = Compare(arr1, arr2);

		if (Compare) {
			System.out.println(judgement);
		} else {
			judgement = "Judegement:The arrays are not identical";
			System.out.println(judgement);
		}
	}
}
