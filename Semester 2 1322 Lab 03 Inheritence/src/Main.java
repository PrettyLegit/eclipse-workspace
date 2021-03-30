
public class Main {
	public static void main(String[] args) {

		
		//creates objects
		Person p1 = new Person("Rey Skywalker", "4123 Moisture Farm, Outer Rim, Tatooine", "444-444-4444",
				"ReyOfHope@students.kennesaw.edu");

		Student s1 = new Student("Ben Solo", "78 Jedi Temple, Outer Rim", "444-444-5673", "BSolo@students.kennesaw.edu",
				"Freshman");

		Employee e1 = new Employee("Han Solo", "Captain’s Quarters, Millennium Falcon", "456-123-7892",
				"HSolo@students.kennesaw.edu", "Cockpit of Millennium Falcon Pilot’s Chair", "10000000", "1975", "12",
				"5");

		Faculty f1 = new Faculty("Luke Skywalker", "789 Hermit’s Retreat, Ahch-To", "456-123-7891",
				"LSkywalk@students.kennesaw.edu", "Penthouse room in Temple", "5000000", "1975", "12", "5", "5 hours",
				"Senior");

		Staff staff1 = new Staff("Leia Organa-Solo", "789 Resistance base, Outer Rim, D’Qar", "456-123-7890",
				"LOrgana@students.kennesaw.edu", "Resistance Camp", "5500000", "1975", "12", "5", "General");

		
		//Prints the objects
		
		//System.out.println("In a galaxy far far away...\n\n");
		System.out.println("Person: " + p1 + "\n\n");
		System.out.println("Student: " + s1 + "\n\n");
		System.out.println("Employee: " + e1 + "\n\n");
		System.out.println("Faculty: " + f1 + "\n\n");
		System.out.println("Staff: " + staff1 + "\n\n");

	}

}
