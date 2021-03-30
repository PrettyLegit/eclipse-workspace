/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		11
 */

public class MainRadio {
	public static void main(String[] args) {

		Radio r1 = new Radio();

		System.out.println("Turn radio on:");
		r1.turnOn();
		System.out.println(r1.toString());

		System.out.println("Turn volume up by 3:");
		for (int i = 0; i < 3; i++) {
			r1.volumeUp();
		}
		System.out.println(r1.toString());

		System.out.println("Move station up by 5:");
		for (int i = 0; i < 5; i++) {
			r1.stationUp();
		}
		System.out.println(r1.toString());

		System.out.println("Turn volume down by 1:");
		r1.volumeDown();
		System.out.println(r1.toString());

		System.out.println("Move station up by 3:");
		for (int i = 0; i < 3; i++) {
			r1.stationDown();
		}
		System.out.println(r1.toString());

		System.out.println("Turn radio off.");
		r1.turnOff();
		System.out.println(r1.toString());

		System.out.println("Turn volume up by 2: ");
		System.out.println(r1.toString());

		System.out.println("Turn station down by 2: ");
		System.out.println(r1.toString());
	}
}
