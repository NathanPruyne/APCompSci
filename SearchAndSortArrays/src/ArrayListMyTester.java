import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListMyTester {


	public static void main(String[] args) 
	{
		String[] smyArray = {"Anthony", "Barbara", "Bob", "Chris", "Dwayne", "Elena", "Frank", "Gauss", "Johnny", "Stevie", "Wayne", "Zebra", "christopher", "jimmy", "sonja"};
		String[] sneedsSorting1 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] sneedsSorting2 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] sneedsSorting3 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		ArrayList<String> smyArrayAL = new ArrayList<String>(Arrays.asList(smyArray));
		ArrayList<String> ALneedsSorting1 = new ArrayList<String>(Arrays.asList(sneedsSorting1));
		ArrayList<String> ALneedsSorting2 = new ArrayList<String>(Arrays.asList(sneedsSorting2));
		ArrayList<String> ALneedsSorting3 = new ArrayList<String>(Arrays.asList(sneedsSorting3));
		
		System.out.println("3 tests for search:");
		System.out.print((ArrayListSortAndSearch.ArrayListSearch(smyArrayAL, "Gauss") == 7) + ", "); 
		System.out.print((ArrayListSortAndSearch.ArrayListSearch(smyArrayAL, "Anthony")==0) + ", ");
		System.out.print(ArrayListSortAndSearch.ArrayListSearch(smyArrayAL, "Izzo")==-1);
		System.out.println("\n");
		
		System.out.println("4 tests for bubble sort:");
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(smyArrayAL)) + ", "); //should return true
		System.out.print(isSorted(ALneedsSorting1) + ", ");//should return false
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(ALneedsSorting1)) + ", ");//should return true
		System.out.print(isSorted(ALneedsSorting2) + ", ");//should return false
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(ALneedsSorting2)) + ", ");//should return true
		System.out.print(isSorted(ALneedsSorting3) + ", "); //should return false
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(ALneedsSorting3)));//should return true
		System.out.println("\n");
	
	
		String[] sneedsSorting4 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] sneedsSorting5 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] sneedsSorting6 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		ArrayList<String> ALneedsSorting4 = new ArrayList<String>(Arrays.asList(sneedsSorting4));
		ArrayList<String> ALneedsSorting5 = new ArrayList<String>(Arrays.asList(sneedsSorting5));
		ArrayList<String> ALneedsSorting6 = new ArrayList<String>(Arrays.asList(sneedsSorting6));
		
		System.out.println("4 tests for selection sort:");
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(smyArrayAL)) + ", "); //should return true
		System.out.print(isSorted(ALneedsSorting4) + ", ");//should return false
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(ALneedsSorting4)) + ", ");//should return true
		System.out.print(isSorted(ALneedsSorting5) + ", ");//should return false
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(ALneedsSorting5)) + ", ");//should return true
		System.out.print(isSorted(ALneedsSorting6) + ", "); //should return false
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(ALneedsSorting6)));//should return true
		System.out.println("\n");
	
		String[] sneedsSorting7 = {"d","M", "g", "Q", "de", "z", "a", "B", "Z", "m", "q", "T"};
		String[] sneedsSorting8 = {"z", "m", "l", "g", "f", "e", "c", "b", "a"};
		String[] sneedsSorting9 = {"c", "d", "e", "f", "g", "h", "i", "a", "b"};
		ArrayList<String> ALneedsSorting7 = new ArrayList<String>(Arrays.asList(sneedsSorting7));
		ArrayList<String> ALneedsSorting8 = new ArrayList<String>(Arrays.asList(sneedsSorting8));
		ArrayList<String> ALneedsSorting9 = new ArrayList<String>(Arrays.asList(sneedsSorting9));
		
		System.out.println("4 tests for insertion sort:");
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(smyArrayAL)) + ", "); //should return true
		System.out.print(isSorted(ALneedsSorting7) + ", ");//should return false
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(ALneedsSorting7)) + ", ");//should return true
		System.out.print(isSorted(ALneedsSorting8) + ", ");//should return false
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(ALneedsSorting8)) + ", ");//should return true
		System.out.print(isSorted(ALneedsSorting9) + ", "); //should return false
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(ALneedsSorting9)));//should return true
		System.out.println("\n");
		
	}
	
	public static boolean isSorted(ArrayList<String> values)
	{
		for(int i = 1; i < values.size(); i++)
		{
			if(values.get(i).compareTo(values.get(i-1)) < 0)
				return false;
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

3 tests for search:
true, true, true

4 tests for bubble sort:
true, false, true, false, true, false, true

4 tests for selection sort:
true, false, true, false, true, false, true

4 tests for insertion sort:
true, false, true, false, true, false, true
____________________________________________________
*/

