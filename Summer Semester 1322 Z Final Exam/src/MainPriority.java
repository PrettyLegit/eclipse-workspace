import java.util.*;

public class MainPriority {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int userInput1 = 0;
		int userInput2 = 0;
		int highPriorityVal = 0;// keeps track of priority
		int lowPriorityVal = 0;
		int noPriorityVal = 0;

		Task highPriority = new Task("Buy milk");
		Task lowPriority = new Task("Mow lawn");
		Task noPriority = new Task("Take a nap");

		int temp = 0;
		// high
		System.out.println("Enter in a priority level from 1-5 (1 being most important) for milk");
		userInput1 = scan.nextInt();
		highPriority.setPriority(userInput1);
		highPriorityVal = highPriority.getPriority();
		// low
		System.out.println("Enter in a priority level from 1-5 (1 being most important) for mow lawn");
		userInput2 = scan.nextInt();
		
		lowPriority.setPriority(userInput2);
		lowPriorityVal = lowPriority.getPriority();

		
		// print
		System.out.print(highPriority.toString());

		if ((highPriorityVal < lowPriorityVal)) {
			System.out.println(" has been set to a high priority with a value of " + highPriorityVal);
		}

		System.out.print(lowPriority.toString());

		if ((highPriorityVal < lowPriorityVal)) {
			System.out.println(" has been set to a low priority with a value of " + lowPriorityVal);
		}

		System.out.print(noPriority.toString());
		System.out.println(" has no priority");
	}

}
