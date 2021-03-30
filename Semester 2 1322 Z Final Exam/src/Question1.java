import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Question1 {

	public static void makeFile(String fileLocation, int count, int index, ArrayList arrayObject, File fileA) {
		PrintWriter pw = null;

		try {

			FileWriter fw = new FileWriter(fileA, true);

			while (index <= count) {
				fw.write(arrayObject.get(index) + "\n\n");
				pw = new PrintWriter(fw);
				index++;
			}

			System.out.println("The new file was successfully created and written to");

			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(
					"The new file was not able to be saved. Try checking the location and file name for errors");
			// e.printStackTrace();
			makeFile(fileLocation, count, index, arrayObject, fileA);
		}
//		catch(Exception a) {
//			System.out.println("RIP");
//		}
	}
	
	public static void printFile(File fileA) {
		// reading file
		try {

			FileReader fr = new FileReader(fileA);
			BufferedReader br = new BufferedReader(fr);

			String result;
			while ((result = br.readLine()) != null) {
				System.out.println(result + "\n");
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String userInput = "";
		String fileLocation = "";
		String fileName = "";
		int count = -1;
		int index = 0;

		// making arraylist object
		ArrayList<String> arrayObject = new ArrayList<String>();

		while (!(userInput.contentEquals("done"))) {
			System.out.println("Please enter in information. If you are finish, type done");
			userInput = scan.nextLine();

			if (!userInput.contentEquals("done")) {
				arrayObject.add(userInput);
				count++;
			}

		}

		System.out.println("Please enter a new location and file name");
		fileLocation = scan.nextLine();

		File fileA = new File(fileLocation);
		System.out.println(fileA.getAbsoluteFile());
		makeFile(fileLocation, count, index, arrayObject, fileA);
		
		printFile(fileA);
	}
}
