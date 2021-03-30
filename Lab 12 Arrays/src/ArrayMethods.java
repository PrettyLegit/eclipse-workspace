/* 
Class: CSE 1321L 
Section: 	Module 7       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		12
 */
import java.util.Arrays;
import java.util.Random;
public class ArrayMethods {
	public static int arrayMax(int[] arr) {
		int maxVal = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
	
	public static int arrayMin(int[] arr) {
		int minVal = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];
			}
		}
		return minVal;
	}
	
	public static void arraySquared(int[] arr) {
		int[] squaredArr = arr;
		//
		/*it doesn't matter what we use for the i is less than property. 
		 * we want to avoid changing the properties of arr so we might as well
		 * adopt the squaredArr.length convention so we know this loop is designed for our squaredArr
		 */
		for(int i = 0; i < squaredArr.length; i++) {
			squaredArr[i] = (int) Math.pow(squaredArr[i], 2);
		}
		System.out.println("Squared array: " + Arrays.toString(squaredArr));
	}
	
	public static void arrayReverse(int[] arr) {
		int[] reverseArr = arr;
		
		System.out.print("Reversed array: ");
		for(int i = 0; i < reverseArr.length; i++) {
			//reverseArr[i] = arr[arr.length - i - 1];
			System.out.print(arr[arr.length - i - 1]);
			if(i != 4) {
				System.out.print(", ");
			}
		}
		//System.out.println("Reversed array: " + Arrays.toString(reverseArr));
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] arr = new int[5];
		int maxVal = 0;
		int minVal = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100) + 1;
		}
		maxVal = arrayMax(arr);
		minVal = arrayMin(arr);
		
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("Max value: " + maxVal);
		System.out.println("Min value: " + minVal);
		
		arraySquared(arr);
		arrayReverse(arr);
	}
}
