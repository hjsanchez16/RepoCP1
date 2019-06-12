import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Sponge extends JComponent

		public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.yellow);

        
		draw Rectangle2D.Double
		g2.draw(new Rectangle2D.Double(100, 100, 100, 100));
		g2.setColor(Color.yellow);

		g2.draw(c);

		Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 100, 100);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(250, 50, 100, 100);
		g2.fill(circle);
		g2.fill(circle2);
		
	}
}
