
public class ComplexNumber {

	private int myA;
	private int myB;
	
	public ComplexNumber(int a, int b) {
		myA = a;
		myB = b;
	}
	
	public ComplexNumber add(ComplexNumber cNum) {
		int newA = myA + cNum.getA();
		int newB = myB + cNum.getB();
		return new ComplexNumber(newA, newB);
	}
	
	public ComplexNumber multiply(ComplexNumber cNum) {
		int newA = myA * cNum.getA() - myB * cNum.getB();
		int newB = myA * cNum.getB() + myB * cNum.getA();
		return new ComplexNumber(newA, newB);
	}
	
	public int getA() {
		return myA;
	}
	
	public int getB() {
		return myB;
	}
	
}
