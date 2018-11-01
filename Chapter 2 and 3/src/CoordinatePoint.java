//class header
public class CoordinatePoint 
{
	//instance fields
	//stores the values of the objects' attributes
	private double myX;
	private double myY;
	
	//constructor
	//purpose: assign initial values to each instance field
	//DEFAULT constructor (the programmer assigns the values)
	public CoordinatePoint()
	{
		myX = 0;
		myY = 0;
	}
	
	//another constructor
	public CoordinatePoint(double x, double y)
	{
		myX = x;
		myY = y;
	}
	
	//accessor method
	//accesses the x-coordinate
	public double getX()
	{
		return myX;
	}
	
	//accessor method
	//accesses (gets) (returns) the y-coordinate
	public double getY()
	{
		return myY;
	}
	
	//mutator method
	//allows the user to change/set the x-coordinate
	public void setX(double x)
	{
		myX = x;
	}
	
	//mutator method
	//allows the user to change/set the y-coordinate
	public void setY(double y)
	{
		myY = y;
	}
}
