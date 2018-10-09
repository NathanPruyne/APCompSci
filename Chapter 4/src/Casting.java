
public class Casting {

	public static void main(String[] args) 
	{
		
		//example 1: different types of division
		int x = 5 / 3; //x is 1: truncated, decimal is cut off
		int y = 5 % 3; //"5 mod 3", y is 2, remainder
		double z = 5 / 3; //z is 1.0, integer division happens first, then stores in double
		//zBetter will be 1.6666666666667
		double zBetter = 5.0 / 3; //now it sees the 5 as a double, will not do integer division
		double zBetter2 = (double)5/3; //casts this to a double first, then does the division
		/*casting: tells java to treat the next value as the data type
		 *  in parentheses for this one line
		 */
		
		//example 2: data type conversions
		int a = 3;
		double b = 4.5;
		b = a; //b is 3.0, double version of a (a is promoted)
		//a = b; bad error, double can't be put in int
		a = (int)b; //fixes this, treats b as an int, a will be 4 (truncated)
		//casting will cause loss of precision (4.5 becomes 4)
	}
	
}
