
public class InheritanceTester {

	public static void main(String[] args) {
		OrderedPair p1 = new OrderedPair(6, -7);
		ThreeDimOrderedPair p2 = new ThreeDimOrderedPair(-3, 1, 0);
		
		/*
		System.out.println(p1);
		System.out.println();
		System.out.println(p2); //Uses overriden toString method for 3 dim
		*/
		
		OrderedPair p3 = new ThreeDimOrderedPair(); //Can do this because a 3Dim "is a" OrderedPair
		p3.setX(-5); //Will use the OrderedPair implementation
		//p3.setZ(-2); //Thinks it's an OrderedPair, not a 3Dim... so gets confused and goes bad
		((ThreeDimOrderedPair) p3).setZ(-2); //casting to 3Dim allows it to use 3Dim specific methods
		//Casting basically forces compiler to treat it as a 3Dim
		System.out.println(p3.toString()); //Which toString will be run?
		//In actual data of p3, the 3Dim toString is what is stored (overriden), so this one runs
		//This is POLYMORPHISM
		//SetZ was not overriden, was new functionality, so couldn't run it based on OrderedPair
		System.out.println(p3.distanceFrom(p2)); //Won't access z's
		//Looking at other classes, distanceFrom WAS NOT overriden (different parameters)
		//Ordered pair instance is run, since p2 still "is a" OrderedPair this is valid
		System.out.println(((ThreeDimOrderedPair) p3).distanceFrom(p2)); //One way to do it
		System.out.println(p2.distanceFrom((ThreeDimOrderedPair) p3)); //Will run the 3Dim distance from of p2 
		
	}
	
}
