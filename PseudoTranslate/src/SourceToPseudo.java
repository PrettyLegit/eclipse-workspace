//project is postponded until further knowledge is acquired
import java.util.Scanner;
public class SourceToPseudo {

	
	//thinking about making multiple methods to handle different types of modules
	public static void pseudoSyntax(char letter) {
		
	}
	
	
	
	
	
	public static String intoPseudo(String source) {
		String result = "";
		
		int length = source.length();
		int positionCounter = 0;
		
		for (int count = 1; count <= length; count++) {
			
			//letter at position specified
			char letter = source.charAt(positionCounter);
			pseudoSyntax(letter);
			positionCounter++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String source = "";
		
		System.out.print("Enter your source code to be translated");
		source = reader.nextLine();
		
		String result = intoPseudo(source);
		
		
		
	}
	
	
	
	
	
}
