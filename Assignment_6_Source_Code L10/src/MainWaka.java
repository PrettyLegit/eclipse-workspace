
/* 
Class: CSE 1321L 
Section: 	Assignemnt 6 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */

import java.util.Scanner;

public class MainWaka {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char userInput = 'A';

		Waka Waka1 = new Waka();

		/*
		 * at first we made a method that did take in parameters and returned.. it was
		 * determined that this method is not needed for user input works for quit. I
		 * programmed this October 23, 2019 at 3:32 AM like a mad man.
		 * Waka1.getQuit('A') (Waka1.getQuit(userInput)
		 */
		while (userInput != 'Q') {
			System.out.println("Current location - " + "X:" + Waka1.getX() + " Y:" + Waka1.getY());
			System.out.println("(U)p, (D)own, (L)eft, (R)ight or (Q)uit:");

			userInput = reader.next().charAt(0);

			Waka1.setUp(userInput);
			Waka1.setDown(userInput);
			Waka1.setLeft(userInput);
			Waka1.setRight(userInput);
		}

	}
}
