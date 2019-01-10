import java.util.Arrays;


public class SearchAndSortTest {
	
	public static void main(String[] args) {
		int[] array1 = {3, 5, 7, 6, -2, 0, 9, 8};
		System.out.println(SearchAndSort.isSorted((SearchAndSort.slightlyFasterBubble(array1))));
	}
	
}
