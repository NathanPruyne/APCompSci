//Name: Nathan Pruyne
//Period: 2

public class StringMethodsLab 
{
	//precondition: text.length() > 0
	//postcondition: returns the proper form of the name
	//              i.e. first letter capitalized the rest of the name lower case
	public static String proper(String text)
	{
		String firstLetter = text.substring(0, 1);
		String restOfString = text.substring(1);
		
		return firstLetter.toUpperCase() + restOfString.toLowerCase();
	}
	
	//precondition: the explicit parameters have length greater than 0
	//postcondition: returns the generated email in the format of:
	//              (first name) + (first 3 characters of last name) 
	//				+ (random number 1-20) + "@k12.ipsd.org" --> all lower case
	//			    example:  email(John, Riddle) returns "johnrid18@k12.ipsd.org"
	public static String email(String firstName, String lastName)
	{
		String emailAddress = firstName + lastName.substring(0,3) + ((int)(Math.random() * 20) + 1) + "@k12.ipsd.org";
		return emailAddress.toLowerCase();
		
	}
	
	//precondition: text.length() > 0
	//postcondition: returns a new word with the first letter and last letters of text switched
	//				example: rearranger(John) returns Nohj (note the capitalization)
	public static String rearranger(String text)
	{
		
		String firstChar = text.substring(0, 1);
		String lastChar = text.substring(text.length() - 1, text.length());
		String middle = text.substring(1, text.length() - 1);
		return proper(lastChar + middle + firstChar);
		
	}	
	

	//there will be two more methods for you to code.  When you do, make sure
	//you include the precondition and postcondition as part of your commenting system
	
	//precondition: text.length() >= 2
	//postcondition:  returns a new word rearranged in pig latin style. 
	//				this is done by moving the first letter to the very end,
	//				and adding "ay" at the end.  for example, "John" becomes "Ohnjay"
	//				and "Metea" becomes "Eteamay".  Note the capitalization.
	public static String pigLatin(String text)
	{
		String firstChar = text.substring(0,1);
		String rest = text.substring(1);
		return proper(rest + firstChar + "ay");
		
	}

	
	//precondition: text.length() >= 2
	//postcondition:  returns a new String with the first letter, the middle letter, and the last letter
	//				all capitalized.  If there's an even number of letters, the middle letter is the 
	//				letter closer to the front.  For example, "John" returns "JOhN" and "tomizzo" returns "TomIzzO".
	public static String funkyCap(String text)
	{
		String firstHalf = proper(text.substring(0, (text.length() - 1) / 2));
		String secondHalf = proper(text.substring((text.length() - 1) / 2, text.length() - 1));
		String lastChar = text.substring(text.length() - 1).toUpperCase();
		return firstHalf + secondHalf + lastChar;

	}
	
	//precondition:  text.length() >=3 and has exactly one space somewhere between the first and the last letter
	//postcondition: returns a new string with the first letter in the first word (before the space) and the 
	//				first letter in the second word (after the space) switched.  For example, "John Riddle" returns "Rohn Jiddle"
	//				and "Tim Mills" returns "Mim Tills"
	public static String nickname(String text)
	{
		int splitPoint = text.indexOf(" ");
		String newFirstName = proper(text.substring(splitPoint + 1, splitPoint + 2) + text.substring(1,splitPoint));
		String newLastName = proper(text.substring(0,1) + text.substring(splitPoint + 2));
		return newFirstName + " " + newLastName;
	}
	
	public static void main(String[] args) {
		System.out.println(nickname("Cool Story"));
	}
}
