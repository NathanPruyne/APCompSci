
public class CodingBatPractice {
	
	public static boolean endsLy(String str) {
		String last2 = str.substring(str.length() - 2);
		System.out.println(last2);
		  if (str.length() < 2) {
			System.out.println("Too short");
		    return false;
		  } else if (last2 == "ly") {
		    return true;
		  } else {
			System.out.println("bad");
		    return false;
		  }
		}

	public static void main(String[] args) {
		String str = "oddly";
		System.out.println(str.substring(str.length() - 2));
		System.out.println(endsLy("oddly"));
	}

}
