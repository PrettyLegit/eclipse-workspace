import java.util.Random;

public class MineField {

	public static void main(String[] args) {
		Random rand = new Random();
		
		String[] mineField = new String[9];
		
		
		int randomValue1 = rand.nextInt(8);
		int randomValue2 = rand.nextInt(8);
		
		for(int i = 0; i < mineField.length; i++) {
			mineField[i] = " ";
		}
		
		mineField[randomValue1] = "X";
		mineField[randomValue2] = "X";
		
		FindMines(mineField, 2);
		
		
	}
	
	//this function will simulate the agent randomly guessing where the mines are located
	public static void FindMines(String[] mineField, int knownMines) {
		Random rand = new Random();
		
		int found = 0;
		int probe = rand.nextInt(8);
		int probe_counter = 0; //We keep track out the number of steps we have taken
		
		while(found < knownMines) {
			probe_counter++;
			probe = rand.nextInt(8);
			if(mineField[probe] == "X") {
				mineField[probe] = "M";
				System.out.println("\nI located a mine at location " + probe);
				found++;
				
			}
			
			else {
				mineField[probe] = "O";
			}
			
			printWorld(mineField);
			System.out.println("\nI have now marked it with the letter M.");
		}
		
		System.out.println("\n\n\n-----RESULTS ARE IN-----");
		System.out.println("It took " + probe_counter + " tries to find " +  knownMines + " mines on the field.");
		System.out.println("The Final Booard is: ");
		printWorld(mineField);
	
		
	}
	
	public static void printWorld(String[] mineField) {
		System.out.println();
		for(int i = 0; i < mineField.length; i++) {
			System.out.print("|" +mineField[i]+ "|");
			if(i == 2 || i== 5) {
				System.out.println();
			}
		}
	}
}
