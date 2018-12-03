import java.util.Arrays;


public class ArrayMethodsTester {

	public static void main(String[] args) {
		int[] values = {5, 5, 2, 3, 8, 1, 1, 6, 6, 7, 5};
		System.out.println(ArrayMethods.display(values));
		System.out.println(ArrayMethods.sum(values));
		System.out.println(ArrayMethods.average(values));
		System.out.println(Arrays.toString(ArrayMethods.loadArray(5, 10)));
		System.out.println(ArrayMethods.max(values));
		System.out.println(ArrayMethods.max(values, 7, 9));
		System.out.println(ArrayMethods.maxIndex(values));
		System.out.println(ArrayMethods.min(values));
		System.out.println(ArrayMethods.minIndex(values));
		System.out.println(ArrayMethods.occurrences(values, 5));
		System.out.println(ArrayMethods.occurrences(values, 0, 6, 5));
		System.out.println(ArrayMethods.repeats(values));
		System.out.println(ArrayMethods.largestGap(values));
	}
	
}
