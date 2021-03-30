//this subclass inherits Person class
public class Employee extends Person {
	String office = "";
	String salery = "";
	String year = "";
	String month = "";
	String dayHired = "";

	Employee(String name, String address, String phoneNumber, String emailAddress, String office, String salery,
			String year, String month, String dayHired) {
		super(name, address, phoneNumber, emailAddress);

		this.office = office;
		this.salery = salery;
		this.year = year;
		this.month = month;
		this.dayHired = dayHired;

	}

	@Override
	public String toString() {
		return super.toString() + "\nOffice:" + office + "\nSalery: " + salery + "'\nDate Hired: Year: " + year + " Month: " + month
				+ " Day Hired: " + dayHired;
	}
}
