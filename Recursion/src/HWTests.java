
public class HWTests {

	public static void mystery8(String sWord){
		int nL = sWord.length();
		if(nL >= 3)
		{
			mystery8(sWord.substring(0,nL/3));
			System.out.println(sWord.substring(nL/3,2*nL/3));
			mystery8(sWord.substring(2*nL/3));
			//substring(x) same as substring(x,length())

		}
	}
	
	public static void main(String[] args) {
		mystery8("la-la-la");
	}
}
