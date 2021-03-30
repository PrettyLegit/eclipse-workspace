// Jimmy Nguyen
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String name = "";
		String age = "";
		
		System.out.println("Enter your name");
		name = reader.nextLine();
		
		System.out.println("Enter your name");
		age = reader.nextLine();
		
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
	}
}
