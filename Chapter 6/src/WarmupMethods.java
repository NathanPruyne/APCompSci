
public class WarmupMethods {
	public static int sumUp(int low, int high) {
		int start;
		if (low % 3 == 0) {
			start = low;
		} else {
			start = low + (3 - low % 3);
		}
		int sum = 0;
		for (int i = start; i <= high; i += 3) {
			if (i % 5 != 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static int sumDigitsFor(int num) {
		int numDigits = Integer.toString(num).length();
		int sum = 0;
		for (int i = 0; i < numDigits; i++) {
			sum += num / Math.pow(10, i) % 10;
		}
		return sum;
	}
	
	public static int sumDigitsWhile(int num) {
		int total = 0;
		
		while (num != 0) {
			total += num % 10;
			num = num/10;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println(sumDigitsWhile(50249));
		System.out.println(sumDigitsWhile(16));
	}
}
