//Jimmy Nguyen
//!322 L

public class Question {
	int[] array;
	int[] temp = new int [10];
	int pointer = 0;
	
//	ArrayList(){
//		array = new int[0];
//	}
//	
//	ArrayList(int size) {
//		 array = new int[size];
//	}
	
//	public int[] addElement(int size, int numberInput) {
//		
//		
//		return array;
//		
//	}
	
	public int[] removeElement(int[] array, int removeIndex) {
		int[] temp = new int[array.length - 1];
		
		for(int i = 0, k = 0; i < array.length; i++) {
			
			if(i == removeIndex) {
				continue;
			}
			
			temp[k++] = array[i];
		}
		
		return array;
	}
	
	public static void sum(Object object1) {
		
	}
	
	@Override
	public String toString() {
		 for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
		 return "\0";
	}
}
