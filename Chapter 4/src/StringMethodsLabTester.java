//THIS IS THE TESTER CLASS FOR THE STRING METHODS LAB
//YOU ARE NOT TO EDIT THIS FILE AT ALL.  JUST RUN IT.
//EDITING THIS CLASS WILL RESULT IN AN AUTOMATIC 0.

import javax.swing.JOptionPane; // Make the JOptionPane library available to use

public class StringMethodsLabTester
{

	public static void main(String[] args) 

	{
		// Get the user's name
		String name = JOptionPane.showInputDialog("Enter your first and last name");
		String firstName = StringMethodsLab.proper(getFirst(name));
		String lastName = StringMethodsLab.proper(getLast(name));
		
		//Syntax for displaying output using a JOptionPane
		JOptionPane.showMessageDialog(null, "Hello, " + firstName + " " + lastName); 
		JOptionPane.showMessageDialog(null, "Your email is: " + StringMethodsLab.email(firstName, lastName));
		JOptionPane.showMessageDialog(null, "Your rearranged last name is: " + StringMethodsLab.rearranger(lastName));
		JOptionPane.showMessageDialog(null, "Your first name in pig latin is: " + StringMethodsLab.pigLatin(firstName));
		JOptionPane.showMessageDialog(null, "Your first name in funky caps is: " + StringMethodsLab.funkyCap(firstName));
		JOptionPane.showMessageDialog(null, "Your last name in funky caps is: " + StringMethodsLab.funkyCap(lastName));
		JOptionPane.showMessageDialog(null, "Your nickname is: " + StringMethodsLab.nickname(name));
		
	}
	
	private static String getFirst(String t)
	{
		int index = t.indexOf(" ");
		return t.substring(0, index);
	}
	
	private static String getLast(String t)
	{
		int index = t.indexOf(" ");
		return t.substring(index + 1);
	}

}
