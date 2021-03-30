/* 
Class: CSE 1321L 
Section: 	Assignment 4 Source Code         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); 
		
		//declare
		double principle;
		double annualAddition;
		double growthYear;
		double interestRate;
		
		//input
		System.out.print("Enter the principle: ");
		principle = reader.nextDouble();
		
		double total = principle;
		
		System.out.print("Enter the annual addition: ");
		annualAddition = reader.nextDouble();
		
		System.out.print("Enter the number of years to grow: ");
		growthYear = reader.nextDouble();
		
		System.out.print("Enter the interest rate as a percentage: ");
		interestRate = reader.nextDouble();
		
		//math
		interestRate = interestRate / 100;
		
		for (int i = 0; i <= growthYear; i++) {
			//results
			System.out.print("Year " + i + ": ");
			System.out.printf("%.1f\n", total);
			total = (total + annualAddition) * (1 + interestRate);
		}
		
		}
	}
	

