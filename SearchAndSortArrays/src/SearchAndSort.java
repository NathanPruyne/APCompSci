import java.util.Arrays;


public class SearchAndSort
{
	//precondition: values is a non-empty array of integers
	//postcondition: return the index of the target, or -1 if target is not in the array
	public static int linearSearch(int[] values, int target)
	{
		for (int i = 0; i < values.length; i++) {
			if (values[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	//overloaded for String arrays
	public static int linearSearch(String[] values, String target)
	{
		for (int i = 0; i < values.length; i++) {
			if (values[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	//precondition: values is already sorted
	//postcondition: return the index of the target, or -1 if target is not in the array
	public static int binarySearch(int[] values, int target)
	{
		int first = 0;
		int last = values.length - 1;
		int middle;
		while (first <= last) {
			middle = (first + last) / 2;
			if (values[middle] == target) {
				return middle;
			} else if (values[middle] > target) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int[] values, int target) {
		int middle = (values.length - 1) / 2;
		if (values[middle] == target) {
			return middle;
		} else if (values.length == 1) {
			return -1;
		} else if (values[middle] < target) {
			return binarySearchRecursive(Arrays.copyOfRange(values, middle + 1, values.length - 1), target);
		} else {
			return binarySearchRecursive(Arrays.copyOfRange(values, 0, middle - 1), target);
		}
	}
	
	//String version
	public static int binarySearch(String[] values, String target)
	{
		
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] bubbleSort(int[] values)
	{
		
	}
	
	//String version
	public static String[] bubbleSort(String[] values)
	{
		
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] selectionSort(int[] values)
	{
		
	}
	
	//String version
	public static String[] selectionSort(String[] values)
	{
		
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] insertionSort(int[] values)
	{
	
	}
	
	//String version
	public static String[] insertionSort(String[] values)
	{
		
	}
	
}
