
public class WaterType implements Pokemon {
	String type;
	String name;

	int level = 1;

	WaterType() {

	}

	WaterType(int userLevel) {
		level = userLevel;
	}
	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		System.out.println("The generation this pokemon exist in is gen: " + generationPokemon);
		return name + " is a " + type + " pokemon" + " at level " + level;
	}
}
