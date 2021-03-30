
public class MyThread extends Thread {
	String text;
	public int count;

	public MyThread(String textToGoThrough) {
		this.text = textToGoThrough;
	}

	// Each thread needs to go through some string and figure out how many "the"s
	// are in it.
	@Override
	public void run() {
		this.count = 0;
		char[] textAsChars = this.text.toCharArray();

		try {
			this.sleep(5000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		for (int i = 0; i < textAsChars.length - 3; i++) {
			if (textAsChars[i] == 't') {
				if (textAsChars[i + 1] == 'h') {
					if (textAsChars[i + 2] == 'e') {
						this.count++;
					}
				}
			}
		}
	}
}
