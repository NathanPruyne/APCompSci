//public - access specifier (public or private)
//class - designates class (keyword)
//JavaCircle - class name, ShouldBeCapitalizedAsSo

//big picture: classes are blueprints for objects
public class JavaCircle {

	/*when making class, need 3 things:
	1. instance fields (HAS, attributes)
	2. constructors (tells us how to create instance of object.
	3. methods (DOES, behaviors)
	*/
	
	//1. instance fields - variables that whole class can access
	//declared in class, not method
	//can be primatives or other objects
	private double myRadius; //almost always private for data protection
	private double myXCenter;
	private double myYCenter;
	private String myColor;
	
	//2. constructor
	
	//3. methods - two basic types: accessor (getter) and mutator (setter)
	
	//accessors - access (get) current value of instance field
	
	//is NOT static, allows method to apply to instance of object, not class
	public double getRadius() { //public so can be accessed
		return myRadius; //how to access myRadius if you need it in different class
	}
	
	public double getXCenter() {
		return myXCenter;
	}
	
	public double getYCenter() {
		return myYCenter;
	}
	
	public String myColor() {
		return myColor;
	}
	
	//mutator methods: change (set) value of instance fields
	
	public void setRadius(double r) { //void: doesn't return anything
		myRadius = r;
	}
	
	public void setXCenter(double x) {
		myXCenter = x;
	}
	
	public void setYCenter(double y) {
		myYCenter = y;
	}
	
	public void setColor(String c) {
		myColor = c;
	}
}
