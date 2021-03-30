
public class Environment {
	int temperature = 0;

	Environment() {
		temperature = 69;
	}

	Environment(int chirpFrequency) {
		temperature = find_Temperature(chirpFrequency);
	}

	public int find_Temperature(int chirpFrequency) {
		return temperature = (chirpFrequency + 40) / 4;
		
	}
	
	public int getTemp() {
		return temperature;
	}
}
