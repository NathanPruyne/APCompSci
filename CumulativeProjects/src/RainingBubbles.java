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
	private final int MAX_CIRCLES = 100;
	private final int MAX_VELOCITY = 20;
	
	//these are called "parallel arrays." Is there a better way to handle all
	//of this data?  Hint... these could all be ATTRIBUTES of a certain class.  Make that class and 
	//create a single array of that object.
	
	private Bubble[] bubbles;

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
		
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			bubbles[count] = new Bubble(this.getWidth(), MAX_VELOCITY, MAX_SIZE);//gives each circle initial values by "resetting" it
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
		
		//Document this...what's going on in each line?... there should be a comment for each line.
		for(int count = 0;count < MAX_CIRCLES; count++)
		{
			Bubble thisBubble = bubbles[count];
			thisBubble.addY(); //update y by yvelocity
			
			if(thisBubble.getY()>this.getHeight()) //if the circle's y is off the screen
			{
				thisBubble.reset(this.getWidth(), MAX_VELOCITY, MAX_SIZE); //reset the circle
			}
	
			g2.setPaint(Color.blue); //set the color to blue
			circle =new Ellipse2D.Double(thisBubble.getX(), thisBubble.getY(), thisBubble.getSize(), thisBubble.getSize()); //generate the circle graphically	
			g2.fill(circle); //display the circle on the screen
					
		}
	}
}

/*FINALLY - change this to make it your own.  Make different colors (randomize it, if you want). 
 *  Change the starting spot of the bubbles.  Change the size.  Do something to make it your own.  
 *  Try to make some kind of video game out of it (I'm thinking pong...).  */

