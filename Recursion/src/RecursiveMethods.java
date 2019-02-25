
public class RecursiveMethods {

	/*
	 * Returns the nth fibonacci number
	 * @param n the location of the desired fibonacci number
	 * @return the nth fibonacci number
	 */
	public static int fib(int n) {
		if (n == 1 || n == 2) { //base case
			return 1;
		}
		//Recursive method, so calls itself
		return fib(n - 2) + fib(n - 1);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fib(11));
		
	}

}
