
/* 
Class: CSE 1321L 
Section: 	Assignemnt 7 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
import java.util.Random;

//import java.util.Arrays;
public class Rabbit {

	public static char[] createGame(int userInput, int rabbitLocation, char[] cloneRabbitArray) {

		char[] rabbitArray = cloneRabbitArray;
		
		if (userInput <= 9 && userInput >= 0) {
			if (userInput != rabbitLocation) {
				rabbitArray[userInput] = 'X';
			}
			if (userInput == rabbitLocation) {
				rabbitArray[userInput] = 'R';
			}
		}
		return rabbitArray;
	}

	public static void toString(char[] rabbitArray, int userInput, int rabbitLocation) {
		if(userInput != rabbitLocation) {
			
			for (int i = 0; i < rabbitArray.length; i++) {
			System.out.print("|" + rabbitArray[i]);
			}
			
			System.out.println("|");
			
		}else if(userInput == rabbitLocation) {
			
			for (int i = 0; i < rabbitArray.length; i++) {
				System.out.print("|" + rabbitArray[i]);
				}
				System.out.println("|");
				System.out.println("You found the rabbit!");
		}
		
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		int userInput = -1;
		int rabbitLocation = -1;
		char[] rabbitArray = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

		System.out.println("Find the rabbit!");

		// generates a hole for rabbit to hide in
		// dont forget that random function at 10 includes number from 0-9
		rabbitLocation = rand.nextInt(10);
		
		//Remove comment 67 if you want to know value of rabbit
		//System.out.println(rabbitLocation);		

		toString(rabbitArray, userInput, rabbitLocation);
		
		do {

			System.out.print("Pick a hole (0-9): ");
			
			userInput = reader.nextInt();

			char[] cloneRabbitArray = rabbitArray;
			
			rabbitArray = createGame(userInput, rabbitLocation, cloneRabbitArray);
			
			toString(rabbitArray, userInput, rabbitLocation);
			
		} while (userInput != rabbitLocation);

	}
}
