// Jimmy Nguyen
import java.util.Random;

public class Array {

	public static int FindLargest(int[] tempArray){
		int LargestValue = 0;
		LargestValue = tempArray[0];
	
		for(int count = 0; count < tempArray.length; count++) {
			
			if(LargestValue < tempArray[count]) {
				LargestValue = tempArray[count];
			}
		}
		
		return LargestValue;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] nums = {1, 4, 13, 43, -25, 17, 22, -37, 29};
		int[] data = new int[20];
		int[] tempArray;
		
		tempArray = nums.clone();
		int numsMax = FindLargest(tempArray);
		
		System.out.println("The largest value from the nums array is " + numsMax);
		
		//assigning numbers -100 to 100
		for(int row = 0; row < data.length; row++) {
			data[row] = rand.nextInt(201) -100;
		}
		
		tempArray = data.clone();
		int dataMax = FindLargest(tempArray);
		
		System.out.println("The largest value from the data array is " + dataMax);
		
		System.out.println("The sum of these two maximun values is " + (numsMax + dataMax));
		
		//printing
		System.out.println("\nNums array is ");
		for(int row = 0; row < nums.length; row++) {
			System.out.print(nums[row] + ", ");
		}
		
		System.out.println("\nData array is ");
		for(int row = 0; row < data.length; row++) {
			System.out.print(data[row] + ", ");
		}

		/*
		 * i am leaving this code here so i remember that in order to achieve an interval between -100 to 100 that it needs to be n*2 that number minus n
		 * this code here validates my findings
		 * int test = 0;
		for(int i = 0; i < 100; i++) {
			test = rand.nextInt(201) -100;
			System.out.println(test);
			if(test == -100) {
				break;
			}
		}
		*/
	}
}
