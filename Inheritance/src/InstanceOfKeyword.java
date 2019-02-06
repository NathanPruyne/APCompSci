import java.util.ArrayList;
public class InstanceOfKeyword 
{

	public static void main(String[] args) 
	{
		ArrayList<Human> somePeople = new ArrayList<Human>();
		
		for(int i = 0; i < 8; i++)
		{
			int rand = (int)(Math.random()*3);
			if(rand == 0)
			{
				somePeople.add(new Human());
			}
			
			else if(rand == 1)
			{
				somePeople.add(new Student());
			}
			else
			{
				somePeople.add(new Teacher());
			}
		}
		
		somePeople.get(0).doSomething();
		//System.out.println(((Student) somePeople.get(3)).getGPA()); //OK, but will fail often
		if (somePeople.get(3) instanceof Student) { //instanceof makes sure that it is a Student first
			System.out.println(((Student) somePeople.get(3)).getGPA());
		}
		
	}

}


