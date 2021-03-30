/* 
Class:	CSE 1321L 
Section: 	Lab 3          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		3
 */
import java.util.Scanner;
public class SimpleMath {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		//assigning user input to R
		System.out.println ("Enter a value for R. ");
		float R = reader.nextInt();
		System.out.println ("R = " + R);
		//assinging user input to T
		System.out.println ("Enter a value for T. ");
		float T = reader.nextInt();
		System.out.println ("T = " + T);
		reader.close();
		//time for some math
		float add = R + T;
		System.out.println ("R + T = " + add);
		float subtract = R - T;
		System.out.println ("R - T = " + subtract);
		float multiply = R * T;
		System.out.println ("R * T = " + multiply);

	}
}
