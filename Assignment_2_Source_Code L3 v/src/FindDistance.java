
/* 
Class:	CSE 1321L
Section: 	Assignment 2 Source Code Java          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;
import java.lang.Math;
public class FindDistance {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double x1, x2, y1, y2;
		double distanceTravelledX = 0;
		double distanceTravelledY = 0;
		double distanceTotal;
		
		// secure/display x1, y1, x2, and y2
		System.out.println("Enter x1 now.");
		x1 = reader.nextDouble();	
		System.out.println("Enter y1 now.");
		y1 = reader.nextDouble();		
		System.out.println("Enter x2 now.");
		x2 = reader.nextDouble();		
		System.out.println("Enter y2 now.");
		y2 = reader.nextDouble();
		
		
		distanceTravelledX = Math.pow(x2 - x1, 2);
		distanceTravelledY = Math.pow(y2 - y1, 2);
		distanceTotal = Math.sqrt(distanceTravelledX + distanceTravelledY);
		
		
		System.out.println("X1 is: " + x1);
		System.out.println("Y1 is: " + y1);
		System.out.println("X2 is: " + x2);
		System.out.println("Y2 is: " + y2);
		System.out.println("Distance is: " + distanceTotal);
	}

}
//ed the tutor helped me.
