
public class Task implements Priority{

	String task = "";
	int priorityLevel = 0;
	
	Task(){
		
	}
	
Task(String task){
		this.task = task;
		
		
	}
	@Override
	public void setPriority(int n) {
		this.priorityLevel = n;
	}

	@Override
	public int getPriority() {
		
		return priorityLevel;
	}

	public String toString() {
		return task;
	}
}
