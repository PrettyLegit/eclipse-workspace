/* 
Class: CSE 1321L 
Section: 	Module 5       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		9
 */
import java.util.Scanner;

public class SumDigits {

	public static int sumDigits(int number) {
		int sumNumbers = 0;
		int extractDigit;
		
		while (number != 0) {
			
		extractDigit = number % 10;
		sumNumbers += extractDigit;
		number /= 10;
		
		}
		//ask instructor if numbers should be made into a variable instead.
		return sumNumbers;

	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter in an integer.");
		number = reader.nextInt();
		
		int sumNumbers = sumDigits(number);
		
		System.out.println("You entered: " + number);
		System.out.println("Sum of digits: " + sumNumbers);
	}
}
