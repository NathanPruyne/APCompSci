
public interface Flier {

	//final constants in a class:
	//public static final double ACCEL_OF_GRAVITY = 9.8;
	
	//in an interface:
	double ACCEL_OF_GRAVITY = 9.8; //Just need type, name, what it equals
	
	//methods:
	String fly(double distance); //defining a method with parameters
	
	String takeOff();
	
	String land();
	
	double getAltitude();
	
	double getTotalDistance();
	
}
