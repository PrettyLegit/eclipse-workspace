import java.util.*;
public class ParallelComputing {
	public static void main(String [] args) {
		Random rand = new Random();
		int [] myArray = new int [10000];
		int [] myArray2 = new int [10000];
		
		for(int i =0; i < myArray.length; i++) {
			myArray[i] = rand.nextInt(100000000);
		}
		
		for(int i =0; i < myArray2.length; i++) {
			myArray2[i] = myArray[i];
		}
		
		final long startTime = System.nanoTime();
		int x = myArray.length;
        for (int i = 0; i < x-1; i++) 
            for (int j = 0; j < x-i-1; j++) 
                if (myArray[j] > myArray[j+1]) 
                { 
                    int temp = myArray[j]; 
                    myArray[j] = myArray[j+1]; 
                    myArray[j+1] = temp; 
                } 
        final long endTime = System.nanoTime();
        long time1 = endTime - startTime;
        System.out.println("The time to sort myArray linearly is: "+ time1 + " nanoseconds.");
		
        System.out.println("Starting parallel sorting...");
        
        final long startTime1 = System.nanoTime();
        Arrays.sort(myArray2);
        final long endTime1 = System.nanoTime();
        
        long time2 = endTime1 - startTime1;
        
        System.out.println("The time to sort myArray2 in a parallel manner is: "+ time2 + " nanoseconds");
        
	}
	
}
