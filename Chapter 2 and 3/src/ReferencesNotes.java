
public class ReferencesNotes {

	public static void main(String[] args) {
		
		//Create JavaCircle with radius 3, center (-1, 4), color Pink
		JavaCircle pinkCircle = new JavaCircle(3, new CoordinatePoint(-1, 4), "Pink");
		
		//Primatives (changing, etc.)
		int x = 42;
		int y = 5;
	
		x = y;
		y = -2;
		
		System.out.println("x is: " + x + ", y is: " + y);
		
		//Objects
		JavaCircle greenCircle = new JavaCircle(4, new CoordinatePoint(-1, 4), "Green");
		
		//We now have 2 objects, pinkCircle and greenCircle
		//Both reference an object in memory (pointers to it)
		
		greenCircle = pinkCircle;
		//Now both reference the same object (pointers to same thing)
		
		System.out.println("pinkCircle radius: " + pinkCircle.getRadius());
		System.out.println("greenCircle radius: " + greenCircle.getRadius());
		
		pinkCircle.setRadius(9);
		//This changed both of them (changed the object in memory that both are pointers to)
		
		System.out.println("pinkCircle radius (changed): " + pinkCircle.getRadius());
		System.out.println("greenCircle radius (changed): " + greenCircle.getRadius());
		//is 2 because both changed
		
	}
	
}
