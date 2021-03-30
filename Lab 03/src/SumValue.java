/* 
Class:	CSE 1321L
Section: 	Lab 3          
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		3
 */
import java.util.Scanner;

public class SumValue {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		//scans for x
		System.out.println("Enter a number for X. ");
		float xValue = reader.nextInt();
		System.out.println("X = " + xValue);
		//scans for y
		System.out.print("Enter a number for Y. ");
		float yValue = reader.nextInt();
		System.out.println("Y = " + yValue);
		//scans for z
		System.out.println("Enter a number for Z. ");
		float zValue = reader.nextInt();
		System.out.println("Z= " + zValue);
		//closes the reader.
		reader.close();
		double average;
		average = (xValue + yValue + zValue)/3 ;
		System.out.println("Average = " + average);
	}
}
