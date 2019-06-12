
import javax.swing.JFrame;

public class Frame{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame");  								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setSize(1000, 1000);		
		Spongebob r = new Spongebob();
		frame.add(r);

		frame.setVisible(true);

	}
}
