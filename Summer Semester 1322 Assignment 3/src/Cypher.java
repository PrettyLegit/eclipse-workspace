
public class Cypher {

	String original = "";
	private String encrypted = "";
	String decrypted = "";
	int position = 0;
	int length = 0;

	Cypher() {
		original = "cypher";
		length = original.length();
	}

	Cypher(String dataInput) {

		original = dataInput;
		length = dataInput.length();
	}

	public String cypherMethod() {

		for (position = 0; position < length; position++) {
			if (position % 2 != 0) {
				encrypted += original.substring(position, position + 1);

			}
		}

		// reset the position. decided to use position as the counter variable when
		// doing int i and having the substring be dependent on the value of i does the
		// same thing
		for (position = 0; position < length; position++) {
			if (position % 2 == 0) {
				encrypted += original.substring(position, position + 1);

			}
		}
		return encrypted;

	}

	public String revereseMethod() {

		decrypted = original;
		return decrypted;

	}

	public void setEncrypted(String dataInput) {
		encrypted = dataInput;
	}

	public String getEncrypted() {
		return encrypted;
	}

	public void setDecrypted(String dataInput) {
		decrypted = dataInput;
	}

	public String getDecrypted() {
		return decrypted;
	}

	@Override
	public String toString() {
		return "\n\nEncoded: " + getEncrypted() + "\n\nDecoded: " + getDecrypted();
	}
}
