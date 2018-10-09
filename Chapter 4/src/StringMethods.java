
public class StringMethods {
	
	private static String combine(String a, String b) {
		return (a + " " + b); //concatenate these guys
	}
	
	private static String helloName(String name) {
		return "Hello, " + name + ", how are you?";
	}
	
	private static String ignoreLastChar(String s) {
		return s.substring(0, s.length() - 1);
	}
	
	public static void main(String[] args) {
		/*
		String a = "Hello";
		String b = "world";
		String combined = combine(a,b);
		System.out.println(combined);
		System.out.println(combine(a,b));
		System.out.println(combine("hello", "world"));
		*/
		
		//Big Picture: to use a String method, you need to call it with the variable name.
		
		//Big Picture2: calling a String method does NOT change the value of the variable you call it with.
		
		//.length() method -- returns the length of a String, returns int.
		String s1 = "Welcome, all";
		int l = s1.length();
		System.out.println(l);
		
		//.indexOf(String) method -- returns the "location" of the parameter, IS CASE SENSITIVE
		String s2 = "Squidward";
		System.out.println(s2.indexOf("w")); //will give 5 (6th letter but indeces start at 0
		System.out.println(s2.indexOf("d")); //will give 4 (1st instance)
		System.out.println(s2.indexOf("z")); //will give -1 (if it's not in there, -1)
		System.out.println(s2.indexOf("quid")); //will give 1 (can use multiletter strings)
		System.out.println(s2.indexOf("qudi")); //will give -1 (not in there)
		
		System.out.println(helloName("Nathan"));
		
		//.chatAt(int) method -- returns character at index of paramater (not on AP test)
		String s3 = "Happy Birthday!";
		System.out.println(s3.charAt(6));
		
		//.toUpperCase() method -- returns new String that is uppercase of variable
		String s4 = "Dog";
		System.out.println(s4.toUpperCase());
		
		//.toLowerCase() method -- returns new String that is lowercase of variable
		String s5 = s4.toUpperCase();
		System.out.println(s5.toLowerCase());
		
		//.substring(int) -- returns new string from index of parameter to end
		String s6 = "squishy";
		System.out.println(s6.substring(3));
		
		//.substring(int a , int b) -- returns new String from index a to b, including a, excluding b
		String s7 = "pineapple";
		System.out.println(s7.substring(4, 7));
		//System.out.println(s7.substring(7,4)); //This will error (IndexOutOfBounds)
		
		String s8 = "tester2";
		System.out.println(ignoreLastChar(s8));
		
	}

}
