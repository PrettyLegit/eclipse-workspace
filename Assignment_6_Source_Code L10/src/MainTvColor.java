
/* 
Class: CSE 1321L 
Section: 	Assignemnt 6 Source Code       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		N/A
 */
import java.util.Scanner;

public class MainTvColor {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int input = 0;

		TvColor color1 = new TvColor(254, 2, 100);

		while (input != 8) {
			color1.luminance();

			System.out.println(color1.toString());

			System.out.println("Do you want to:\n" + "1) Increase Red, 2) Decrease Red\r\n"
					+ "3) Increase Green, 4) Decrease Green\r\n" + "5) Increase Blue, 6) Decrease Blue\r\n"
					+ "7) Print the inverse\r\n" + "or 8) Quit\r\n");

			input = reader.nextInt();

			color1.setUpRed(input);
			color1.setDownRed(input);

			color1.setUpGreen(input);
			color1.setDownGreen(input);

			color1.setUpBlue(input);
			color1.setDownBlue(input);

			if (input == 7) {
				int redInverse = color1.inverseRed();
				int greenInverse = color1.inverseGreen();
				int blueInverse = color1.inverseBlue();

				System.out.println("Inverse is R:" + redInverse + " G:" + greenInverse + " B:" + blueInverse);
			}
		}

	}
}
