
/* 
Class: CSE 1321L 
Section: 	Lab 14       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		14
 */
import java.util.Random;

public class SimpleSort {

	public static void BubbleSort(int[] array) {
		int n = array.length;
		int[] array2 = array.clone();
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				
				if (array2[j] > array2[j + 1]) {
					// swap array[j+1] and array[i]
					int temp = array2[j];
					array2[j] = array2[j + 1];
					array2[j + 1] = temp;
					count++;
				}
			}
		}
		System.out.print("Bubble Sorted Values: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array2[i] + " ");

		}
		System.out.print("\nBubble Sort Swaps: " + count);
	}

	public static void InsertionSort(int[] array) {
	
		int[] array2 = array.clone();
		int count = 0;

		for (int i = 1; i < array2.length; i++) {
			int key = array2[i];
			int position = i;

			while (position > 0 && key < array2[position -1]) {
				array2[position] = array2[position - 1];
				count++;
				position--;
			}

			key = array2[position];
		}
		System.out.print("Insertion Sorted Values: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.print("\nInsertion Sort Swaps: " + count);
	}

	public static void SelectionSort(int[] array) {
		int n = array.length;
		int[] array2 = array.clone();
		int count = 0;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {

			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (array2[j] < array2[min_idx]) {
					min_idx = j;
					count++;
				}
			
			// Swap the found minimum element with the first
			// element
			int temp = array2[min_idx];
			array2[min_idx] = array2[i];
			array2[i] = temp;

		}
		System.out.print("Selection Sorted Values: ");
		for (int i = 0; i < n; ++i) {
			System.out.print(array2[i] + " ");
		}
		System.out.print("\nSelection Sort Swaps: " + count);
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int array[] = new int[50];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101);
		}

		System.out.print("Array values: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println("\n");
		BubbleSort(array);

		System.out.println("\n");
		InsertionSort(array);

		System.out.println("\n");
		SelectionSort(array);

	}
}
