//Jimmy Nguyen
//1322L 
public class Palindrome {
	boolean isPalindrome;
	String judgement = "";

	Palindrome() {
		isPalindrome = true;
	}

	public String reverse(String reverseInput, String userInput, int length) {

		if (length == -1) {
			return reverseInput;
		} else {

			reverseInput += userInput.charAt(length);
			// System.out.println(length);
			return reverse(reverseInput, userInput, length - 1);
		}

	}

	public void isPalindrome(String userInput, String reverseString) {

		if (userInput.equals(reverseString)) {
			//isPalindrome = true;
			judgement = "a palindrome.";
		} else {
			//isPalindrome = false;
			judgement = "not a palindrome.";
		}

	}

	@Override
	public String toString() {

		return judgement;
	}
}
