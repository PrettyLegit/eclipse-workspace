//this subclass inherits Person
public class Student extends Person {
	final String classStatus;

	Student(String name, String address, String phoneNumber, String emailAddress, String classStatus) {
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}

	@Override
	public String toString() {
		return super.toString() + "\nClass Status: " + classStatus;
	}
}
