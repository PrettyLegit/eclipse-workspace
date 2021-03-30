import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String yesNo = "n";
		int numberInput = 0;
		int removeIndex = 0;
		int retrieveIndex = 0;
		// int size = 0;
		// size keep track of the size of the array

		System.out.println("ArrayList Portion:\n\n");

		ArrayList<Integer> object1 = new ArrayList<Integer>();

		do {

			System.out.println("Enter a number. ");
			numberInput = reader.nextInt();
			// size++;

			object1.add(numberInput);

			reader.nextLine();// clears the reader

			System.out.println("Are you done entering numbers? Type y or n");
			yesNo = reader.nextLine();

		} while (yesNo.contentEquals("n"));

		System.out.print("Intial contents of the list: ");
		System.out.println(object1.toString());

		System.out.print("\nContents before adding another item: ");
		System.out.println(object1.toString());

		// adding one item
		System.out.print("Please enter another number to add: ");
		numberInput = reader.nextInt();
		object1.add(numberInput);

		System.out.println("Contents after adding another item:" + object1.toString());

		// removing one item
		System.out.println("\nContents before removing an item:" + object1.toString());

		System.out.print("Please enter the index of the element to remove: ");
		removeIndex = reader.nextInt();
		object1.remove(removeIndex);

		System.out.println("Contents after removing an item: " + object1.toString());

		// retrieving one item
		System.out.println("\nContents before retrieving a value from the list: " + object1.toString());

		System.out.print("Please enter the index of the element to retrieve: ");
		retrieveIndex = reader.nextInt();
		System.out.println("Element at position " + retrieveIndex + ": " + object1.get(retrieveIndex));
		System.out.println("Contents after retrieving an item: " + object1.toString());

		// we are doing linked list now
		yesNo = "n";
		System.out.println("Linked List Portion\n");

		LinkedList list = new LinkedList();

		do {

			System.out.println("Enter a number. ");
			numberInput = reader.nextInt();

			list.insert(list, numberInput);

			reader.nextLine();// clears the reader

			System.out.println("Are you done entering numbers? Type y or n");
			yesNo = reader.nextLine();

		} while (yesNo.contentEquals("n"));

		System.out.print("Intial contents of the list: ");
		System.out.println();
		list.printList(list);

		System.out.print("\nContents before adding another item: ");
		System.out.println();
		list.printList(list);

		// adding one item
		System.out.print("Please enter another number to add: ");
		numberInput = reader.nextInt();
		list.insert(list, numberInput);

		System.out.println("Contents after adding another item:");
		list.printList(list);

		// removing one item
		System.out.println("\nContents before removing an item:");
		list.printList(list);

		System.out.print("Please enter the index of the element to remove: ");
		removeIndex = reader.nextInt();
		// list.delete(list, removeIndex);

		System.out.println("Contents after removing an item: ");
		list.printList(list);

		// summing items

	}

}
/*
 * 
 * 
 * 
 * 
 * 
 * Im not sure where i went wrong
 * 
 * 
 * 
 * 
 * 
 * 
 */
