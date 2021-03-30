
/* 
Class:	CSE 1321L 
Section: 	Lab 3          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		3
 */
import java.util.Scanner;

public class Coins {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int cents = 0;
		int dollars = 0;
		int total;
		// asking for coins
		System.out.println("Enter number of quarters: ");
		int quarters = reader.nextInt();
		System.out.println("Enter number of dimes: ");
		int dimes = reader.nextInt();
		System.out.println("Enter number of nickels: ");
		int nickels = reader.nextInt();
		System.out.println("Enter number of pennies: ");
		int pennies = reader.nextInt();
		reader.close();
		// display the results
		System.out.println("You entered " + quarters + " quarters");
		System.out.println("You entered " + dimes + " dimes");
		System.out.println("You entered " + nickels + " nickels");
		System.out.println("You entered " + pennies + " pennies");
		// time for some coversions
		quarters *= 25;
		dimes *= 10;
		nickels *= 5;
		pennies *= 1;
		// finding how many dollars and cents we have
		total = (quarters + dimes + nickels + pennies);
		cents = total % 100;
		dollars = total / 100;
		System.out.println("Your total is " + dollars + " Dollars and " + cents + " Cents.");
	}
}
