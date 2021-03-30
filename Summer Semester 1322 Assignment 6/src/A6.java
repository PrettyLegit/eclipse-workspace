//Jimmy Nguyen
//1322 Summer
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class A6 {

	static int count = 0;
	static File file1;
	static File file2;

	public static boolean checkFile(String fileName) {

		boolean isTrue = false;

		File temp = new File(fileName);

		isTrue = temp.exists();

		if (isTrue) {
			System.out.println("<<<File found");

			// doing this will keep track of the starting file and the new file we enter. i
			// was going to return the files back to main and pass them into the makeFile
			// method but that would require a get method and seemed more complicated
			if (count == 0) {
				file1 = temp;
				count++;
			} else if (count == 1) {

				// System.out.println("This here works");
				file2 = temp;
				count = 0;// reseting it back to 0 so that when we run the program again it will not break
			}

			return true;
		} else
			System.out.println("<<<File does not exist");
		return false;
	}

	public static void makeFile(int userInput, String newName) {

//		int userInput = 0;
//		String newName = "";

//		if (checkFile(fileName)) {
//			System.out.println("A file already exist with that name");
//
//			while (userInput == 0 || userInput == 1) {
//				System.out.println("Would you like to overwrite (0) or enter a different name (1)? (0 or 1)");
//
//				userInput = scan.nextInt();
//				System.out.println(userInput);
//				if (userInput == 0 || userInput == 1) {
//					break;
//				}
//			}
//
//		}

		switch (userInput) {
		case 0:
			try {
				overwriteFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}
			break;
		case 1:
			System.out.println("<<<Enter a new file name");
			File newFile = new File(newName);
			System.out.println("New file was made named: " + newName);
			System.out.println(newFile.getAbsolutePath());
			break;
		default:
			File sysGeneratedFile = new File(newName);
			System.out.println("<<<New file was made named: " + newName);
			System.out.println(sysGeneratedFile.getAbsolutePath());
		}
	}

	//this part was made possible by GEEKS FOR GEEKS TUTORIAL
	public static void overwriteFile() throws FileNotFoundException, IOException {

		try {

			/*
			 * If file doesnot exist FileInputStream throws FileNotFoundException and read()
			 * write() throws IOException if I/O error occurs
			 */
			FileInputStream fis = new FileInputStream(file1);

			/*
			 * assuming that the file exists and need not to be checked
			 */
			FileOutputStream fos = new FileOutputStream(file2);

			int b;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}

			/*
			 * read() will readonly next int so we used while loop here in order to read
			 * upto end of file and keep writing the read int into dest file
			 */
			fis.close();
			fos.close();

			System.out.print("The file: ");
			System.out.println(file1.getAbsolutePath());
			System.out.print("has been successfully copied to: ");
			System.out.println(file2.getAbsolutePath());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}

	public static void main(String[] args) {

		try {
			System.setIn(new FileInputStream("Sample output 1"));
			//System.setIn(new FileInputStream("Sample output 2"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scan = new Scanner(System.in);
		/*
		 * D:\Jimmy\eclipse-workspace\Summer Semester 1322 Assignment 6\a.txt
		 * D:\Jimmy\eclipse-workspace\Summer Semester 1322 Assignment 6\b.txt
		 */

		String fileLocation = "";

		System.out.println("<<<Please enter a text file location and file name");
		fileLocation = scan.nextLine();
		System.out.println(fileLocation);

		while (!checkFile(fileLocation)) {
			System.out.println("<<<Please enter a text file location and file name");
			fileLocation = scan.nextLine();
			System.out.println(fileLocation);
		}

		System.out.println("<<<Enter new file name and location");
		fileLocation = scan.nextLine();
		System.out.println(fileLocation);

		int userInput = -1;
		String newName = "";

		if (checkFile(fileLocation)) {
			System.out.println("<<<A file already exist with that name");

			while (userInput != 0 || userInput != 1) {

				System.out.println("<<<Would you like to overwrite (0) or enter a different name (1)? (0 or 1)");
				userInput = scan.nextInt();
				System.out.println(userInput);

				if (userInput == 0 || userInput == 1) {
					break;
				}
			}
		}

		if (userInput == -1) {
			newName = scan.nextLine();
			System.out.println(newName);
		} else {
			newName = scan.nextLine();
			System.out.println(newName);
		}
			

		makeFile(userInput, newName);
	}

}
