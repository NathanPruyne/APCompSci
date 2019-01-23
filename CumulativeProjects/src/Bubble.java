
public class Bubble {

	private int x;
	private int y;
	private int yVelocity;
	private int size;
	
	public Bubble(int width, int max_vel, int max_size) {
		y = 0;
		x = (int)(Math.random()*width);
		yVelocity = (int)(Math.random() * max_vel)+2;	
		size = (int)(Math.random()* max_size);
	}
	
	public void reset(int width, int max_vel, int max_size) {
		y = 0;
		x = (int)(Math.random()*width);
		yVelocity = (int)(Math.random() * max_vel)+2;	
		size = (int)(Math.random()* max_size);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void addY() {
		y += yVelocity;
	}
	
	public int getyVelocity() {
		return yVelocity;
	}
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
