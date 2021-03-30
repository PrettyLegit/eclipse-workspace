
public class MainLab12 {

	public static void main(String[] args) {
		
		// creating all objects
		FireType f0 = new FireType();
		GrassType g0 = new GrassType();
		WaterType w0 = new WaterType();
		
		//setting all the specs
		f0.setType("Fire");
		f0.setName("Chimchar");
		
		g0.setType("Grass");
		g0.setName("Turtwig");
		
		w0.setType("Water");
		w0.setName("Piplup");
		
		//printing pokemon
		System.out.println(f0.toString());
		System.out.println(g0.toString());
		System.out.println(w0.toString());
		
		
	}
}
