
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
	
	public static int count7(int low, int high) {
		int valueCount = 0;
		for (int i = low; i <= high; i++) {
			if (i % 7 == 0) {
				valueCount++;
			}
		}
		return valueCount;
	}
	
	public static int countsh(String text) {
		int shCount = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.substring(i,i+2).equals("sh")) {
				shCount++;
			}
		}
		return shCount;
	}
	
	public static String starTriangle(int n) {
		String triangle = "";
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				triangle += "* ";
			}
			triangle += "\n";
		}
		return triangle;
	}

	public static boolean isPrime(int num) {
		for (int i = num - 1; i > 1; i--) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static String listPrimes(int num) {
		String primes = "";
		for (int i = num; i > 1; i--) {
			if (isPrime(i)) {
				primes = primes + i + ", ";
			}
		}
		return primes.substring(0,primes.length() - 2);
	}
	
	
	public static void main(String[] args) {
		System.out.println(listPrimes(1000));
	}
}