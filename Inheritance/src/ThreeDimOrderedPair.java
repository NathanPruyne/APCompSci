
public class ThreeDimOrderedPair extends OrderedPair {

	private int z;
	
	public ThreeDimOrderedPair(int xVal, int yVal, int zVal) {
		super(xVal, yVal); //Super calls the parent constructor, must be first line
		z = zVal;
	}
	
	public ThreeDimOrderedPair() {
		super(); //This is not necessary, will be called automatically
		//Must have default constructor in order to call super automatically
		z = 0;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int zVal) {
		z = zVal;
	}
	
	public double distanceFrom(ThreeDimOrderedPair p) {
		int xDiff = this.getX() - p.getX();
		int yDiff = super.getY() - p.getY();
		int zDiff = z - p.getZ();
		//3 different ways to do it, can access z directly because in this subclass
		
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff); 
	}
	
	public String toString() {
		return super.toString() + "\nz = " + z;
	}
	
}
