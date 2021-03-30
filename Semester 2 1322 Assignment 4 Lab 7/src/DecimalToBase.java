
public class DecimalToBase {

	public static String base8Value = "";
	public static String base16Value = "";
	public static String base20Value = "";
	public static String binaryValue = "";

	public static int tempValue = 0;

	// base 8
	public static String toBase8(int userInput) {

		if (userInput == 0) {
			return base8Value;
		} else {
			tempValue = userInput % 8;

			base8Value = tempValue + "" + base8Value;

			userInput = userInput / 8;

			return toBase8(userInput);
		}
	}

	// base 16 is hexadecimal
	public static String toBase16(int userInput) {

		if (userInput == 0) {
			return base16Value;
		} else {
			tempValue = userInput % 16;

			switch (tempValue) {
			case 15:
				base16Value = "F" + "" + base16Value;
				break;
			case 14:
				base16Value = "E" + "" + base16Value;
				break;
			case 13:
				base16Value = "D" + "" + base16Value;
				break;
			case 12:
				base16Value = "C" + "" + base16Value;
				break;
			case 11:
				base16Value = "B" + "" + base16Value;
				break;
			case 10:
				base16Value = "A" + "" + base16Value;
				break;
			default:
				base16Value = tempValue + "" + base16Value;
			}

			userInput = userInput / 16;

			return toBase16(userInput);
		}
	}

	public static String toBase20(int userInput) {

		if (userInput == 0) {
			return base20Value;
		} else {
			tempValue = userInput % 20;

			switch (tempValue) {
			case 19:
				base20Value = "J" + "" + base20Value;
				break;
			case 18:
				base20Value = "I" + "" + base20Value;
				break;
			case 17:
				base20Value = "H" + "" + base20Value;
				break;
			case 16:
				base20Value = "G" + "" + base20Value;
				break;
			case 15:
				base20Value = "F" + "" + base20Value;
				break;
			case 14:
				base20Value = "E" + "" + base20Value;
				break;
			case 13:
				base20Value = "D" + "" + base20Value;
				break;
			case 12:
				base20Value = "C" + "" + base20Value;
				break;
			case 11:
				base20Value = "B" + "" + base20Value;
				break;
			case 10:
				base20Value = "A" + "" + base20Value;
				break;
			default:
				base20Value = tempValue + "" + base20Value;
			}

			userInput = userInput / 20;

			return toBase20(userInput);
		}
	}

	// binary is base 2
	public static String toBinary(int userInput) {

		if (userInput == 0) {
			return binaryValue;
		} else {
			tempValue = userInput % 2;

			// System.out.println(tempValue);

			binaryValue = tempValue + "" + binaryValue;

			// System.out.println(binaryValue);

			userInput = userInput / 2;

			// System.out.println(userInput);

			return toBinary(userInput);
		}
	}

	public static void main(String[] args) {

		int sampleInput1 = 753;
		int sampleInput2 = 9098;
		int sampleInput3 = 692;

		System.out.println(sampleInput1 + " in decimal is " + toBase8(sampleInput1) + " in base 8\n");

		System.out.println(sampleInput1 + " in decimal is " + toBase16(sampleInput1) + " in base 16\n");

		System.out.println(sampleInput2 + " in decimal is " + toBase20(sampleInput2) + " in base 20\n");

		System.out.println(sampleInput3 + " in decimal is " + toBinary(sampleInput3) + " in base 2\n");

	}
}
