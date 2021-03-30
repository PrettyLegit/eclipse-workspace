//jimmy nguyen

import java.util.Scanner;

public class SearchingArray {

	public static int LongestPositiveSeries(int[][] tempArray) {
		int positiveSeries = 0;
		int longest = 0;

		for (int row = 0; row < tempArray.length; row++) {
			for (int column = 0; column < tempArray[row].length; column++) {
				
				if (tempArray[row][column] > 0) {
					positiveSeries++;
					
				} else {
					if (longest < positiveSeries) {
						longest = positiveSeries;
						positiveSeries = 0;
					}
				}
			}
		}
		//System.out.println("this is +" + positiveSeries);
		//System.out.println("this is long" + longest);
		if (longest > positiveSeries) {
			return longest;
		} else {
			return positiveSeries;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int countData;
		int[][] data = new int[5][5];

		System.out.println("Enter in values to data array");

		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data.length; column++) {
				data[row][column] = scan.nextInt();
			}
		}

		countData = LongestPositiveSeries(data);

		System.out.println("The longest streak is " + countData);

		for (int row = 0; row < data.length; row++) {
			for (int column = 0; column < data.length; column++) {
				System.out.print(data[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
