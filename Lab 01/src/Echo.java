//Class:CSE 1321L
//Section: 28        
//Term: Fall 2019
//Instructor: Dexter Howard
//Name: Jimmy Nguyen  
//Lab#: 1

// Program Echo.java 
// Demonstrate reading a string from the user.   
import java.util.Scanner;

public class Echo {
	// Reads a character string from the user and prints it.
	public static void main(String[] args) {
		String message;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a line of text:");
		message = scan.nextLine();
		System.out.println("You entered: \"" + message + "\"");
	}
}
