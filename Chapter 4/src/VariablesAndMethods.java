
public class VariablesAndMethods 
{
	//method header
	//private -- access specifier (public or private)
	//static -- method belongs to the class, not an object
	//double -- return type
	//addTwoNumbers -- method name
	//double a, double b -- parameters (inputs)
	private static double addTwoNumbers (double a, double b) 
	{
		//method body
		return(a + b);
	}
	
	public static void main (String[] args)
	{
		//int -- data value
		//x -- variable name
		//= -- assignment operator
		//4 -- value
		int x = 4;
		double y = 7;
		double xPlusY = addTwoNumbers(x, y);
		
		double xToTheY = Math.pow(x, y);
		
		y = x + x * y;
		y = y - (x + y);
		System.out.println("x is " + x + ", y is " + y);
		System.out.println("x + y is " + xPlusY + ", x ^ y is " + xToTheY);
		
		//constants: all capitals, will never change:
		final double INTEREST_RATE = 0.075; //declared using final
		//INTEREST_RATE = 0.05; //will error
	}
}
