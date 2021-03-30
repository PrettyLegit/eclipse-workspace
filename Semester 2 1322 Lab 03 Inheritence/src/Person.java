
public class Person {
	// static saves memory
	String name = "";
	String address = "";
	String phoneNumber = "";
	String emailAddress = "";

	Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {

		return name + "\nAddress: " + address + "\nPhone number: " + phoneNumber + "\nEmail: " + emailAddress;
	}

}

/*
 * static and complile time are two types of polymorphism. method overriding is
 * another type of poly. child class extends parent class is the format. use
 * super keyword to access things in the parent class
 */