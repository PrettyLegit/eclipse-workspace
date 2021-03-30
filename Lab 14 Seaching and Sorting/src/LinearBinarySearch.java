/* 
Class: CSE 1321L 
Section: 	Lab 14       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		14
 */
import java.util.Scanner;
public class LinearBinarySearch {
	
	public static boolean LinearSearch (int[] array, int targetValue) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count++;
			if(array[i] == targetValue) {
				System.out.println("Linear Search Comparisons: " + count);
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean BinarySearch(int[] array, int targetValue) {
		boolean found = false;
		int count = 0;
		int low = 0, mid = 0, high = array.length;
		
		while(!found) {
			mid = (low + high) / 2;
			count++;
			
			if(targetValue == array[mid]) {
				System.out.println("Binary Search Comparisons: " + count);
				return true;
			}else if(targetValue < array[mid]) {
				high = mid;
			}else {
				low = mid;
			}
			if(low >= high - 1) {
				return false;
			}
			
		}
		
		return found;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int arraySize = 0;
		int targetValue = 0;
		int[] array;
		
		System.out.println("Enter the target Value");
		targetValue = reader.nextInt();
		
		System.out.println("How big is the array");
		arraySize = reader.nextInt();
		array = new int [arraySize];
		
		System.out.println("Enter in values for array");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = reader.nextInt();
		}
		
		System.out.print("Array Values: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(array.length != (array.length - 1)) {
				System.out.print(" ");
			}
		}
		
		System.out.println("\nTarget Value: " + targetValue + "\n");
		
		LinearSearch(array, targetValue);
		BinarySearch(array, targetValue);
		
	}
}
