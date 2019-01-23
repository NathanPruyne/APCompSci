import java.util.ArrayList;


public class ArrayListSortAndSearchTester 
{

	public static void main(String[] args) 
	{
		//DECLARE AND INSTANTIATE THE ARRAYLIST:
		ArrayList<String> s = new ArrayList<String>();
		
		//TESTING THE SEARCH METHOD (should list 3 "trues" in console)
		System.out.print("3 tests for ArrayListSearch: ");
		s.add("d"); s.add("M"); s.add("g"); s.add("Q"); s.add("de"); s.add("z"); s.add("a"); s.add("B"); s.add("Z"); s.add("m"); s.add("q"); s.add("T");
		System.out.print((ArrayListSortAndSearch.ArrayListSearch(s, "d") == 0) + ", ");
		System.out.print((ArrayListSortAndSearch.ArrayListSearch(s, "z") == 5) + ", ");
		System.out.print((ArrayListSortAndSearch.ArrayListSearch(s, "java") == -1));
		
		//TESTING THE BUBBLESORT METHOD (should list 3 "trues" in console)
		System.out.print("\n 3 tests for Bubble Sort: ");
		s.clear();
		s.add("d"); s.add("M"); s.add("g"); s.add("Q"); s.add("de"); s.add("z"); s.add("a"); s.add("B"); s.add("Z"); s.add("m"); s.add("q"); s.add("T");
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(s)) + ", ");
		
		s.clear();
		s.add("z"); s.add("m"); s.add("l"); s.add("g"); s.add("f"); s.add("e"); s.add("c"); s.add("b"); s.add("a");
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(s)) + ", ");
		
		s.clear();
		s.add("c"); s.add("d"); s.add("e"); s.add("f"); s.add("g"); s.add("h"); s.add("i"); s.add("b"); s.add("a");
		System.out.print(isSorted(ArrayListSortAndSearch.bubbleSort(s)));
		
		//TESTING THE SELECTIONSORT METHOD (should list 3 "trues" in console)
		System.out.print("\n 3 tests for Selection Sort: ");
		s.clear();
		s.add("d"); s.add("M"); s.add("g"); s.add("Q"); s.add("de"); s.add("z"); s.add("a"); s.add("B"); s.add("Z"); s.add("m"); s.add("q"); s.add("T");
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(s)) + ", ");
		
		s.clear();
		s.add("z"); s.add("m"); s.add("l"); s.add("g"); s.add("f"); s.add("e"); s.add("c"); s.add("b"); s.add("a");
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(s)) + ", ");
		
		s.clear();
		s.add("c"); s.add("d"); s.add("e"); s.add("f"); s.add("g"); s.add("h"); s.add("i"); s.add("b"); s.add("a");
		System.out.print(isSorted(ArrayListSortAndSearch.selectionSort(s)));
		
		//TESTING THE INSERTIONSORT METHOD (should list 3 "trues" in console)
		System.out.print("\n 3 tests for Insertion Sort: ");
		s.clear();
		s.add("d"); s.add("M"); s.add("g"); s.add("Q"); s.add("de"); s.add("z"); s.add("a"); s.add("B"); s.add("Z"); s.add("m"); s.add("q"); s.add("T");
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(s)) + ", ");
		
		s.clear();
		s.add("z"); s.add("m"); s.add("l"); s.add("g"); s.add("f"); s.add("e"); s.add("c"); s.add("b"); s.add("a");
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(s)) + ", ");
		
		s.clear();
		s.add("c"); s.add("d"); s.add("e"); s.add("f"); s.add("g"); s.add("h"); s.add("i"); s.add("b"); s.add("a");
		System.out.print(isSorted(ArrayListSortAndSearch.insertionSort(s)));
	
	}
	
	private static boolean isSorted(ArrayList<String> values)
	{
		for(int i = 0; i < values.size() - 1; i++)
		{
			if(values.get(i).compareTo(values.get(i+1)) > 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	//you can use this method to help if you are stuck and can't figure out what your mistake is
	private static String display(ArrayList<String> values)
	{
		String result = "";
		for(int i = 0; i < values.size(); i++)
		{
			result = result + "subscript[" + i + "] = " + values.get(i) + "\n";
		}
		
		return result;
	}
	
	
}

/*YOUR OUTPUT CONSOLE SHOULD LOOK EXACTLY LIKE THIS:
 (if it doesn't look like this, your code is incorrect.
 You can use the "display" method to help you ascertain
 where your error is.)
__________________________________________________________ 
3 tests for ArrayListSearch: true, true, true
 3 tests for Bubble Sort: true, true, true
 3 tests for Selection Sort: true, true, true
 3 tests for Insertion Sort: true, true, true
____________________________________________________
*/
