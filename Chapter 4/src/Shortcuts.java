
public class Shortcuts {

	public static void main(String[] args) 
	{
		int x = 4;
		double y = 2.5;
		
		//shortcut 1
		//set x to x * 4
		x = x * 4; //x becomes 16
		x *= 4; //*= means whatever is on the left is multiplied by the right (also +=, -=, etc.)
		//same as x = x * 4
		//x becomes 64
		
		y = y - 20; //y is now -17.5
		y -= 20; //shortcutted that too, y is now -37.5
		
		//shortcut 2: autoincrement and autodecrement
		//increment x by 1:
		x = x + 1; //x = 65
		x++; //x = 66
		x--; //x = 65 (autodecrement)
		
		//post-increment vs pre-increment
		x++; //post-increment, x = 66
		++x; //pre-increment, x = 67, does same thing
		
		x = ++x - 4 - --x + x++ - 2; //every ++, -- updates variable
		//  ^68       ^67   ^still 67, increments afterwards
		//after everything, x = 62
		
		int a = 4;
		int b = 22 % a; //b = 2
		
		a = ++b - a-- + 3 * ++a;
		//  ^3    ^4         ^4
		//  b=3   a=3       a=4
		//a = 11, b = 3
		System.out.println("a: " + a + " b: " + b);
	}
	
}
