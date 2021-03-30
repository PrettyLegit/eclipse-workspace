
/* 
Class: CSE 1321L 
Section: 	Assignment 2 Source Code Java          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class Airplane {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double distance, costFuel, priceToFly, ticketCost, profit, mpppg;
		int people;

		System.out.println("Enter the flight distance: ");
		distance = reader.nextDouble();
		System.out.println("Enter the current cost of jet fuel: ");
		costFuel = reader.nextDouble();
		priceToFly = distance * 5 * costFuel;
		System.out.println("The flight will cost $" + priceToFly + " in fuel.\n");
		System.out.println("Enter number of people.");
		people = reader.nextInt();
		System.out.println("Enter the average cost of a ticket: ");
		ticketCost = reader.nextDouble();
		profit = (ticketCost * people) - (priceToFly);
		mpppg = people / 5;
		System.out.println("You will make a profit of $" + profit + ".");
		System.out.println("You averaged " + mpppg + " miles per person per gallon.");
	}
}
//ed the tutor helped me.