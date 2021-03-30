/* 
Class: CSE 1321L 
Section: 	Module 5       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		9
 */
import java.util.Scanner;
public class PrintCharacters {
	
	public static void printChars(char ch1, char ch2) {
		int count = 0;
		while (ch1 <= ch2) {
			System.out.print(ch1 + " ");
			ch1++;
			count++;
			if( (count % 5) == 0) {
				System.out.print("\n");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char ch1, ch2;
		
		System.out.println("Enter a start character");
		ch1 = reader.next().charAt(0);
		
		System.out.println("Enter an end character");
		ch2 = reader.next().charAt(0);
		
		System.out.println("Start chacter: " + ch1);
		System.out.println("Start chacter: " + ch2);
		
		if (ch1 < ch2) {
			printChars(ch1, ch2);
		}
		else {
			System.out.println("Output: start and end characters are out of order. Try again.");
		}
		
	}
	
}
/*ill need to assign numbers to the characters and then 
validate with if > or < and make sure the numbers are in order
i think i will need another method to convert the intials into numbers
*/