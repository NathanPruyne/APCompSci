import java.awt.Rectangle;
import java.util.Arrays;

public class ArrayNotes {
	
	//fill 2D array, values[r][c] = r * c + 1
	public static int[][] fillArray(int r, int c) {
		int[][] res = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				res[i][j] = i * j + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		//declare an array of 10 ints
		int[] numbers = new int[10];
		
		//assign array to 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
		//first way:
		numbers[0] = 1; //don't forget, indices start at 0
		numbers[1] = 3;
		//etc, etc.
		
		//second way:
		int[] numbers2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		//can only be used in initialization
		
		//third (most common) way, loop it:
		for (int i = 0; i < numbers.length; i++) { //numbers.length gives number of values
			numbers[i] = i * 2 + 1;
		}
		
		//declare and fill an array of length 30
		//values of 0, 3, 8, 15, 24, 35
		int[] moreNumbers = new int[30];
		int setter = 0;
		for (int i = 0; i < moreNumbers.length; i++) {
			moreNumbers[i] = setter;
			setter += 3 + i * 2;
		}
		//or...
		for (int i = 0; i < moreNumbers.length; i++) {
			moreNumbers[i] = (int) Math.pow(i + 1, 2) - 1;
		}
		
		for (int i = 0; i < moreNumbers.length; i++) {
			System.out.println(moreNumbers[i]);
		}
		
		//Create an array of 100 Rectangle objects, all centered at (0,0)
		//Dimensions will be 1x1, 2x2, etc.
		
		Rectangle[] rectangles = new Rectangle[100];
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(i + 1, i + 1);
		}
		
		System.out.println(rectangles[4].getWidth());
		
		//2D arrays (matrices/tables)
		//make a "4 X 5" array
		int [][] values = new int[5][4]; //rows, then columns
		//set value in row 4, column 3:
		values[3][2] = 7; //subtract 1 bc indices start at 0
		System.out.println(values.length); //gives number of rows
		System.out.println(values[0].length); //gives number of columns (how many in row)
		values = fillArray(5, 4);
		System.out.println(Arrays.deepToString(values));
	}
	
}
