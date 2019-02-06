import java.util.ArrayList;
public class Teacher extends Human
{
	private double mySalary;
	private String myDepartment;
	private ArrayList<Student> myRoster;
	
	public Teacher(String fName, String lName, int age, double sal, String dept, Student s)
	{
		super(fName, lName, age);
		mySalary = sal;
		myDepartment = dept;
		myRoster = new ArrayList<Student>();
		myRoster.add(s);
	}
	
	public Teacher()
	{
		this("Aristotle", "Teacher", 35, 0.0, "Mathematics", new Student());
	}
	
	public String getDepartment()
	{
		return myDepartment;
	}
	
	public double getSalary()
	{
		return mySalary;
	}
	
	public void payBump(double percentage)
	{
		mySalary = mySalary*(1 + percentage/100);
	}
	
	//overridden method
	public void doSomething()
	{
		System.out.println(this.getFirstName() + 
				" teaches " + myDepartment + "!");
	}
	
	//overridden method
	public String toString()
	{
		String total = super.toString() + "\nSalary: " + 
				mySalary + "\nDepartment: " + myDepartment
				+ "\nRoster (last names): ";
		for(Student s : myRoster)
		{
			total = total + s.getLastName() + ", ";
		}
		
		return total;
	}
	
}
