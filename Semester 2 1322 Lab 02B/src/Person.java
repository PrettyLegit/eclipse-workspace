// jimmy nguyen 
public class Person {
	// attributes
	String first = "";
	String last = "";

	// constructor
	Person() {

		first = "Bob";
		last = "Smith";

	}
	
	Person(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	// methods
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String inputFirstName) {
		this.first = inputFirstName;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setLast(String inputLastName) {
		this.last = inputLastName;
	}
	
	@Override
	public String toString() {
		return "First name is " + this.first + " Last name is " + this.last;
	}
}
