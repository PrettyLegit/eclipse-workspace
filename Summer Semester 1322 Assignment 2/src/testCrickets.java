
public class testCrickets {
	public static void main(String[] args) {

		// trail 0 just environment things
		Environment e4 = new Cricket();
		System.out.println("The temperature before is: " + e4.getTemp());
		System.out.println("The temperature after is: " + e4.getTemp());

		// trial 1
		System.out.println();
		Environment e1 = new Environment();
		System.out.println("The temperature before is: " + e1.getTemp());

		Cricket c1 = new Cricket();
		System.out.println("Chirp Frequency in c1 is: " + c1.getFrequency() + " chirps per minute");

		c1.changeFrequency();
		System.out.println("The new Chirp is: " + c1.getFrequency() + " chirps per minute");

		e1.find_Temperature(c1.getFrequency());
		System.out.println("The temperature after is: " + e1.getTemp());

		// trail 2
		System.out.println();

		Environment e2 = new Environment();
		System.out.println("The temperature before is: " + e2.getTemp());

		Cricket clem1 = new ClemsonCricket();
		System.out.println("Chirp Frequency in clem1 is: " + clem1.getFrequency() + " chirps per minute");

		e2.find_Temperature(clem1.getFrequency());
		System.out.println("The temperature after is: " + e2.getTemp());

		// trial 3
		System.out.println();

		Environment e3 = new Environment();
		System.out.println("The temperature before is: " + e3.getTemp());

		ClemsonCricket clem2 = new ClemsonCricket();
		System.out.println("Chirp Frequency in clem2 is: " + clem2.getFrequency() + " chirps per minute");

		e3.find_Temperature(clem2.getFrequency());

		System.out.println("The temperature after is: " + e3.getTemp());

	}
}
