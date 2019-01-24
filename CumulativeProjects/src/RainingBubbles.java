/*
 * Name: Nathan Pruyne
 * Date: 1/23/19
 * Project: A program to make bubbles rain from the ceiling.  We will adjust it as we go.
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
import java.awt.geom.Ellipse2D; //Utility to generate ellipses
import java.awt.geom.Rectangle2D;
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
	
	//these are called "parallel arrays." Is there a better way to handle all
	//of this data?  Hint... these could all be ATTRIBUTES of a certain class.  Make that class and 
	//create a single array of that object.
	
	private Bubble[] bubbles;
	
	private int playerX;
	private int playerY;

	public void init() 
	{
		//What is the purpose of this method?  State as a comment under this line.
		//Initializes the screen and generates the circles.
		//Document this...what's going on in each line?...
		this.resize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
					(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		//sets the screen size to the set default screen size
		//again, change these parallel arrays to make them better.
		bubbles = new Bubble[MAX_CIRCLES];
		boolean good = true;
		playerX = this.getWidth() / 2;
		playerY = this.getHeight() / 4 * 3;
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			bubbles[count] = new Bubble(this.getWidth(), this.getHeight(), MAX_Y_VELOCITY, MAX_X_VELOCITY, MAX_SIZE, good);//gives each circle initial values by "resetting" it
			good = !good;
		}
		
		//I needed this to use "repaint" the screen. It uses a timer which is "listenedTo" by an ActionListener
		ActionListener taskPerformer = new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				repaint();
			}
		};
		
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
		Ellipse2D circle;
		Graphics2D g2 = (Graphics2D)g;
		Rectangle2D player;
		
		player = new Rectangle2D.Double(playerX, playerY, 20, 20);
		
		//Document this...what's going on in each line?... there should be a comment for each line.
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			Bubble thisBubble = bubbles[count];
			thisBubble.addY(); //update y by yvelocity
			thisBubble.addX(); //update x by xvelocity
			
			if(thisBubble.getY()>this.getHeight() || thisBubble.getY() < 0)  //if the circle's y is off the screen
			{
				thisBubble.setyVelocity(thisBubble.getyVelocity() * -1); //bounce
			}
			if(thisBubble.getX()>this.getWidth() || thisBubble.getX() < 0)  //if the circle's y is off the screen
			{
				thisBubble.setxVelocity(thisBubble.getxVelocity() * -1); //bounce
			}
			if (thisBubble.isGood()) { //if this bubble is "good"
				g2.setPaint(Color.green); //set the color to green
			} else {
				g2.setPaint(Color.red);
			}
			circle = new Ellipse2D.Double(thisBubble.getX(), thisBubble.getY(), thisBubble.getSize(), thisBubble.getSize()); //generate the circle graphically	
			if (circle.intersects(player)) {
				thisBubble.reset(this.getWidth(), this.getHeight(), MAX_Y_VELOCITY, MAX_X_VELOCITY, MAX_SIZE, thisBubble.isGood());
			}
			g2.fill(circle); //display the circle on the screen
			System.out.println(playerX);
			g2.setPaint(Color.orange);
			g2.fill(player);
		}
	}
}

/*FINALLY - change this to make it your own.  Make different colors (randomize it, if you want). 
 *  Change the starting spot of the bubbles.  Change the size.  Do something to make it your own.  
 *  Try to make some kind of video game out of it (I'm thinking pong...).  */

