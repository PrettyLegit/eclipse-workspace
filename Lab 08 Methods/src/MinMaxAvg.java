/* 
Class: CSE 1321L 
Section: 	Lab 8       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		8
 */
import java.util.Scanner;

public class MinMaxAvg {
	
	public static int max (int x, int y, int z) {
		
		int localmaxVal = 0;
		
		if( (x > y) && (x > z) ) {
			localmaxVal = x;
		}
	
		if( (y > x) && (y > z) ) {
			localmaxVal = y;
		}
		
		if( (z > x) && (z > y) ) {
			localmaxVal = z;
		}
		
		return localmaxVal;
	}
	
	public static int min (int x, int y, int z) {
		
		int localminVal = 0;
		
		if( (x < y) && (x < z) ) {
			localminVal = x;
		}
	
		if( (y < x) && (y < z) ) {
			localminVal = y;
		}
		
		if( (z < x) && (z < y) ) {
			localminVal = z;
		}
		
		return localminVal;
	}
	
	public static int average (int x, int y, int z) {
		
		int localavgVal = 0;
		
		localavgVal = (x + y + z) / 3;
		
		return localavgVal;
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		int num1, num2, num3; 
		
		System.out.println("Enter in the first number.");
		num1 = reader.nextInt();
		
		System.out.println("Enter in the second number.");
		num2 = reader.nextInt();
		
		System.out.println("Enter in the thrid number.");
		num3 = reader.nextInt();
		
		//global variables
		int maxValue = max(num1, num2, num3);
		int minValue = min(num1, num2, num3);
		int avgValue = average(num1, num2, num3);
		
		System.out.println("You entered: " + num1 + ", " + num2 + ", " + num3);
		System.out.println("Max value: " + maxValue);
		System.out.println("Min value: " + minValue);
		System.out.println("Average value: " + avgValue);
	}
	
}
