
public class MathMethods {
	
	public static double herons(double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	public static double slope(double x1, double y1, double x2, double y2) {
		return (y2 - y1)/(x2 - x1);
	}
	
	public static int randInt(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}
	
	public static double coneVolume(double radius, double height) {
		return 1.0 / 3 * Math.PI * Math.pow(radius, 2) * height;
	}
	
	public static void main(String[] args) {	
		/* double area, side1 = 3, side2 = 4, side3 = 5;
		
		area = herons(side1, side2, side3);
		
		System.out.println("Area: " + area); 
		
		double slope, x1 = 2, y1 = 2, x2 = 4, y2 = 7;
		
		slope = slope(x1, y1, x2, y2);
		
		System.out.println("Slope: " + slope); 
		
		for (int i = 0; i < 50; i++)  {
			System.out.println(randInt(20, 100));
		} */
		
		System.out.println(coneVolume(2,3));
		
	}
}
