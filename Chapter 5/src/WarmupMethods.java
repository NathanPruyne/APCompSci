
public class WarmupMethods {
	
	//returns true if num is divisble by 2 or 3, but not both
	public static boolean luckyNumber(int num) {
		return (num % 2 == 0 || num % 3 == 0) && !(num % 6 == 0);
	}
	
	//returns true when number has 3 digits and the tens digit is 7
	public static boolean coolNumber(int num) {
		/*
		int tensDigit = (int)(((double) num / 100 - num / 100) * 10);
		return (100 > num / 10 && num / 10 > 10) && (tensDigit == 7);
		*/
		return (num >= 100 && num < 1000) && ((num / 10) % 10 == 7);
	}
	
	public static String reportCard(double percent) {
		if (percent >= 90) {
			return "A";
		} else if (percent < 90 && percent >= 80) {
			return "B";
		} else if (percent < 80 && percent >= 70) {
			return "C";
		} else if (percent < 70 && percent >= 60) {
			return "D";
		} else if (percent < 60 && percent >= 0) {
			return "F";
		} 
		return "Failed to find letter grade";
	}
	
	public static void main(String[] args) {
		
		System.out.println(reportCard(89.9999999999));
		
	}
	
}
