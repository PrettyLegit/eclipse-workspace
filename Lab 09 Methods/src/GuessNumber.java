
/* 
Class: CSE 1321L 
Section: 	Module 5       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		9
 */
import java.util.Scanner;
import java.util.Random;
public class GuessNumber {

	public static int generateNumber() {
		Random rand = new Random();
		
		int secretNumber = rand.nextInt((20) + 1);

		return secretNumber;
	}

	public static int firstGuess() {
		Scanner reader = new Scanner(System.in);

		System.out.println("Guess the secret number.");
		int firstGuess = reader.nextInt();

		return firstGuess;
	}

	public static String guessEvaluate(int userInput, int secretNumber) {
		
		/*failFlag is used to mark whether or not we 
		 got it correct or if we need to try again in main
		 0 indicates we did not fail
		 1 indicates we did fail, therefore leave a flag behind
		 */
		
		//String failFlag = "1";
		String selection = "";
		String correctGuess = "You found the secret number.";
		String tooHigh = "Guess was too high.";
		String tooLow = "Guess was too low.";
		
		if (userInput == secretNumber) {
			selection = correctGuess;
			//failFlag = 0;
		}
		else if (userInput > secretNumber) {
			selection =  tooHigh;
			//failFlag = 1;
		}
		else if (userInput < secretNumber) {
			selection = tooLow;
			//failFlag = 1;
		}
		//return failFlag;
		return selection;
	}

	public static void main(String[] agrs) {
		Scanner reader = new Scanner(System.in);
		
		//this does the first run.
		int secretNumber = generateNumber();
		int userInput = firstGuess();
		
		String guessEvaluate = guessEvaluate(userInput, secretNumber);
		
		System.out.println(guessEvaluate);
		
		
		/*this takes like line 66's variable and compares the two strings are not equal
		 *while true we do the same things from 64 to 68
		  
		 */
		while (guessEvaluate != "You found the secret number.") {
			int choice = 0;
			
			System.out.println("Would you like to try again? yes[1] or no[0]");
			choice = reader.nextInt();
			
			if (choice == 1) {
				userInput = firstGuess();
				guessEvaluate = guessEvaluate(userInput, secretNumber);
				System.out.println(guessEvaluate);
				
			}
			else {
				System.out.println("Thanks for playing.");
				break;
			}
		}
		
	}

}
