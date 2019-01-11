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
			} else if (values[middle] < target) {
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
		int first = 0;
		int last = values.length - 1;
		int middle;
		while (first <= last) {
			middle = (first + last) / 2;
			int comparison = values[middle].compareTo(target);
			if (comparison == 0) {
				return middle;
			} else if (comparison < 0) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
		}
		return -1;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] bubbleSort(int[] values)
	{
		boolean swapped = true;
		int temp;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < values.length - 1; i++) {
				if (values[i] > values[i + 1]) {
					temp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return values;
	}
	
	public static int[] slightlyFasterBubble(int[] values) {
		boolean swapped = true;
		int temp;
		int pass = 1;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < values.length - pass; i++) {
				if (values[i] > values[i + 1]) {
					temp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = temp;
					swapped = true;
				}
			}
			pass++;
		}
		return values;
	}
	
	//String version
	public static String[] bubbleSort(String[] values)
	{
		boolean swapped = true;
		String temp;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < values.length - 1; i++) {
				if (values[i].compareTo(values[i + 1]) > 0) {
					temp = values[i];
					values[i] = values[i + 1];
					values[i + 1] = temp;
					swapped = true;
				}
			}
		}
		return values;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] selectionSort(int[] values)
	{
		int smallestIndex;
		for (int i = 0; i < values.length; i++) {
			smallestIndex = i;
			for (int j = i; j < values.length; j++) {
				if (values[j] < values[smallestIndex]) {
					smallestIndex = j;
				}
			}
			int temp = values[i];
			values[i] = values[smallestIndex];
			values[smallestIndex] = temp;
		}
		return values;
	}
	
	//String version
	public static String[] selectionSort(String[] values)
	{
		int smallestIndex;
		for (int i = 0; i < values.length; i++) {
			smallestIndex = i;
			for (int j = i; j < values.length; j++) {
				if (values[j].compareTo(values[smallestIndex]) < 0) {
					smallestIndex = j;
				}
			}
			String temp = values[i];
			values[i] = values[smallestIndex];
			values[smallestIndex] = temp;
		}
		return values;
	}
	
	//precondition: values is a non-empty array of integers
	//postcondition: returns a new array that is the sorted version of the input parameter
	public static int[] insertionSort(int[] values)
	{
		for (int i = 1; i < values.length; i++) {
			int j = i;
			int temp = values[i];
			while (j > 0 && temp < values[j - 1]) {
				values[j] = values[j - 1];
				j--;
			}
			values[j] = temp;
		}
		return values;
	}
	
	//String version
	public static String[] insertionSort(String[] values)
	{
		for (int i = 1; i < values.length; i++) {
			int j = i;
			String temp = values[i];
			while (j > 0 && temp.compareTo(values[j - 1]) < 0) {
				values[j] = values[j - 1];
				j--;
			}
			values[j] = temp;
		}
		return values;
	}
	
	public static boolean isSorted(int[] values) {
		int last = values[0];
		for (int val: values) {
			if (val < last) {
				return false;
			}
			last = val;
		}
		return true;
	}
	
	public static int[] horriblyInefficientSort(int[] values) {
		while (!isSorted(values)) {
			for (int i = 0; i < values.length - 1; i++) {
				if (values[i] > values[i + 1]) {
					int temp = values[i + 1];
					values[i + 1] = values[i];
					values[i] = temp;
				}
			}
		}
		return values;
	}
	
}
