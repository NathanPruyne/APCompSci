
public class ClassTesters {

	public static void main(String[] args) {
		/*
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
		
		
		//create coordinate point object at (2, 3)
		CoordinatePoint c = new CoordinatePoint(2 , 3);
		
		//create another coordinate point at (0,0)
		CoordinatePoint origin = new CoordinatePoint(); //since defaults are (0,0) this works
		
		//create circle, radius 3, centered at c (-3,8), orange
		CoordinatePoint c1 = new CoordinatePoint(-3 , 8);
		JavaCircle funC = new JavaCircle(3, c1, "orange");
		
		//or...
		JavaCircle funnerC = new JavaCircle(3, new CoordinatePoint(-3, 8), "orange");
		*/
		
		JavaCircle purpleC = new JavaCircle(2, 6, -2, "Purple");
		
		//print out state of the object (values of instance fields)
		System.out.println(purpleC.getRadius());
		System.out.println(purpleC.getXCenter());
		System.out.println(purpleC.getYCenter());
		System.out.println(purpleC.getColor());
		//pretty long, can make and use a toString instead
		System.out.println(purpleC); //don't even need to call toString, prints that automatically
	}
	
}