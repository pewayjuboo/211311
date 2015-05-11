import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvars extends JComponent{
	public void paint(Graphics g){
		g.drawOval(20, 20, 200, 200);
	}
}
public class DrawOval{
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setBounds(30,30,300,300);
		window.getContentPane().add(new MyCanvars());
		window.setVisible(true);

	}

}
