import java.util.ArrayList;


public class FlierTester {

	public static void main(String[] args) {

		//Flier f1 = new Flier(); //big bad, can't construct an interface
		
		Bird b1 = new Bird();
		Flier b2 = new Bird(); //Since Bird is a Flier, this is valid
		//b2 has access to any Flier methods
		
		System.out.println(b2.fly(300));
		b1.setAltitude(.2);
		//b2.setAltitude(.4); //invalid, setAltitude is a Bird method, not a flier
		((Bird) b2).setAltitude(.4); //How to do this, but relies on the fact that b2 is a Bird
		
		Airplane a1 = new Airplane();
		Flier a2 = new Airplane();
		Flier a3 = new Airplane();
		
		a2 = b1; //even though a2 was Airplane, can be changed to Bird because both are fliers
		
		a2.fly(400);
		System.out.println(b1.getTotalDistance()); //gives 400 because now refers to same object
		
		System.out.println(a3.fly(500));
		//Both b2 and a3 are Flier, but runs Bird or Airplane methods based on what it actually points to
		
		System.out.println(a1.compareTo(a3));
		//System.out.println(a3.compareTo(a1)); //invalid: a3 is a Flier, doesn't have a compareTo
		System.out.println(((Airplane) a3).compareTo(a1));
		
		System.out.println(a1.compareTo(b2)); //valid because b2 is a flier, method signature allows comparing with other fliers
		//This is very useful because we can now compare across classes
		
		ArrayList<Flier> someFliers = new ArrayList<Flier>();
		
		for (int i = 0; i < 5; i++) {
			int rand = ((int) (Math.random() * 2)) + 1;
			if (rand == 1) {
				someFliers.add(new Bird());
			} else {
				someFliers.add(new Airplane());
			}
		}
		System.out.println(someFliers.get(2).fly(20));
		
		//loop through someFliers and print out feather color of all birds
		for (Flier f: someFliers) {
			if (f instanceof Bird) {
				System.out.println(((Bird) f).getFeatherColor());
			} else {
				System.out.println(f.takeOff());
			}
		}
		
	}

}
