import java.util.Random;
import java.util.Random;

public class BubbleSort {

	public static void BubbleSort(int[] array) {
		int n = array.length;
		int[] array2 = array.clone();
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

		// prints to the console
		System.out.print("Bubble Sorted Values: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.print("\nBubble Sort Swaps: " + count);
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

	}
	
}	
