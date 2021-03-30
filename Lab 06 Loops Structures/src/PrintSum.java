
/* 
Class: CSE 1321L 
Section: 	Lab 6         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		6
 */
import java.util.Scanner;

public class PrintSum {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int input; 
		int sum = 0;
		int integersBefore = 0;
		int count = 0;
		
		System.out.println("Enter a number between 1-100: ");
		input = reader.nextInt();
		
		System.out.println("You entered: " + input);
		
		if ( (input >= 0) && (input <=100) ) {
		while (count < input) {
			integersBefore = integersBefore + 1;
			count++;
			sum = sum + integersBefore;
		}
		System.out.println("Sum of values: " + sum);
		}else 
		System.out.println("Invalid input. Try again.");	
		
			
	}
}
