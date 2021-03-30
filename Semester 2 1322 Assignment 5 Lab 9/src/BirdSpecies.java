
public class BirdSpecies {

	private String birdName = "";
	
	BirdSpecies(String userInput){
		this.birdName = userInput;
	}
	
	@Override
	public String toString() {
		return "Entered bird species: " + birdName;
	}
}
