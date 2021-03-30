
/* 
Class: CSE 1321L 
Section: 	Assignment 3 Source Code Java          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
public class TaxesBrackets {
	public static void main(String[] args) {
		
		double income;
		int tax = 0;

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter your salery to the nearest doller: ");
		income = reader.nextDouble();
		
 		if (income > 500000) {
 			tax += (( income -500000) * .37); 
 			income = 500000;
 		}
 		if (income > 200000) {
 			tax += (( income -200000) * .35);
 			income = 200000;
 		}
		if (income > 157500) {
			tax += ((income - 157500) * .32);
			income = 157500;
		}
		if (income > 82500) {
			tax += ((income - 82500) * .24);
			income = 82500;
		}
		if (income > 38700) {
			tax += ((income - 38700) * .22);
			income = 38700;
		}		
		if (income > 9525) {
			tax += ((income - 9525) * .12);
			income = 9525;
		}			
		if (income > 0) {
			tax += ((income - 0) * .10);
			income = 0;
		}					
		
		System.out.println("Total tax owed is: " + "$" + tax);
	}
}