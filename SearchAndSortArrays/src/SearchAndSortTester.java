
public class SearchAndSortTester 
{

	public static void main(String[] args) 
	{
		int[] values = {-3, -1, 4, 6, 11, 16, 22, 42, 50, 51, 61, 75, 80, 89, 203, 514, 719, 1012};
		int[] needsSorting1 = {100, 78, 76, 75, 45, 34, 30, 29, 25, 11, 8, 6, -3, -9};
		int[] needsSorting2 = {3, 6, 34, 2, 11, 15, -3, 0, 8, 4, 9, 10, -5, -71, 71, 27, 54, 1, 11, 111};
		int[] needsSorting3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println("3 tests for linear search:");
		System.out.print((SearchAndSort.linearSearch(values, 42) == 7) + ", "); 
		System.out.print((SearchAndSort.linearSearch(values, -1)==1) + ", ");
		System.out.print(SearchAndSort.linearSearch(values, 53)==-1);//53 is not in the array, so linearSearch should return -1
		System.out.println("\n");
		
		System.out.println("3 tests for binary search:");
		System.out.print((SearchAndSort.binarySearch(values, 203)==14) + ", ");
		System.out.print((SearchAndSort.binarySearch(values, -3)==0) + ", ");
		System.out.print(SearchAndSort.binarySearch(values, 1013)==-1); //1013 is not in the array, so linearSearch should return -1
		System.out.println("\n");
		
		System.out.println("4 tests for bubble sort:");
		System.out.print(isSorted(SearchAndSort.bubbleSort(values)) + ", "); //should return true
		System.out.print(isSorted(needsSorting1) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.bubbleSort(needsSorting1)) + ", ");//should return true
		System.out.print(isSorted(needsSorting2) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.bubbleSort(needsSorting2)) + ", ");//should return true
		System.out.print(isSorted(needsSorting3) + ", "); //should return false
		System.out.print(isSorted(SearchAndSort.bubbleSort(needsSorting3)));//should return true
		System.out.println("\n");
		
		int[] needsSorting4 = {100, 78, 76, 75, 45, 34, 30, 29, 25, 11, 8, 6, -3, -9};
		int[] needsSorting5 = {3, 6, 34, 2, 11, 15, -3, 0, 8, 4, 9, 10, -5, -71, 71, 27, 54, 1, 11, 111};
		int[] needsSorting6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println("4 tests for selection sort:");
		System.out.print(isSorted(SearchAndSort.selectionSort(values)) + ", "); //should return true
		System.out.print(isSorted(needsSorting4) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.selectionSort(needsSorting4)) + ", ");//should return true
		System.out.print(isSorted(needsSorting5) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.selectionSort(needsSorting5)) + ", ");//should return true
		System.out.print(isSorted(needsSorting6) + ", "); //should return false
		System.out.print(isSorted(SearchAndSort.selectionSort(needsSorting6)));//should return true
		System.out.println("\n");
		
		int[] needsSorting7 = {100, 78, 76, 75, 45, 34, 30, 29, 25, 11, 8, 6, -3, -9};
		int[] needsSorting8 = {3, 6, 34, 2, 11, 15, -3, 0, 8, 4, 9, 10, -5, -71, 71, 27, 54, 1, 11, 111};
		int[] needsSorting9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		
		System.out.println("4 tests for insertion sort:");
		System.out.print(isSorted(SearchAndSort.insertionSort(values)) + ", "); //should return true
		System.out.print(isSorted(needsSorting7) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.insertionSort(needsSorting7)) + ", ");//should return true
		System.out.print(isSorted(needsSorting8) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.insertionSort(needsSorting8)) + ", ");//should return true
		System.out.print(isSorted(needsSorting9) + ", "); //should return false
		System.out.print(isSorted(SearchAndSort.insertionSort(needsSorting9)));//should return true
		System.out.println("\n");

		System.out.println("****************");
		System.out.println("string versions!");
		System.out.println("****************\n");
		
		String[] smyArray = {"Anthony", "Barbara", "Bob", "Chris", "Dwayne", "Elena", "Frank", "Gauss", "Johnny", "Stevie", "Wayne", "Zebra", "christopher", "jimmy", "sonja"};
		String[] sneedsSorting1 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] sneedsSorting2 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] sneedsSorting3 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		
		
		System.out.println("3 tests for linear search:");
		System.out.print((SearchAndSort.linearSearch(smyArray, "Gauss") == 7) + ", "); 
		System.out.print((SearchAndSort.linearSearch(smyArray, "Anthony")==0) + ", ");
		System.out.print(SearchAndSort.linearSearch(smyArray, "Izzo")==-1);
		System.out.println("\n");
		
		System.out.println("3 tests for binary search:");
		System.out.print((SearchAndSort.binarySearch(smyArray, "sonja")==14) + ", ");
		System.out.print((SearchAndSort.binarySearch(smyArray, "Zebra")==11) + ", ");
		System.out.print(SearchAndSort.binarySearch(smyArray, "humpty dumpty")==-1); //1013 is not in the array, so linearSearch should return -1
		System.out.println("\n");
		

		System.out.println("4 tests for bubble sort:");
		System.out.print(isSorted(SearchAndSort.bubbleSort(smyArray)) + ", "); //should return true
		System.out.print(isSorted(sneedsSorting1) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.bubbleSort(sneedsSorting1)) + ", ");//should return true
		System.out.print(isSorted(sneedsSorting2) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.bubbleSort(sneedsSorting2)) + ", ");//should return true
		System.out.print(isSorted(sneedsSorting3) + ", "); //should return false
		System.out.print(isSorted(SearchAndSort.bubbleSort(sneedsSorting3)));//should return true
		System.out.println("\n");
	
	
		String[] sneedsSorting4 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] sneedsSorting5 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] sneedsSorting6 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		
		System.out.println("4 tests for selection sort:");
		System.out.print(isSorted(SearchAndSort.selectionSort(smyArray)) + ", "); //should return true
		System.out.print(isSorted(sneedsSorting4) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.selectionSort(sneedsSorting4)) + ", ");//should return true
		System.out.print(isSorted(sneedsSorting5) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.selectionSort(sneedsSorting5)) + ", ");//should return true
		System.out.print(isSorted(sneedsSorting6) + ", "); //should return false
		System.out.print(isSorted(SearchAndSort.selectionSort(sneedsSorting6)));//should return true
		System.out.println("\n");
	
		String[] sneedsSorting7 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] sneedsSorting8 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] sneedsSorting9 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		
		System.out.println("4 tests for insertion sort:");
		System.out.print(isSorted(SearchAndSort.insertionSort(smyArray)) + ", "); //should return true
		System.out.print(isSorted(sneedsSorting7) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.insertionSort(sneedsSorting7)) + ", ");//should return true
		System.out.print(isSorted(sneedsSorting8) + ", ");//should return false
		System.out.print(isSorted(SearchAndSort.insertionSort(sneedsSorting8)) + ", ");//should return true
		System.out.print(isSorted(sneedsSorting9) + ", "); //should return false
		System.out.print(isSorted(SearchAndSort.insertionSort(sneedsSorting9)));//should return true
		System.out.println("\n");
		
	}

	private static boolean isSorted(int[] values)
	{
		for(int i = 0; i < values.length - 1; i++)
		{
			if(values[i] > values[i + 1])
			{
				return false;
			}
		}
		
		return true;
	}
	
	//String version
	private static boolean isSorted(String[] values)
	{
		for(int i = 0; i < values.length - 1; i++)
		{
			if(values[i].compareTo(values[i+1]) > 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	//you can use this method to help if you are stuck and can't figure out what your mistake is
	public static String display(int[] values)
	{
		String result = "";
		for(int i = 0; i < values.length; i++)
		{
			result = result + "subscript[" + i + "] = " + values[i] + "\n";
		}
		
		return result;
	}
	
	
}

/*YOUR OUTPUT CONSOLE SHOULD LOOK EXACTLY LIKE THIS:
 (if it doesn't look like this, your code is incorrect.
 You can use the "display" method to help you ascertain
 where your error is.)
__________________________________________________________ 
3 tests for linear search:
true, true, true

3 tests for binary search:
true, true, true

4 tests for bubble sort:
true, false, true, false, true, false, true

4 tests for selection sort:
true, false, true, false, true, false, true

4 tests for insertion sort:
true, false, true, false, true, false, true

****************
string versions!
****************

3 tests for linear search:
true, true, true

3 tests for binary search:
true, true, true

4 tests for bubble sort:
true, false, true, false, true, false, true

4 tests for selection sort:
true, false, true, false, true, false, true

4 tests for insertion sort:
true, false, true, false, true, false, true
____________________________________________________
*/
