
import java.io.*;
import java.util.*;
public class FileIO {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	char ans = 'y';
	String input;
	while(ans == 'y') {
		
	System.out.println("Please enter a text file name and location: ");
	input = scan.nextLine();
	
	FileWriter fr = null;
	try {
		//fr = new FileWriter(input);
		BufferedReader br = new BufferedReader(new FileReader(input));
		br.close();
	} catch (IOException e) {
		System.out.println("Error: "+ e);
		//e.printStackTrace();
		System.exit(1);
	}
	/*try {
		fr = new FileWriter(input);
	}catch(IOException e) {
		int response;
		if(input == )
		System.out.println("This file already exists. Want to try again or replce it? 0/1");
	}*/
	   
	  // PrintWriter pr = new PrintWriter(fr);
	   
	   try {
		   BufferedWriter bw = new BufferedWriter(new FileWriter(input));
		   bw.close();
		//fr.close();
	} catch (IOException e) {
		System.out.println("Error: + e");
		//e.printStackTrace();
		continue;
	}
	   System.out.println("would you like to try again? y/n");
		ans = scan.next().charAt(0);
		if(ans == 'n') {
			System.out.println("Program is finished");
		}
	   /*try {
			if (input == ) {
				
				throw new Exception("This file already exists.");
				
			}
		}
			catch (IOException e) {
				continue;
			}*/
}
}
}
