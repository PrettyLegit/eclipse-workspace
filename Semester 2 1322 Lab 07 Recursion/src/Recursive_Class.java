
public class Recursive_Class {
	
	static int vowels(String input, int count, int index) {
		int length = input.length();

		if ((input.charAt(index) == ('a')) || (input.charAt(index) == 'e') || (input.charAt(index) == ('i'))
				|| (input.charAt(index) == ('o')) || (input.charAt(index) == ('u'))) {
			count++;
		}

		if (index < length-1) {
			return vowels(input, count, index+1);
		}

		return count;
	}

	public static void main(String[] args) {
		String input = "Hello World!";
		int count = 0;
		int index = 0;
		System.out.println("Checking the number of vowels in " + input + " , which is: " + vowels(input, count, index));
	}

}
