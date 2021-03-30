
/* 
Class: CSE 1321L 
Section: 	Lab 5         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		5
 */

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int x;
		int y;

		System.out.println("Enter in x value.");
		x = reader.nextInt();

		System.out.println("Enter in y value.");
		y = reader.nextInt();

		// first quadrant
		if ((x > 0) && (y > 0)) {
			System.out.println("(" + x + "," + y + ")" + " is in the first quadrant.");
		}
		// second quadrant
		if ((x < 0) && (y > 0)) {
			System.out.println("(" + x + "," + y + ")" + " is in the second quadrant.");
		}
		// third quadrant
		if ((x < 0) && (y < 0)) {
			System.out.println("(" + x + "," + y + ")" + " is in the third quadrant.");
		}
		// fourth quadrant
		if ((x > 0) && (y < 0)) {
			System.out.println("(" + x + "," + y + ")" + " is in the fourth quadrant.");
		}
		//origin or x axis or y axis
		if (x == 0 && y == 0) {
			System.out.println("(" + x + "," + y + ")" + " is on the origin point.");
		}else if (y == 0) {
			System.out.println("(" + x + "," + y + ")" + " is on the x-axis.");
		}else if (x == 0) {
			System.out.println("(" + x + "," + y + ")" + " is on the y-axis.");
		}
	}
}
