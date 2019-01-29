/*
 * Name: Nathan Pruyne
 * Date: 1/23/19
 * Project: A program to make bubbles rain from the ceiling.  We will adjust it as we go.
 * Updated: A game where the object is to score points by running into good bubbles, avoid bad ones
 * 
 * 
 *  We have provided you with some working code. With a partner, look through
 *  the code to determine what is happening. Document your findings within the
 *  code. We will make MANY changes to this and it is important to know what is
 *  happening before we do.
 *  
 */

import java.awt.*; //Contains all classes for creating graphics
import java.applet.*; //Enables the creation of an "applet"
import java.awt.event.ActionEvent; //Utility to create various events
import java.awt.event.ActionListener; //Utility to recieve action events
import java.awt.event.KeyEvent; //Utility to detect keypresses
import java.awt.event.KeyListener; //Utility to do things when keypress detected
import java.awt.geom.Ellipse2D; //Utility to generate ellipses
import java.awt.geom.Rectangle2D; //Utility to generate rectangles
import java.util.ArrayList;
import java.awt.Graphics2D; //utility to generate geometrical shapes

import javax.swing.Timer; //Utility to fire ActionEvents at regular intervals

public class RainingBubbles extends Applet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//constants to control size, speed, number of circles...
	private final int DELAY = 30;
	private final int MAX_SIZE = 50;
	private final int MAX_CIRCLES = 10;
	private final int MAX_Y_VELOCITY = 10;
	private final int MAX_X_VELOCITY = 10;
	
	private Bubble[] bubbles;
	
	
	//instance fields to keep track of player movement, score
	private int playerX;
	private int playerY;
	private int playerdX;
	private int playerdY;
	private int score;
	
	//ArrayList to keep track of keys that have been pressed
	ArrayList<Integer> keys = new ArrayList<Integer>();

	public void init() 
	{
		//What is the purpose of this method?  State as a comment under this line.
		//Initializes the screen and generates the circles.
		//Document this...what's going on in each line?...
		this.resize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
					(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		//sets the screen size to the set default screen size
		bubbles = new Bubble[MAX_CIRCLES]; //uses new array of type bubble
		boolean good = true;
		//initializes player position
		playerX = this.getWidth() / 2;
		playerY = this.getHeight() / 4 * 3;
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			bubbles[count] = new Bubble(this.getWidth(), this.getHeight(), MAX_Y_VELOCITY, MAX_X_VELOCITY, MAX_SIZE, good);//creates new bubble objects
			good = !good; //makes it so half the bubbles are "good", half are not
		}
		
		//I needed this to use "repaint" the screen. It uses a timer which is "listenedTo" by an ActionListener
		ActionListener taskPerformer = new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				repaint();
			}
		};
		
		
		//Initializes a KeyListener to detect keypresses, add them to keys ArrayList
		KeyListener keyDetector = new KeyListener()
		{
			public void keyPressed(KeyEvent press) {
				if (!keys.contains(press.getKeyCode())) {
					keys.add(press.getKeyCode());
				}
			}

			public void keyReleased(KeyEvent release) {
				keys.remove(keys.indexOf(release.getKeyCode()));
			}

			public void keyTyped(KeyEvent arg0) {}
		};
		
		//Adds keyDetector to the applet
		this.addKeyListener(keyDetector);
		
		new Timer(DELAY, taskPerformer).start();
		
	}
		
	//This method is to "double buffer".  If it wasn't here,
	//the animations would flicker.  No need to modify/comment anything
	//in this method.
	public void update(Graphics g)
	{
		Graphics offgc;
		Image offscreen = null;
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		offscreen = createImage(d.width, d.height);
		offgc = offscreen.getGraphics();
		
		offgc.setColor(getBackground());
		offgc.fillRect(0,0,d.width,d.height);
		offgc.setColor(getForeground());
		
		paint(offgc);
		
		g.drawImage(offscreen, 0, 0, this);
		
	}
	
	public void paint(Graphics g) 
	{	
		//Initializes types of variables
		Ellipse2D circle;
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D player;
		player = new Rectangle2D.Double(playerX, playerY, 20, 20);
		//Updates player movement based on keys in the keys ArrayList
		//Key presses will update player's movement speed, not position
		if (keys.contains(KeyEvent.VK_LEFT)) {
			playerdX -= 2;
		}
		if (keys.contains(KeyEvent.VK_RIGHT)) {
			playerdX += 2;
		}
		if (keys.contains(KeyEvent.VK_UP)) {
			playerdY -= 2;
		}
		if (keys.contains(KeyEvent.VK_DOWN)) {
			playerdY += 2;
		}
		playerX += playerdX;
		playerY += playerdY;
		//Prevents the player from going off the screen
		if (playerY < 0) {
			playerY = 0;
			playerdY = 0;
		}
		if (playerY > this.getHeight() - 20) {
			playerY = this.getHeight() - 20;
			playerdY = 0;
		}
		if (playerX < 0) {
			playerX = 0;
			playerdX = 0;
		}
		if (playerX > this.getWidth() - 20) {
			playerX = this.getWidth() - 20;
			playerdX = 0;
		}
		//Adds "friction" to slow the player down over time
		if (Math.abs(playerdX) < 1) {
			playerdX = 0;
		} else if (playerdX > 0) {
			playerdX -= 1;
		} else if (playerdX < 0) {
			playerdX += 1;
		}
		if (Math.abs(playerdY) < 1) {
			playerdY = 0;
		} else if (playerdY > 0) {
			playerdY -= 1;
		} else if (playerdY < 0) {
			playerdY += 1;
		}
		
		//Document this...what's going on in each line?... there should be a comment for each line.
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			Bubble thisBubble = bubbles[count]; //finds the bubble in the list
			thisBubble.addY(); //update y by yvelocity
			thisBubble.addX(); //update x by xvelocity
			
			if(thisBubble.getY()>this.getHeight() - thisBubble.getSize() || thisBubble.getY() < 0)  //if the circle's y is off the screen
			{
				thisBubble.setyVelocity(thisBubble.getyVelocity() * -1); //bounce
			}
			if(thisBubble.getX()>this.getWidth() - thisBubble.getSize() || thisBubble.getX() < 0)  //if the circle's y is off the screen
			{
				thisBubble.setxVelocity(thisBubble.getxVelocity() * -1); //bounce
			}
			if (thisBubble.isGood()) { //if this bubble is "good"
				g2.setPaint(Color.green); //set the color to green
			} else {
				g2.setPaint(Color.red); //otherwise make it red
			}
			circle = new Ellipse2D.Double(thisBubble.getX(), thisBubble.getY(), thisBubble.getSize(), thisBubble.getSize()); //generate the circle graphically	
			if (circle.intersects(player)) { //If the bubble is touching the player
				score += thisBubble.getScore(); //Add the bubbles score to the score
				if (score < 0) { //Avoid a negative score
					score = 0;
				}
				thisBubble.reset(this.getWidth(), this.getHeight(), MAX_Y_VELOCITY, MAX_X_VELOCITY, MAX_SIZE, thisBubble.isGood());	//Reset the bubble with new velocity and size
			}
			g2.fill(circle); //display the circle on the screen
			g2.setFont(new Font("Arial", Font.PLAIN, 12));
			g2.setPaint(Color.black);
			g2.drawString(Integer.toString(thisBubble.getScore()), thisBubble.getX() + thisBubble.getSize() / 3, thisBubble.getY()); //Labels the bubble with its score
		}
		g2.setPaint(Color.orange);
		g2.fill(player); //Fills in the player
		g2.setFont(new Font("Arial", Font.BOLD, 35));
		g2.setPaint(Color.black);
		g2.drawString("Score: " + score, 25, 40); //Displays the score
	}
}

/*FINALLY - change this to make it your own.  Make different colors (randomize it, if you want). 
 *  Change the starting spot of the bubbles.  Change the size.  Do something to make it your own.  
 *  Try to make some kind of video game out of it (I'm thinking pong...).  */

