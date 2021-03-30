/* 
Class: CSE 1321L 
Section: 	Lab 7        
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		7
 */
import java.util.Scanner;

public class Symbol {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char symbol = 0;
		int input;
		int count = 1;
		
		System.out.println("Enter in a character. ");
		symbol = reader.next().charAt(symbol);
		
		System.out.println("Enter a number. ");
		input = reader.nextInt();
		
		for (int i = 1; i <= input; i++) {
			System.out.println();
			
			while (input >= count) {
			System.out.print(symbol);
			count++;
			}
			count = 1;
		}
		
	}
}
