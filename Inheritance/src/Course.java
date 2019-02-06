
public class Course 
{
	private String myName;
	private int myPeriod;
	private String myDepartment;
	
	public Course(String name, int period, String department) 
	{
		this.myName = name;
		this.myPeriod = period;
		this.myDepartment = department;
	}
	
	public Course()
	{
		this("AP Computer Science", 0, "Math");
	}
	
	public String getName() 
	{
		return myName;
	}
	public void setName(String myName) 
	{
		this.myName = myName;
	}
	public int getMyPeriod() 
	{
		return this.myPeriod;
	}
	public void setPeriod(int myPeriod) 
	{
		this.myPeriod = myPeriod;
	}
	public String getDepartment() 
	{
		return this.myDepartment;
	}
	public void setDepartment(String myDepartment) 
	{
		this.myDepartment = myDepartment;
	}
	
	public String toString() 
	{
		return "Course Name: " + myName + "\nPeriod: " + 
				myPeriod + "\nDepartment: " + myDepartment;
	}
	
}
