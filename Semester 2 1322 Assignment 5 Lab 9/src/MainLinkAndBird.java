
import java.util.Scanner;
public class MainLinkAndBird {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String terminateWord = "";
		String userInput = "";
		
		LinkedList myList = new LinkedList();
		BirdSpecies birdie = new BirdSpecies(userInput);
		
		while(!terminateWord.contentEquals("done")) {
			
			System.out.println("Enter a bird species: ");
			userInput = reader.nextLine();
			
			//creates the bird object with userInput
			birdie = new BirdSpecies(userInput);
			
			//adds the bird object as a node in myList
			myList.push(birdie);
			
			//we print the object from BirdSpecies class
			System.out.print(birdie.toString());
			
			//we want to get the position to print
			System.out.println(" at position " + myList.getPosition(myList));
			
			System.out.println("\nOMG hi, are you done entering birds?" );
			terminateWord = reader.nextLine();
		}
		
		//System.out.println(myList.display());
		//ooof
	}
}
