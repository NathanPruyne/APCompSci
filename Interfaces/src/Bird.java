
public class Bird implements Flier {
	
	private double altitude;
	private double totalDistance;
	private String myFeatherColor;
	
	public Bird(double alt, double dist, String c) {
		altitude = alt;
		totalDistance = dist;
		myFeatherColor = c;
	}
	
	public Bird() {
		altitude = 0;
		totalDistance = 0;
		myFeatherColor = "Red";
	}

	public String fly(double distance) {
		totalDistance += distance;
		return "I'm flying " + distance + "miles, SQUAWK!";	
	}

	public String takeOff() {
		altitude = 50;
		return "I flap my wings, SQUAWK!";
	}

	public String land() {
		altitude = 0;
		return "I landed, SQUAWK!";
	}

	public double getAltitude() {
		return altitude;
	}

	public double getTotalDistance() {
		return totalDistance;
	}
	
	public void setAltitude(double alt) {
		altitude = alt;
	}

}
