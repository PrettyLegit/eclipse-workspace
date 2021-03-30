import java.util.Scanner;

public class Main {

	public static void convertToTwelve(String time) throws TimeException {

		String extract = "";
		String amPm = "";
		int count = 0;
		int length = time.length();
		int hours = 0;
		int minutes = 0;

		while (count < length) {

			if (time.substring(count, count + 1).contentEquals(":")) {
				hours = Integer.parseInt(extract);
				break;
			}
			extract += time.substring(count, count + 1);
			count++;

		}

		extract = "";

		while (count < length) {

			if (time.substring(count, count + 1).contentEquals(":")) {
				count++;
			}
			extract += time.substring(count, count + 1);
			count++;
		}

		minutes = Integer.parseInt(extract);

		// checks if they follow format
		if (hours > 23 || hours < 0) {
			throw new TimeException("Hours are incorrect format");
		}
		if (minutes > 59 || minutes < 0) {
			throw new TimeException("Minutes are incorrect format");
		}

		// changing hours to match 12-hour format
		if (hours >= 12) {
			if (hours > 12) {
				hours = hours - 12;
			}
			amPm = " PM";
		}

		if (hours < 12) {
			if (hours == 0) {
				hours = 12;
			}
			amPm = " AM";
		}

		// printing
		if (minutes < 10) {
			System.out.println("Same time in 12-hour format: " + hours + ":0" + minutes + amPm);
		} else {
			System.out.println("Same time in 12-hour format: " + hours + ":" + minutes + amPm);
		}

	}

	public static void askForTime() {
		Scanner reader = new Scanner(System.in);

		String time = "";
		
		System.out.println("Enter a 24-hour format time including the colon.");
		time = reader.nextLine();

		try {

			convertToTwelve(time);

		} catch (TimeException a) {
			System.out.println("A time format exception was thrown, try again");
			a.printStackTrace();
			askForTime();

		} catch (NumberFormatException b) {
			System.out.println("A number format exception was thrown, try again");
			b.printStackTrace();
			askForTime();

		} catch (Exception c) {
			System.out.println("");
			c.printStackTrace();
			askForTime();
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String userInput = "n";
		
		do {

			askForTime();

			System.out.println("Are you done? y/n");
			userInput = reader.nextLine();

		} while (userInput.contentEquals("n"));

	}
}

/*
 * I'm glad i figured out how to do this lab but i am really disappointed in
 * myself for not being able to solve the assignment 5
 */
