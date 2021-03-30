
public class ArrayList1 {

	int[] internalArray;
	
	public ArrayList1() {
		this.internalArray = new int[10];
	}
	
	public ArrayList1(int size) {
		this.internalArray = new int [size];
	}
	
	public void AddLast(int data) {
		// Case 0: the last spot is empty, add to last spot
		if(this.internalArray[this.internalArray.length-1] == 0) {
		this.internalArray[this.internalArray.length-1]= data;
		return;
		}
		//Case 1: the last spot is taken, but the array is not full 
		//Add to the next to last empty spot
		for(int i = this.internalArray.length -1; i >= 0; i--) {
			if(this.internalArray[i]==0) {
				this.internalArray[i] = data;
				return;
			}
		}
		//Case 2: the entire array is full, increase the size of the array and put the data piece there 
		//created the new array
		int[] temp = new int[this.internalArray.length * 2];
		//added the old data into the new array
		for(int i =0; i < this.internalArray.length; i++) {
			temp[i] = this.internalArray[i];
			
		}
		//added the new data
		temp[temp.length -1] = data;
		
		this.internalArray = temp; //shallow copied the new array so it will be saved
		
	}
	
	public void RemoveLast() {
		//Case 0: something is in the last spot, remove it
		if(this.internalArray[this.internalArray.length-1] != 0) {
			this.internalArray[this.internalArray.length -1]=0;
			return;
		}
		//Case 1: nothing is in the last spot, but the array is not empty
		//Remove the next to last spot
		for(int i = this.internalArray.length-1;i >= 0;i--) {
			if(this.internalArray[i] != 0) {
				this.internalArray[i] = 0;
				return;
			}
		}
		//Case 2: the array is empty, don't resize or remove anything
	}
	public int length() {
		return this.internalArray.length;
	}
	
	public int Get(int index) {
		if(index >= 0 && index < this.internalArray.length) {
		return this.internalArray[index];
		}
		return 0;
	}
}
