import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Polygon;
import javax.swing.JComponent;
import javax.swing.JFrame;

/*
A class that draws an alien face.
*/
public class FaceComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double body = new Ellipse2D.Double(50, 50, 150, 150);
		
		g2.setColor(new Color(204, 146, 96));
		g2.fill(body);
		
		Ellipse2D.Double wing = new Ellipse2D.Double(50, 105, 20, 80);
		
		g2.setColor(new Color(159, 114, 75));
		g2.fill(wing);
		
		wing.setFrame(180, 105, 20, 80);
		g2.fill(wing);
		
		// Create the head
		Ellipse2D.Double head = new Ellipse2D.Double(75, 30, 100, 100);
		
		//Draw the head
		g2.fill(head);
		
		// Change the color of the upcoming "draw command" to black, to make the eyes black
		g2.setColor(Color.WHITE);
		
		//Create the left eye
		Ellipse2D.Double eye = new Ellipse2D.Double(95, 60, 15, 15);
		
		//Draw the left eye
		g2.fill(eye);
		
		//Move the left eye over so it becomes the right eye
		eye.setFrame(145, 60, 15, 15);
		
		//Draw the right eye
		g2.fill(eye);
		
		Ellipse2D.Double innerEye = new Ellipse2D.Double(98, 63, 10, 10);
		
		g2.setColor(Color.BLACK);
		
		g2.fill(innerEye);
		
		innerEye.setFrame(148, 63, 10, 10);
		
		g2.fill(innerEye);
		
		// Create the mouth
		int[] xPtsMouth = {115, 135, 125};
		int[] yPtsMouth = {90, 90, 110};
		Polygon mouth = new Polygon(xPtsMouth, yPtsMouth, 3);
		
		//change the color of the mouth to yellow, and then draw it
		g2.setColor(Color.YELLOW);
		g2.fill(mouth);
		
		Ellipse2D.Double hatBrim = new Ellipse2D.Double(75, 30, 100, 20);
		
		g2.setColor(Color.BLACK);
		g2.fill(hatBrim);
		
		Rectangle hat = new Rectangle(85, 10, 80, 30);
		
		g2.fill(hat);
		
		//Rectangle leg = new Rectangle(95, 190, 5, 25);
		
		int[] xPtsLeg = {95, 95, 90, 98, 100, 102, 110, 105, 105};
		int[] yPtsLeg = {190, 215, 225, 215, 225, 215, 225, 215, 190};
		Polygon leftLeg = new Polygon(xPtsLeg, yPtsLeg, 9);
		
		g2.setColor(Color.YELLOW.darker());
		
		g2.fill(leftLeg);
		
		for (int i = 0; i < 9; i++) {
			xPtsLeg[i] += 50;
		}
		
		Polygon rightLeg = new Polygon(xPtsLeg, yPtsLeg, 9);
		
		g2.fill(rightLeg);
		
		// Draw the greeting
		g2.setColor(Color.BLACK);
		g2.drawString("Happy Thanksgiving!", 80, 250);
	}
	
	//For this project, you will not need to change this main method at all!  
	public static void generate()
	{
		JFrame frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(300, 300);
		frame.setTitle("Thanksgiving Turkey!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}