
public class Main {
	public static void main(String[] args) {
		Octagon octa1 = new Octagon();
		Octagon octa2 = octa1.Clone();

		int judgement = 0;

		System.out.println("Octagon 1's " + octa1);
		System.out.println("Octagon 2's " + octa2);

		judgement = octa1.compareTo(octa2);

		if (judgement == 0) {
			System.out.println("The 2 geometric objects are the same.");
		}
		if (judgement == -1) {
			System.out.println("The 2 geometric objects are not the same.");
		}
		if (judgement == 1) {
			System.out.println("The 2 geometric objects are the same.");
		}
		if(judgement == 2) {
			System.out.println("Error");
		}
		
		
		
	}
}
