
public class ClassTesters {

	public static void main(String[] args) {
		
		//Make a JavaCircle of radius 7, center (0,3), color orange
		//datatype (class name) variable name = new constructor call
		JavaCircle spookyCircle = new JavaCircle(7, 0, 3, "Orange");
		JavaCircle nathanCircle = new JavaCircle(Long.MAX_VALUE, Math.E, Math.PI, "Blue");
		
		//print out y coordinate of spookyCircle
		System.out.println(spookyCircle.getYCenter());
		
		//change y coordinate of spookyCircle to -5
		spookyCircle.setYCenter(-5);
		System.out.println(spookyCircle.getYCenter());
		
		//set the radius of spookyCircle to random integer between 1 and 10
		spookyCircle.setRadius((int)(Math.random() * 10) + 1);
		System.out.println(spookyCircle.getRadius());
		
	}
	
}