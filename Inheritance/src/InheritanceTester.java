
public class InheritanceTester {

	public static void main(String[] args) {
		OrderedPair p1 = new OrderedPair(2, 3);
		ThreeDimOrderedPair p2 = new ThreeDimOrderedPair(1, 4, 5);
		
		System.out.println(p1);
		System.out.println(p2);
		
		OrderedPair p3 = new ThreeDimOrderedPair();
	}
	
}
