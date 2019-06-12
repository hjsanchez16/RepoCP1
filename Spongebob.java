/**
 * Spongebob
 *
 * @author (Haydee Sanchez)
 * @version (1)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Spongebob extends JComponent
{
    public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
        	g2.setColor(Color.yellow);

		Rectangle head = new Rectangle(400, 200, 350, 300);
		g2.fill(head);
                g2.draw(head);

        g2.setColor(Color.white);
	Ellipse2D.Double eye = new Ellipse2D.Double(450, 250, 100, 100);
	Ellipse2D.Double eye2 = new Ellipse2D.Double(600, 250, 100, 100);
		g2.draw(eye);
                g2.draw(eye2);
                g2.fill(eye);
                g2.fill(eye2);
	
	g2.setColor(Color.black);
	Ellipse2D.Double eye3 = new Ellipse2D.Double(475, 275, 50, 50);
	Ellipse2D.Double eye4 = new Ellipse2D.Double(620, 275, 50, 50);
		g2.draw(eye3);
                g2.draw(eye4);
                g2.fill(eye3);
                g2.fill(eye4);

	g2.setColor(Color.red);
	Ellipse2D.Double mouth = new Ellipse2D.Double(500, 350, 150, 100);
		g2.draw(mouth);
                g2.fill(mouth);

	g2.setColor(Color.yellow);	
	Rectangle up = new Rectangle(500, 350, 150, 50);
		g2.fill(up);
                g2.draw(up);

	g2.setColor(Color.black);
	// draw Arc2D.Double
	g2.draw(new Arc2D.Double(560, 315,
                         25,
                         75,
                         180, 360,
                         Arc2D.OPEN));

	g2.setColor(Color.yellow);	
	Rectangle up2 = new Rectangle(550, 300, 50, 25);
		g2.fill(up2);
                g2.draw(up2);

	g2.setColor(Color.white);	
	Rectangle tooth = new Rectangle(550, 400, 20, 25);
		g2.fill(tooth);
                g2.draw(tooth);	
	Rectangle tooth2 = new Rectangle(575, 400, 20, 25);
		g2.fill(tooth2);
                g2.draw(tooth2);
	

	g2.setColor(Color.orange);
	Ellipse2D.Double spot = new Ellipse2D.Double(400, 200, 50, 50);
		g2.draw(spot);
                g2.fill(spot);
	Ellipse2D.Double spot2 = new Ellipse2D.Double(700, 200, 50, 50);
		g2.draw(spot2);
                g2.fill(spot2);
	Ellipse2D.Double spot3 = new Ellipse2D.Double(700, 400, 50, 50);
		g2.draw(spot3);
                g2.fill(spot3);
	Ellipse2D.Double spot4 = new Ellipse2D.Double(650, 450, 50, 50);
		g2.draw(spot4);
                g2.fill(spot4);
	Ellipse2D.Double spot5 = new Ellipse2D.Double(425, 450, 50, 50);
		g2.draw(spot5);
                g2.fill(spot5);
	



 
    }
}
		

