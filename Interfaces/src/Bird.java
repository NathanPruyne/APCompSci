
public class Bird implements Flier, Comparable<Flier> {
	
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

	//returns positive if this totalDistance > other's totalDistance
	//returns negative if this totalDistance < other's totalDistance
	//returns 0 if same
	public int compareTo(Flier other) {
		return (int) (this.getTotalDistance() - other.getTotalDistance());
		/*
		 * if (this.getTotalDistance() > otherFlier.getTotalDistance())
		 *     return 1;
		 * else if (this.getTotalDistance() < otherFlier.getTotalDistance())
		 *     return -1;
		 * else
		 *     return 0;
		 */
	}

}
