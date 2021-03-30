// jimmy nguyen 

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String inputFirstName;
		String inputLastName;
		
		System.out.println("Enter in first name");
		inputFirstName = scan.nextLine();
		
		System.out.println("Enter in last name");
		inputLastName = scan.nextLine();
		
		Person p0 = new Person();
		
		System.out.println(p0.toString());
		
		Person p1 = new Person(inputFirstName, inputLastName);
		
		System.out.println(p1.toString());
		
		p0.setFirst("Aly");
		
		p1.setLast("Sanchez");
		
		System.out.println(p0.toString());
		System.out.println(p1.toString());
	}

}
