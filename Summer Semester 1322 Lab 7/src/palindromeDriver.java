//Jimmy Nguyen
//1322L 
public class palindromeDriver {

	public static void main(String[] args) {

		String reverseInput = "";
		String userInput = "";
		String reverseString = "";
		int length = 0;

		// example
		Palindrome p1 = new Palindrome();

		userInput = "tacocat";
		length = userInput.length() - 1;
		p1.reverse(reverseInput, userInput, length);

		reverseString = p1.reverse(reverseInput, userInput, length);
		p1.isPalindrome(userInput, reverseString);

		System.out.print("Recieved " + userInput + " ");
		System.out.println("which is " + p1.toString());

		// using another example
		Palindrome p2 = new Palindrome();

		userInput = "haha";
		length = userInput.length() - 1;
		p2.reverse(reverseInput, userInput, length);

		reverseString = p2.reverse(reverseInput, userInput, length);
		p2.isPalindrome(userInput, reverseString);

		System.out.print("Recieved " + userInput + " ");
		System.out.println("which is " + p2.toString());

		//another one
		Palindrome p3 = new Palindrome();

		userInput = "hannah";
		length = userInput.length() - 1;
		p3.reverse(reverseInput, userInput, length);

		reverseString = p3.reverse(reverseInput, userInput, length);
		p3.isPalindrome(userInput, reverseString);

		System.out.print("Recieved " + userInput + " ");
		System.out.println("which is " + p3.toString());
	}
}
