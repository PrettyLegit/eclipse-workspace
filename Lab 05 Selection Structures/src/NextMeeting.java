
/* 
Class: CSE 1321L 
Section: 	Lab 5         
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		5
 */

import java.util.Scanner;

public class NextMeeting {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// declare
		int today;
		int daysTill = 0;
		int meetingDay = 0;

		// read
		System.out.println("Enter day (number). ");
		today = reader.nextInt();

		System.out.println("Days till the meeting is? ");
		daysTill = reader.nextInt();

		// math
		meetingDay = (today + daysTill) % 7;

		// print
		switch (today) {
		case 0:
			System.out.println("Today is Sunday");
			break;

		case 1:
			System.out.println("Today is Monday");
			break;

		case 2:
			System.out.println("Today is Tuesday");
			break;

		case 3:
			System.out.println("Today is Wednesday");
			break;

		case 4:
			System.out.println("Today is Thrusday");
			break;

		case 5:
			System.out.println("Today is Friday");
			break;

		case 6:
			System.out.println("Today is Saturday");
			break;
		}

		// print
		System.out.println("Days till meeting is " + daysTill);

		// print
		switch (meetingDay) {
		case 0:
			System.out.println("Meeting day is Sunday");
			break;

		case 1:
			System.out.println("Meeting day is Monday");
			break;

		case 2:
			System.out.println("Meeting day is Tuesday");
			break;

		case 3:
			System.out.println("Meeting day is Wednesday");
			break;

		case 4:
			System.out.println("Meeting day is Thrusday");
			break;

		case 5:
			System.out.println("Meeting day is Friday");
			break;

		case 6:
			System.out.println("Meeting day is Saturday");
			break;
		}
	}
}
