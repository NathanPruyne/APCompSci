
public class TestingStuff {
	
	private static String alphabetize(String word) {
		int spaceLocation = word.indexOf(" ");
		char firstWordStart = word.charAt(0);
		char secondWordStart = word.charAt(spaceLocation + 1);
		if (firstWordStart > secondWordStart) {
			return word.substring(spaceLocation + 1) + " " + word.substring(0, spaceLocation);
		} else {
			return word;
		}
		
	}
	
	private static int largeOrSmall(boolean getLarge, int value1, int value2, int value3) {
		int extreme = value1;
		if (getLarge) {
			if (value2 > extreme) {
				extreme = value2;
			}
			if (value3 > extreme) {
				extreme = value3;
			}
		}
		else {
			if (value2 < extreme) {
				extreme = value2;
			}
			if (value3 < extreme) {
				extreme = value3;
			}
		}
		return extreme;
	}
	
	public static void main(String[] args) {
		/*
		System.out.println(alphabetize("two space yeet"));
		System.out.println("fara".compareTo("faredwqdwqdwd"));
		boolean thisIsTrue = true;
		String trueString = String.valueOf(thisIsTrue);
		System.out.println(trueString);
		String name = null;
		if (!(name.equals("Bill"))) {
			System.out.println("Hi Bill");
		}
		*/
		System.out.println(largeOrSmall(true,432,645,453));
		int dollars = 10;
		double balance = dollars;
		System.out.println(balance);
	}
}
