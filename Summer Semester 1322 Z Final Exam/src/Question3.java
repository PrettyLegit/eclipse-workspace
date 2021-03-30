import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Question3 {

	public static void printFile(File myFile) {
		// reading file
		try {

			FileReader fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);

			char letter = ' ';
			boolean isTrue = false;
			
			String result;
			while ((result = br.readLine()) != null) {
				
				letter = result.charAt(0);
				isTrue = Character.isUpperCase(letter);
				
				System.out.println(result + "\n");
				
				if(isTrue == false) {
					String temp = "";
					
					temp = result.substring(0,1).toUpperCase() + result.substring(1);
					
					System.out.println(temp);
				}
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		//D:\\Jimmy\\eclipse-workspace\\Summer Semester 1322 Z Final Exam\collectionOfWords.txt
		String fileLocation = "D:\\\\Jimmy\\\\eclipse-workspace\\\\Summer Semester 1322 Z Final Exam\\collectionOfWords.txt";
		
//		System.out.println("Type the file address");
//		fileLocation = scan.nextLine();
		
		File myFile = new File(fileLocation);
	
		printFile(myFile);
		
		
		
		
		

		

		
	}

}
