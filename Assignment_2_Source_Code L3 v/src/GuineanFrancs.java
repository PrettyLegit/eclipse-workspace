/* 
Class:	CSE 1321L
Section: 	Assignment 2 Source Code Java          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
public class GuineanFrancs {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double guineanFrancsRate = 9240.00;
		double usaDollars;
		double guineanFrancs;
		System.out.println("Please enter the amount of US dollars you wish to convert into Guinean Francs? Please do not include any symbols.");
		usaDollars = reader.nextDouble();
		guineanFrancs = (guineanFrancsRate * usaDollars);
		System.out.println("As of now, the total US dollars you have is: $" + usaDollars);
		System.out.println("You have " + guineanFrancs + " Guinean Francs.");
		
	}
}
