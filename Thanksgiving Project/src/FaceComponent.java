import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
A class that draws an alien face.
*/
public class FaceComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Create the head
		Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
		
		//Draw the head
		g2.setColor(new Color(159, 114, 75));
		g2.fill(head);
		
		// Change the color of the upcoming "draw command" to green, to make the eyes green
		g2.setColor(Color.BLACK);
		
		//Create the left eye
		Ellipse2D.Double eye = new Ellipse2D.Double(25, 70, 15, 15);
		
		//Draw the left eye
		g2.fill(eye);
		
		//Move the left eye over so it becomes the right eye
		eye.setFrame(75, 70, 15, 15);
		
		//Draw the right eye
		g2.fill(eye);
		
		// Create the mouth
		int[] xPts = new int[]{45, 65, 45};
		int[] yPts = new int[]{110, 120, 130};
		Polygon mouth = new Polygon(xPts, yPts, 3);
		
		//change the color of the mouth to red, and then draw it
		g2.fill(mouth);
		
		// Draw the greeting
		g2.setColor(Color.ORANGE);
		g2.drawString("Happy Thanksgiving!", 5, 175);
	}
	
	//For this project, you will not need to change this main method at all!  
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setBackground(Color.white);
		frame.setSize(150, 250);
		frame.setTitle("An Alien Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}