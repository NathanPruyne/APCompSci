
public class HomeworkTests {

	public static void main(String[] args) {
		
		String name1 = "Franklin Delano Roosevelt";
		int blank1 = name1.indexOf(" ");
		int blank2 = name1.substring(blank1 + 1).indexOf(" ");
		name1 = name1.substring(blank1 + 1, blank1 + 1 + blank2);
		System.out.println(name1 + "*");
		
	}
	
}
