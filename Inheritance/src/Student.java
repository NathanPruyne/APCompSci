import java.util.ArrayList;

public class Student extends Human 
{
	private double myGPA;
	private ArrayList<Course> mySchedule;
	
	public Student(String fName, String lName, int age,
			double GPA, Course c)
	{
		super(fName, lName, age);
		myGPA = GPA;
		mySchedule = new ArrayList<Course>();
		mySchedule.add(c);
	}
	
	public Student()
	{
		this("Saira", "Student", 15, 0.0, new Course());
	}
	
	public void addCourse(Course newCourse)
	{
		mySchedule.add(newCourse);
	}
	
	public void dropCourse(Course newCourse)
	{
		mySchedule.remove(newCourse);
	}
	
	
	public double getGPA()
	{
		return myGPA;
	}
	
	//overridden method:
	public void doSomething()
	{
		int rand = (int)(Math.random()*mySchedule.size());
		Course randomCourse = mySchedule.get(rand);
		
		System.out.println(this.getFirstName() + " studies " + 
			randomCourse.getName() + "!");
	}
	
	//overridden method:
	public String toString()
	{
		String total = super.toString() + "\nGPA: " + myGPA
				+ "\nCourses: ";
		for(Course c : mySchedule)
			total += c.getName() + ", ";
		
		return total;
	}
	
}

