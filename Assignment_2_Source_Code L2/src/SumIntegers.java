/* 
Class:	CSE 1321L
Section: 	Assignment 2 Source Code Java          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
public class SumIntegers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberEntered, sumDigits, operationMod;
		System.out.println("Enter a number between 0 and 1000.");
		numberEntered = reader.nextInt();
		System.out.println("Entered number: " + numberEntered);
		//first integer
		operationMod = numberEntered % 10;
		sumDigits = operationMod;
		//second integer
		numberEntered = numberEntered / 10;
		operationMod = numberEntered % 10;
		sumDigits = sumDigits + operationMod;
		//third integer
		numberEntered = numberEntered / 10;
		operationMod = numberEntered % 10;
		sumDigits = sumDigits + operationMod;
		//fourth integer
		numberEntered = numberEntered / 10;
		operationMod = numberEntered % 10;
		sumDigits = sumDigits + operationMod;
		System.out.println("Sum of digits: " + sumDigits);
	}
}
