
/* 
Class:	CSE 1321L 
Section: 	Lab 4          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		4
 */
import java.util.Scanner;

public class Youth {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int age;
		System.out.println("Enter your age.");
		age = reader.nextInt();
		System.out.println("You entered: " + age);

		if (age <= 21) {
			System.out.println("Youth is a wonderful thing. Enjoy.");
		}

		System.out.println("Age is a state of mind.");
	}
}
