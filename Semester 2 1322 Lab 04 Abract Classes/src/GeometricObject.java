/*class notes why do we have a default private method */

 public abstract class GeometricObject {
	protected double sideLength = 0;
	protected double area = 0;

	
	@Override
	public String toString() {
		
		return "side length is: " + sideLength + " and area is: " + (Math.round(area * 100.00) / 100.00);
	}




	


	




	
}
