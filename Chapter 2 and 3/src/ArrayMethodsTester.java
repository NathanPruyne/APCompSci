
public class ArrayMethodsTester {

	public static void main(String[] args) 
	{
		int[] randomArray = ArrayMethods.loadArray(6, 50);
		System.out.println(ArrayMethods.display(randomArray));
		
		int[] values = {5, 3, 8, 23, 7, 3, 9, 3, 10, 3, 3, 5, 4};
		System.out.println(ArrayMethods.sum(values) == 86);
		System.out.println(ArrayMethods.average(values) == 86.0/values.length);
		System.out.println(ArrayMethods.max(values) == 23);
		System.out.println(ArrayMethods.max(values, 4, 7) == 9);
		System.out.println(ArrayMethods.maxIndex(values) == 3);
		System.out.println(ArrayMethods.min(values) == 3);
		System.out.println(ArrayMethods.minIndex(values) == 1);
		System.out.println(ArrayMethods.occurrences(values, 3) == 5);
		System.out.println(ArrayMethods.occurrences(values, 4, 9, 3) == 3);
		System.out.println(ArrayMethods.repeats(values) == 1);
		System.out.println(ArrayMethods.largestGap(values)==3);
		
		
		
		
	}

}
