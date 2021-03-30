/* 
Class: CSE 1321L 
Section: 	Module 6       
Term:		Fall 2019  
Instructor:	Dexter Howard
Name:		Jimmy Nguyen    
Lab#:		11
 */
public class Radio {

	private int station = 1;
	private int volume = 1;
	private boolean on = false;

	Radio() {

		this.station = 1;
		this.volume = 1;
		this.on = true;

	}

	public int getStation() {

		return station;
	}

	public int getVolume() {

		return volume;
	}

	public void turnOn() {

		this.on = true;
	}

	public void turnOff() {

		this.on = false;
	}

	public void stationUp() {
		if (station <= 10 && on) {
			this.station++;
		}

	}

	public void stationDown() {
		if (station >= 1 && on) {
			this.station--;
		}
	}

	public void volumeUp() {
		if (volume <= 10 && on) {
			this.volume++;
		}
	}

	public void volumeDown() {
		if (volume >= 1 && on) {
			this.volume--;
		}
	}

	public String toString() {
		if (!on) {
			return "\tRadio is off.";
		} else
			return "\tThe radio station is " + this.station + " and the volume is " + this.volume;
	}
}
