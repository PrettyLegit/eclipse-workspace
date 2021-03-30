import java.util.Random;

public class SelectionSort {
	public static void SelectionSort(int[] array) {
		int n = array.length;
		int[] array2 = array.clone();
		int count = 0;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {

			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
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
			
		}
		System.out.print("Selection Sorted Values: ");
		for (int i = 0; i < n; ++i) {
			System.out.print(array2[i] + " ");
		}
		System.out.print("\nSelection Sort Swaps: " + count);
	}

	public static void printArray(int[] array2) {
		for (int p = 0; p < array2.length; p++) {
			if(p == array2.length) {
				System.out.print(array2[p]);
			}
			else {
				System.out.print(array2[p] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int array[] = new int[5];
	
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101);
		}

		System.out.print("Array values: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println("\n");
		SelectionSort(array);
	}
}
