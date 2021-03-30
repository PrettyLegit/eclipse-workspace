import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
Scanner scan = new Scanner(System.in);
		//Reading the file and spliting it into 2 lists.
		//D:\Jimmy\eclipse-workspace\Summer Semester 1322 Lab 14\html2.txt
		String userInput = "";
		userInput = scan.nextLine();
		File file = new File(userInput);
		Scanner s = new Scanner(file);
		ArrayList<String> words = MyFileReader.ScanList(s);
		List[] newList = MyFileReader.split(words);
		
		//Setting up threads to do the replacing.
		
        HelperClass tws1 = new HelperClass(newList[0]);
        HelperClass tws2 = new HelperClass(newList[1]);
		int choice=1;
		Scanner myObj = new Scanner(System.in);
		do
		{
			System.out.println("Choose the function you would like to run:\n1-No Thread Test\n2-Thread Test");
			choice = myObj.nextInt();
			switch (choice) {
				case 1:
					NoThreadTest(newList[0],newList[1]);
					break;
				case 2:
					ThreadTest(tws1, tws2);
					break;
			}
			System.out.println("Enter 0 to exit any other key to continue");
			choice = myObj.nextInt();
			
		}while(choice!=0);

        s.close();
	}
	
	//Removes the html characters without using threads.
    private static void NoThreadTest(List<String> tws1, List<String> tws2) {
    	//start timer
    	long startTime = System.currentTimeMillis();
    	HelperClass.ReplaceHTML(tws1);
    	HelperClass.ReplaceHTML(tws2);
        //stop times
        long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Without Thread Runtime in miliseconds: "+elapsedTime);
    }
    
    //Removes the html characters using threads.
    private static void ThreadTest(HelperClass tws1, HelperClass tws2) {
    	//start timer
    	long startTime = System.currentTimeMillis();
        //Write your code to use threads here
		
    	long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Thread Runtime in miliseconds: "+elapsedTime);
    }

}

