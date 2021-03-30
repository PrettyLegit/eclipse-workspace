
//Developed by: Jimmy Nguyen
//02.01.2020
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		// pertains to vacation class
		double budget = 0.0;
		String destination = "";

		// pertains to AllInclusiveVacation class
		String brand = "";
		double rating = 0;
		double price = 0;

		// pertains to PiecemealVacation class
		String[] items = new String[3];
		double[] costs = new double[3];

		// allows the main to organize and function
		boolean judgement = true; // is this person really done putting things in?
		String userAnswer = "No"; // defaults to no
		int count = 0; // lets us know what index we are in, and also to stop the do-while loop

		do {
			System.out.println("Please enter All-Inclusive Vacation's budget: ");
			budget = Double.parseDouble(reader.nextLine()); // doing this will fix the cursor from storing "\n" for
															// destination
		} while (validatePositive(budget));

		System.out.println("Please enter All-Inclusive Vacation’s destination: ");
		destination = reader.nextLine();

		System.out.println("Please enter All-Inclusive Vacation's brand: ");
		brand = reader.nextLine();

		do {
			System.out.println("Please enter All-Inclusive Vacation's rating: ");
			rating = reader.nextDouble();

		} while (validateRating(rating));

		System.out.println("Please enter All-Inclusive Vacation's price: ");
		price = reader.nextDouble();

		// here we made object a1
		AllInclusiveVacation a1 = new AllInclusiveVacation(budget, destination, brand, rating, price);
		
		System.out.println(a1);
		a1.Budget(price);
		reader.nextLine();

		do {
			System.out.println("\nPlease enter PiecemealVacation Vacation's budget: ");
			budget = Double.parseDouble(reader.nextLine()); // doing this will fix the cursor from storing "\n" for
															// destination
		} while (validatePositive(budget));

		System.out.println("Please enter PiecemealVacation Vacation's destination: ");
		destination = reader.nextLine();

		do {

			if (userAnswer.equals("No")) {

				System.out.println("Please enter PiecemealVacation's items: ");
				items[count] = reader.nextLine();

				System.out.println("Please enter " + items[count] + " cost: ");
				costs[count] = Double.parseDouble(reader.nextLine());

				if (count != 3) {
					System.out.println("Have you finished entering all items?");
					userAnswer = reader.nextLine();
					count++;
				}

				if (userAnswer.equals("Yes")) {
					judgement = false;
				}

				if (count == 3) {
					System.out.println("The max items is 3");
					judgement = false;
				}

			}

		} while (judgement);// while true/on

		// here we will make object p1

		PiecemealVacation p1 = new PiecemealVacation(budget, destination, items, costs);

		System.out.println(p1);
		p1.Budget(costs);

	}

	public static boolean validateRating(double userInput) {
		System.out.println("Processing...");
		if (userInput >= 0 && userInput <= 5) {
			System.out.println("Succuess!");
			return false;
		}
		System.out.println("Sorry. Please check that the input is between 0 and 5");
		return true;
	}

	public static boolean validatePositive(double userInput) {
		System.out.println("Processing...");
		if (userInput >= 0) {
			System.out.println("Succuess!");
			return false;
		}
		System.out.println("Sorry. Please check that the input is not below zero");
		return true;
	}
}

/*
 * Summary/Reference:
 * 
 * in line 72 in regards to the costs. We will not validate that user input
 * because we are considering the chance for them to have a coupon that might
 * lower the costs, so it does not need validation
 * 
 * we are aware that there exists two Budget methods but they work because they
 * have different parameters
 * 
 */

/*
 * Questions to ask the teacher:
 * 
 * in line 53 i had to "reset the scanner" (this is what i think
 * reader.nextLine() does). When I comment this out, and run it, I get a Number
 * Format Exception (when you try to parse a non-numeric String to Number) . But
 * without it and not parsing then the scanner "skips"/stores a \n character in
 * the place of destination.
 * 
 * in line 31 this works without "reseting the scanner" the cursor needs to stop
 * playing these games and playing with my feelings lol. could it be that the cursor
 * location at the time of creation is "ready to go"
 * 
 */
