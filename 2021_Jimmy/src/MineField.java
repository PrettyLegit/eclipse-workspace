import java.util.Random;

public class MineField {

	public static void main(String[] args) {
		Random rand = new Random();
		
		String[] mineField = new String[9];
		
		
		int randomValue; //random mine location
		int randomMineSize  = rand.nextInt(3); //Randomly generate 0-2 mines
		
		//fill the array with blanks
		for(int i = 0; i < mineField.length; i++) {
			mineField[i] = " ";
		}
		
		//fill the array with the mines
		for(int i = 0; i < randomMineSize; i++) {
			randomValue = rand.nextInt(9);
			mineField[randomValue] = "X";
		}
		
		printWorld(mineField);//Showing initial environment before the ai agent
		//locate all the mines through the use of a single agent
		FindMines(mineField, randomMineSize);
	}
	
	//this function will simulate the agent randomly guessing where the mines are located
	public static void FindMines(String[] mineField, int knownMines) {
		Random rand = new Random();
		
		int found = 0;//counter for how many mines it has found. 
		int probe = 0;//Randomly generate a number within the domain of the mineField to be used by the ai agent
		int probe_counter = 0; //We keep track of the number of steps we have taken
		
		while(found < knownMines) {
			probe_counter++;
			probe = rand.nextInt(9);
			
			if(mineField[probe] == "X") {
				mineField[probe] = "M"; // mark the location with a M if there was a mine
				System.out.println("\nI located a mine at location " + probe);
				System.out.println("\nI have now marked it with the letter M.");
				found++;
				
			}
			
			else {
				if(mineField[probe] != "M") {
					mineField[probe] = "O";//O shows that it it search that location
					System.out.println("\nNo mines found. I will keep looking.\n");
				}
			}
			
			printWorld(mineField);
			
		}
		
		System.out.println("\n\n\n-----RESULTS ARE IN-----");
		System.out.println("It took " + probe_counter + " tries to find " +  knownMines + " mine(s) on the field.");
		System.out.println("The Final Booard is: ");
		printWorld(mineField);
	
		
	}
	
	public static void printWorld(String[] mineField) {
		System.out.println();
		for(int i = 0; i < mineField.length; i++) {
			System.out.print("|" +mineField[i]+ "|");
			if(i == 2 || i== 5 || i ==8) {
				System.out.println();
			}
		}
	}
}
