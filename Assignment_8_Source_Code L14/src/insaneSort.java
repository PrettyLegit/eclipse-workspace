
/* 
Class: CSE 1321L 
Section: 	Assignemnt 8 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Random;
import java.util.Arrays;

public class insaneSort {

	public static int[] shuffle(int[] numberArray) {
		Random rand = new Random();

		int[] numberArray2 = new int[5];
		int n = numberArray.length;
		int randomValue;
		int temp = 0;

		for (int i = n - 1; i > 0; i--) {
			randomValue = rand.nextInt(i + 1);
			temp = numberArray[i];
			numberArray[i] = numberArray[randomValue];

			numberArray[randomValue] = temp;

			numberArray2 = numberArray;
		}

		return numberArray2;
	}

	public static int[] BubbleSort(int[] numberArray) {
		
		int n = numberArray.length;
		int[] array2 = numberArray.clone();
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				
				if (array2[j] > array2[j + 1]) {
					
					int temp = array2[j];
					array2[j] = array2[j + 1];
					array2[j + 1] = temp;
					count++;
				}
			}
		}
		return array2;
	}	

	public static void main(String[] args) {
		Random rand = new Random();

		int[] numberArray = new int[5];
		int[] numberArrayShuffled;
		int[] arraySorted;

		// assign random numbers
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = rand.nextInt(50 + 1);

		}

		//we need to have a sorted array to compare to the permutation arrays
		arraySorted = BubbleSort(numberArray);
		
		// print random numbers
		for (int i = 0; i < numberArray.length; i++) {
			System.out.print("|");
			System.out.print(numberArray[i]);

		}
		System.out.println("|");

		do {

			numberArrayShuffled = shuffle(numberArray);

			for (int i = 0; i < numberArrayShuffled.length; i++) {
				System.out.print("|");
				System.out.print(numberArrayShuffled[i]);

			}
			System.out.println("|");

		

		} while (!Arrays.equals(numberArrayShuffled, arraySorted));

	}
}
