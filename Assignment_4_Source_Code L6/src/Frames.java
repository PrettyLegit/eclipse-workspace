/* 
Class: CSE 1321L 
Section: 	Assignment 4 Source Code         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class Frames {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		//declare
		double x;
		double y;
		double xVelocity;
		double yVelocity;
		
		//input
		System.out.print("Enter intial position x: ");
		x = reader.nextDouble();
		
		System.out.print("Enter intial position y: ");
		y = reader.nextDouble();
		
		System.out.print("Enter intial velocity x: ");
		xVelocity = reader.nextDouble();
		
		System.out.print("Enter intial velocity y: ");
		yVelocity = reader.nextDouble();
		
		//math	
			while ( (x < 100) && (x > 0 ) ) {
				
				System.out.printf("X:  %.1f\t", x); 
				x += xVelocity;
			
				System.out.printf("Y:  %.1f\n", y); 
				y += yVelocity;
			} 
			
			while ( (x <= 100) && (x >= 0 ) ) {
				
				System.out.printf("X:  %.1f\t", x);
				
				
				x += xVelocity;
			
				System.out.printf("Y:  %.1f\n", y); 
				
				
				y += yVelocity;
			} 
	
			System.out.printf("X:  %.1f\t", x); 
	
			System.out.printf("Y:  %.1f\n", y); 
	}
}
		