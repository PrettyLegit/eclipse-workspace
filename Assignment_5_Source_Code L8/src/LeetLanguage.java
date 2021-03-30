/* 
Class: CSE 1321L 
Section: 	Assignemnt 5 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class LeetLanguage {
	
	public static void convertLeet(String english) { 
		
		int length = english.length();
		int positionCounter = 0;
		
		for (int count = 1; count <= length; count++) {
			
			//letter at position specified
			char letter = english.charAt(positionCounter);
			leetAlphabet(letter);
			positionCounter++;
			
		}
	}
	
	public static void leetAlphabet(char letter) {
		
		switch(letter) {	
		
		case 'a': System.out.print("4");
		break;
		
		case 'b': System.out.print("B");
		break;
		
		case 'c': System.out.print("(");
		break;
		
		case 'd': System.out.print("D");
		break;
		
		case 'e': System.out.print("3");
		break;
		
		case 'f': System.out.print("Ph");
		break;
		
		case 'g': System.out.print("9");
		break;
		
		case 'h': System.out.print("|-|");
		break;
		
		case 'i': System.out.print("1");
		break;
		
		case 'j': System.out.print("j");
		break;
		
		case 'k': System.out.print("|<");
		break;
		
		case 'l': System.out.print("L");
		break;
		
		case 'm': System.out.print("/\\/\\");
		break;
		
		case 'n': System.out.print("|\\|");
		break;
		
		case 'o': System.out.print("0");
		break;
		
		case 'p': System.out.print("P");
		break;
		
		case 'q': System.out.print("Q");
		break;
		
		case 'r': System.out.print("R");
		break;
		
		case 's': System.out.print("$");
		break;
		
		case 't': System.out.print("7");
		break;
		
		case 'u': System.out.print("U");
		break;
		
		case 'v': System.out.print("\\/");
		break;
		
		case 'w': System.out.print("\\/\\/");
		break;
		
		case 'x': System.out.print("><");
		break;
		
		case 'y': System.out.print("‘/");
		break;
		
		case 'z': System.out.print("Z");
		break;	
		
		case ' ': System.out.print(" ");
		break;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String english = "";
		
		System.out.print("Enter a string: ");
		english = reader.nextLine();
		
		convertLeet(english);
	}
}