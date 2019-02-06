
public class Human
{
	private String myFirstName;
	private String myLastName;
	private int myAge;
	
	public Human(String firstName, String lastName, int age) 
	{
		myFirstName = firstName;
		this.myLastName = lastName;
		this.myAge = age;
	}
	
	public Human()
	{
		myFirstName = "Henry";
		myLastName = "Human";
		myAge = 15;
	}

	
	public void doSomething()
	{
		System.out.println(myFirstName + " lounges around");
	}
	
	public String getFirstName()
	{
		return this.myFirstName;
	}
	
	public String getLastName()
	{
		return myLastName;
	}
	
	public int getAge()
	{
		return myAge;
	}
	
	public void birthday()
	{
		myAge++;
	}
	
	
	@Override
	public String toString()
	{
		return "Name: " + myFirstName + " " + myLastName +
				"\nAge: " + myAge;
	}
	
	
	
}
