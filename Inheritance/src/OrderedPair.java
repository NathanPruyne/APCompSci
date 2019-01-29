//File: OrderedPair.java
//An ordered pair is defined as having an x and
//   y coordinate

public class OrderedPair 
{
	//instance fields
	private int x;
	private int y;
	
	public OrderedPair(int xValue, int yValue)
	{
		x = xValue; 
		y = yValue;
	}
	//Constructors
	public OrderedPair()
	{
		this(0, 0);
	}
	
	//Accessors
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	//Mutators
	public void setX(int xValue)
	{
		x = xValue;
	}
	public void setY(int yValue)
	{
		y = yValue;
	}	
	public void move(int xValue, int yValue)
	{
		x = x + xValue; 
		y = y + yValue;
	}
	public double distanceFrom(OrderedPair p)
	{
		double xDiff = this.getX() - p.getX();
		double yDiff = this.getY() - p.getY();
		
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		
	}
	
	
	
}
