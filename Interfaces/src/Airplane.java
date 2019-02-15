
public class Airplane implements Flier, Comparable<Flier>
{
	private double myAltitude;
	private double myTotalDistance;
	
	public Airplane(double alt, double dist)
	{
		myAltitude = alt;
		myTotalDistance = dist;
	}
	
	public Airplane()
	{
		this(0,0);
	}
	
	public String fly(double distance)
	{
		myTotalDistance += distance;
		return "The plane flies " + distance + " miles";
	}
	
	public String takeOff()
	{
		return "The plane takes off on the runway!";
	}
	public String land()
	{
		myAltitude = 0;
		return "The plane lands!";
	}
	public double getAltitude()
	{
		return myAltitude;
	}
	public double getTotalDistance()
	{
		return myTotalDistance;
	}
	
	public void setAltitude(double alt)
	{
		myAltitude = alt;
	}
	
	public int compareTo(Flier otherFlier)
	{
		//return a positive number if 
		//this total distance > otherFlier's total distance
		
		//return a negative number if 
		//this total distance < otherFlier's total distance
		
		//return 0 if they're the same
		
		//return (int)(this.getTotalDistance() - otherFlier.getTotalDistance());
		if(this.getTotalDistance() > otherFlier.getTotalDistance())
			return 1;
		else if(this.getTotalDistance() < otherFlier.getTotalDistance())
			return -1;
		else
			return 0;
	}
}
