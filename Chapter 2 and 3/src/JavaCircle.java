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
	private CoordinatePoint myCenter;
	private String myColor;
	
	//2. constructor - special method to assign initial values to all instance fields
	//called whenever a new instance of class is made
	//has no return, name is same as name of class
	public JavaCircle(double r, CoordinatePoint center, String c) {
		myRadius = r;
		myCenter = center;
		myColor = c;
	}
	
	//can put x and y, we'll make it coordinate point
	public JavaCircle(double r, double x, double y, String c) {
		myRadius = r;
		myCenter = new CoordinatePoint(x, y);
		myColor = c;
	}
	
	public JavaCircle() {
		/* 
		myRadius = 1;
		myCenter = new CoordinatePoint();
		myColor = "Black";
		This is inefficient, ugh
		*/
		
		//can use this keyword to call other constructor
		this(1, new CoordinatePoint(), "Black"); //used the other constructor by calling this
	}
	
	public JavaCircle(String c) {
		//only define color
		this(1, new CoordinatePoint(), c); //save some time by just assigning c
	}
	
	//3. methods - two basic types: accessor (getter) and mutator (setter)
	
	//accessors - access (get) current value of instance field
	
	//is NOT static, allows method to apply to instance of object, not class
	public double getRadius() { //public so can be accessed
		return myRadius; //how to access myRadius if you need it in different class
	}
	
	public CoordinatePoint getCenter() {
		return myCenter;
	}
	
	public double getXCenter() {
		return myCenter.getX();
	}
	
	public double getYCenter() {
		return myCenter.getY();
	}
	
	public String getColor() {
		//changed this to show this: this object's color (just emphasis in this case)
		return this.myColor;
	}
	
	public double getArea() {
		return (Math.PI)* Math.pow(myRadius, 2); 
	}
	
	//mutator methods: change (set) value of instance fields
	
	public void setRadius(double r) { //void: doesn't return anything
		myRadius = r;
	}
	
	public void setCenter(CoordinatePoint c) {
		myCenter = c;
	}
	
	public void setXCenter(double x) {
		myCenter.setX(x);
	}
	
	public void setYCenter(double y) {
		myCenter.setX(y);
	}
	
	public void setColor(String c) {
		myColor = c;
	}
}
