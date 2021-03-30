
/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		11
 */
import java.util.Scanner;

public class MainCircle {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		double input = 0;

		Circle circle1 = new Circle();

		// prints the default circle
		System.out.println(circle1.toString());

		System.out.println("(Enter in new radius.)");
		input = reader.nextDouble();

		Circle circle2 = new Circle(input);

		System.out.println("Set radius to " + input + " and print the object:\n");
		// prints new circle
		System.out.println(circle2.toString());
	}
}
