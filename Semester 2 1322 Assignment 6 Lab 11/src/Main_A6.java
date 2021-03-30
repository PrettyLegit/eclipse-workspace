import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_A6 {

	public static void checkFile(String fileInput) {
		File file = new File(fileInput);
		try {
			Scanner scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String fileInput = "";
		
		System.out.println("Please enter file address.");
		fileInput = scan.nextLine();
		
		checkFile(fileInput);
			
	}
}
