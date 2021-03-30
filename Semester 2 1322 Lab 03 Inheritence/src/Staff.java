//this subclass inherits Employee
public class Staff extends Employee {
	String title = "";

	Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salery,
			String year, String month, String dayHired, String title) {
		super(name, address, phoneNumber, emailAddress, office, salery, year, month, dayHired);

		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
