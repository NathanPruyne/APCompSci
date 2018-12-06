import java.util.Arrays;


public class MoreArrayMethods {

	public static int[] sumCols(int[][] table) {
		int[] sums = new int[table[0].length];
		for (int i = 0; i < table[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < table.length; j++) {
				sum += table[j][i];
			}
			sums[i] = sum;
		}
		return sums;
	}
	
	public static int[] sumRows(int[][] table) {
		int[] sums = new int[table.length];
		for (int i = 0; i < table.length; i++) {
			int sum = 0;
			for (int j = 0; j < table[0].length; j++) {
				sum += table[i][j];
			}
			sums[i] = sum;
		}
		return sums;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sumCols(ArrayNotes.fillArray(10, 24))));
		System.out.println(Arrays.toString(sumRows(ArrayNotes.fillArray(10, 24))));
	}

}
