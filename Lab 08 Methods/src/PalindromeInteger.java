
/* 
Class: CSE 1321L 
Section: 	Lab 8       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		8
 */

import java.util.Scanner;

public class PalindromeInteger {

	public static int reverse(int number) {
		
		int reverse = 0;

		while (number != 0) {
			reverse *= 10;

			reverse += number % 10;

			number /= 10;
		}
		return reverse;
	}

	public static String isPalindrome(int number, int reverseNumber) {
		
		String judgement = "";
		
		if (number == reverseNumber) {
			judgement = "Palindrome";
		}
		else {
			judgement = "Not palindrome";
		}
			
		return judgement;
	}

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

		String judgement;
		int number;

		System.out.println("Enter in a value");
		number = reader.nextInt();

		int reverseNumber = reverse(number);
		judgement = isPalindrome(number, reverseNumber);
				
		System.out.println("Entered value: " + number);
		System.out.println("Judgement: " + judgement);
	}

}
