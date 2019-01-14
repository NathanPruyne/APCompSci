import java.util.ArrayList;


public class ArrayListSortAndSearch
{
	
	//precondition: values is already sorted
	//postcondition: return the index of the target, or -1 if target is not in the array
	public static int ArrayListSearch(ArrayList<String> values, String target)
	{
		//hint: if you use more than one line in this method, you are doing too much
		//another hint: look up a method in the ArrayList class library to help you
		return values.indexOf(target);
	}
	
	
	//precondition: values is a non-empty ArrayList of Strings
	//postcondition: returns a new ArrayList that is the sorted version of the input parameter
	public static ArrayList<String> bubbleSort(ArrayList<String> values)
	{
		boolean swapped = true;
		String temp;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < values.size() - 1; i++) {
				if (values.get(i).compareTo(values.get(i + 1)) > 0) {
					temp = values.get(i);
					values.set(i, values.get(i + 1));
					values.set(i + 1, temp);
					swapped = true;
				}
			}
		}
		return values;
	}
	
	
	
	public static ArrayList<String> selectionSort(ArrayList<String> values)
	{
		int smallestIndex;
		for (int i = 0; i < values.size(); i++) {
			smallestIndex = i;
			for (int j = i; j < values.size(); j++) {
				if (values.get(j).compareTo(values.get(smallestIndex)) < 0) {
					smallestIndex = j;
				}
			}
			String temp = values.get(i);
			values.set(i, values.get(smallestIndex));
			values.set(smallestIndex, temp);
		}
		return values;
	}
	

	
	public static ArrayList<String> insertionSort(ArrayList<String> values)
	{
		for (int i = 1; i < values.size(); i++) {
			int j = i;
			String temp = values.get(i);
			while (j > 0 && temp.compareTo(values.get(j - 1)) < 0) {
				values.set(j, values.get(j - 1));
				j--;
			}
			values.set(j, temp);
		}
		return values;
	}
	
	
	//use this method to help you test your sorts
	public static boolean isSorted(ArrayList<String> values)
	{
		for(int i = 1; i < values.size(); i++)
		{
			if(values.get(i).compareTo(values.get(i-1)) < 0)
				return false;
		}
		return true;
		
	}
	
	
	
	//use this main method for testing the methods on your own
	public static void main(String[] args)
	{
		System.out.println("hi");
		
	}
	

	
	

}
