import java.util.Arrays;


public class SearchAndSortTest {
	
	public static void main(String[] args) {
		int[] values = {-3, -1, 4, 6, 11, 16, 22, 42, 50, 51, 61, 75, 80, 89, 203, 514, 719, 1012};
		System.out.print((SearchAndSort.binarySearch(values, 42)));
		
		int[] array1 = {3, 5, 7, 6, -2, 0, 9, 8};
		System.out.println(SearchAndSortTester.display((SearchAndSort.insertionSort(array1))));
	}
	
}
