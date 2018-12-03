
public class ArrayMethods
{
	/*The display method will receive an array of int values and return a
			String in the following format:
			subscript[0] = ____
			subscript[1] = ____
			subscript[2] = ____
			subscript[3] = ____
			…
			 a line should be generated for each value in the
			array. Recall that \n is a newline escape sequence*/
	public static String display(int[] values)
	{
		
		String res = "";
		
		for (int i = 0; i < values.length; i++) {
			res += "subscript[" + i + "] = " + values[i] + "\n";
		}
		
		return res;
		
	}
	
	
	
	/*The sum method will receive an array of int values and return the sum
			of its contents*/
	public static int sum(int[] values)
	{
		
		int res = 0;
		
		for (int val: values) {
			res += val;
		}
		
		return res;
		
	}
	
	
	
	/*The average method will receive an array of int values and return the
			average of its contents*/
	public static double average(int[] values)
	{
		
		return (double) sum(values) / values.length;
		
	}
	
	
	
	/* this method will load an array with a specified number of random
		values and update the subscripts in the array to reflect the number
		times a random number was generated
		
		the method will generate a random value in the range
		[0,values.length-1] and keep a running count of the value generated
		in the corresponding subscript.
		
		 For Example: Consider an array with 5 slots (indices 0-4).  
			Suppose we randomly generated 10 random values: 1,3,1,2,0,3,0,1,3,1
			(note that the random numbers are within the indices range). 
			The array would then contain:
			array[0] = 2 (because there were two '0's generated)
			array[1] = 4 (because there were four '1's generated)
			array[2] = 1 (because there were one '2's generated)
			array[3] = 3 (because there were three '3's generated)
			array[4] = 0 (because there were zero '4's generated)
			
			This essentially shows a distribution of the random values generated. The method
			will generate “times” number of random values. */

	public static int[] loadArray(int length, int times)
	{		
	
		int[] returned = new int[length];
		/* //initialize returned to all 0s
		for (int i = 0; i < length; i++) {
			returned[i] = 0;
		}
		*/
		for (int i = 0; i < times; i++) {
			int value = (int) (Math.random() * length);
			returned[value] += 1;
		}
		
		return returned;
		
	}
	
	
	
	/*The max method will receive an array of int values and return the
			maximum value in the array*/
	public static int max(int[] values)
	{
		
		int max = Integer.MIN_VALUE;
		
		for (int val: values) {
			if (val > max) {
				max = val;
			}
		}
		
		return max;
		
	}
	
	
	
	/*This version of the max method will receive an array of int values and return the
			maximum value in the array WITHIN the indices lowerbound and upperbound*/
	
	public static int max(int[] values, int lowerbound, int upperbound) //overloaded method
	{
		int max = Integer.MIN_VALUE;
		
		for (int i = lowerbound; i <= upperbound; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}
		
		return max;
	}
	
	
	
	/* The maxIndex method will receive an array of int values and return the
			index where the maximum value occurs in the array */
	public static int maxIndex(int[] values)
	{
		int maxVal = max(values);
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == maxVal) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	
	/*The min method will receive an array of int values and return the
			smallest value in the array*/
	public static int min(int[] values)
	{
		int min = Integer.MAX_VALUE;
		
		for (int val: values) {
			if (val < min) {
				min = val;
			}
		}
		
		return min;
 	
	}
	
	
	
	/* The minIndex method will receive an array of int values and return the
			index where the minimum value occurs in the array*/
	public static int minIndex(int[] values)
	{
		
		int min = min(values);
		
		for (int i = 0; i < values.length; i++) {
			if (values[i] == min) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	
	/*The occurrences method will receive an array of int values and a
			target value to find. It will return the number of times the target
			value occurs in the array*/
	public static int occurrences(int[] values, int target)
	{
		
		int count = 0;
		
		for (int val: values) {
			if (val == target) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	
	/*This version of the occurrences method will receive an array of int values and a
			target value to find, and a lower and upper bound. 
			It will return the number of times the target value occurs in the array
			within the lowerbound and upperbound (these are indices in the array)*/
	public static int occurrences(int[] values, int lowerbound, int upperbound, int target)
	{
		
		int count = 0;
		
		for (int i = lowerbound; i <= upperbound; i++) {
			if (values[i] == target) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	
	/*The repeats method will receive an array of int values and will return
			the number of repeats (meaning adjacent positions) are the same value
			For Example, consider the following array:
			array[0] = 1
			array[1] = 2
			array[2] = 1  (repeated '1's)
			array[3] = 1
			array[4] = 1
			array[5] = 2 (repeated '2's)
			array[6] = 2
			array[7] = 5
			array[8] = 7 (repeated '7's)
			array[9] = 7
			
			In this case, the method would return 4, because there are four sets 
			of repeating values.  Note that a repeat counts if two adjecent values are the same*/
	public static int repeats(int[] values)
	{

		int count = 0;
		
		for (int i = 0; i < values.length - 1; i++) {
			if (values[i] == values[i + 1]) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	
	/*The largestGap method will receive an array of int values and the
			first index of where the largest difference in consecutive values occurs
			
	If there are two gaps with the same difference, the index of the first
			pair of values is returned
			
	Keep in mind that the differences can be positive or negative
	
	For Example, consider the following array:
			array[0] = 1
			array[1] = 2 (gap of 3)
			array[2] = 5 
			array[3] = 1
			array[4] = 1
			array[5] = 2 
			array[6] = 3 (gap of 3)
			array[7] = 6
			array[8] = 7 
			array[9] = 7
	using this array, the largestGap would return 1, because that's the index of the first 
			instance of the largest gap.
	*/
	public static int largestGap(int[] values) 
	{
		int maxGap = 0;
		int maxGapIndex = -1;
		
		for (int i = 0; i < values.length - 1; i++) {
			int gap = Math.abs(values[i] - values[i + 1]);
			if (gap > maxGap) {
				maxGap = gap;
				maxGapIndex = i;
			}
		}
		
		return maxGapIndex;
	}
	
}

