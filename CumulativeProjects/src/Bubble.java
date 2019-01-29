
public class Bubble {

	private int x;
	private int y;
	private int yVelocity;
	private int xVelocity;
	private int size;
	private boolean good;
	private int score;
	
	public Bubble(int width, int height, int max_y_vel, int max_x_vel, int max_size, boolean good) {
		this.reset(width, height, max_y_vel, max_x_vel, max_size, good);
	}
	
	public void reset(int width, int height, int max_y_vel, int max_x_vel, int max_size, boolean good) {
		y = (int)(Math.random() * height) / 8 + height * 7 / 16;
		x = (int)(Math.random()*width) / 8 + width * 7 / 16;
		yVelocity = 0;
		xVelocity = 0;
		while (yVelocity == 0 && xVelocity == 0) {
			yVelocity = (int)(Math.random() * max_y_vel * 2) - max_y_vel;
			xVelocity = (int)(Math.random() * max_x_vel * 2) - max_x_vel;
		}
		size = (int)(Math.random()* (max_size - 20)) + 20;
		this.setGood(good);
		if (good) {
			score = (int) (Math.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2))) * (max_size - size) / 10 + 1;
		} else {
			score = (int) (Math.sqrt(max_x_vel * max_x_vel + max_y_vel * max_y_vel) - Math.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2))) * (size) / -10 - 1;
		}
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
	
	public void addX() {
		x += xVelocity;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public int getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}

	public boolean isGood() {
		return good;
	}

	public void setGood(boolean good) {
		this.good = good;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
