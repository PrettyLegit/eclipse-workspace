import java.util.Random;
public class ClemsonCricket extends Cricket{
	
	
	int clemsonFrequency = 0;
	ClemsonCricket() {
		super();
		//inheriting the randomly generated chirp and multiplying (1/5)
		
		clemsonFrequency = chirpFrequency * (1/5);
	}
	
	@Override
	public void changeFrequency() {
		clemsonFrequency = rand.nextInt(100+1) * (1/5);
	}
	
}
