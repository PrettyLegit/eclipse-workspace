import java.util.Random;
//assuming a chirp is either on or off, there is no half a chirp or 1/20 of a chirp 
public class Cricket extends Environment{

	int chirpFrequency = 0;
	Random rand = new Random();

	Cricket() {
		chirpFrequency = rand.nextInt(100 + 1);
	}

	Cricket(int userBypass) {
		chirpFrequency = userBypass;
	}

	public void changeFrequency() {
		chirpFrequency = rand.nextInt(100+1);
	}
	
	public int getFrequency() {
		return chirpFrequency;
	}
}
