//this subclass inherits Employee
public class Faculty extends Employee {
	String officeHours = "";
	String rank = "";

	Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String salery,
			String year, String month, String dayHired, String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salery, year, month, dayHired);

		this.officeHours = officeHours;
		this.rank = rank;

	}

	public String toString() {
		return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
}
