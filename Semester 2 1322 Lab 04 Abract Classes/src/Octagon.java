
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

	public Octagon() {
		//super();
		this.sideLength = 8;
		this.area = 2 * (1+ Math.sqrt(2)) * Math.pow(sideLength, 2);
	}
	
	public Octagon Clone() {
		return new Octagon();
	}

	@Override
	public int compareTo(Octagon o) {
	
		if(o.sideLength == sideLength) {
			return 0;
		}
		if(o.sideLength > sideLength) {
			return -1;
		}
		if(o.sideLength < sideLength) {
			return 1;
		}

		return 2;
	}
	
	
}
