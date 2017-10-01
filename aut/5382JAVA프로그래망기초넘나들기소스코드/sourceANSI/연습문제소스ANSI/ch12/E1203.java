import java.awt.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D; 

class MyGUI extends JFrame {	
	public MyGUI( ) {
		setTitle("JPanel에 이미지로 paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리

		setSize(300, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paint(Graphics g) {
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			Font font = new Font("Serif", Font.PLAIN, 24);
			g2d.setFont(font);
			g2d.drawString("Text", 10, 20);
			g2d.drawRect(70, 10, 50, 40);
			g2d.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND,
					BasicStroke.JOIN_ROUND));
			g2d.setColor(Color.CYAN);
			g2d.draw(new Rectangle2D.Double(200, 10, 50, 40));
			
			float[ ] dashPattern = { 20, 5, 10, 5 }; // dash, space, dash, space
			g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_BUTT,
					BasicStroke.JOIN_ROUND, 10, dashPattern, 0));
			g2d.setColor(Color.CYAN);
			g2d.draw(new Rectangle2D.Double(130, 10, 50, 40));
		}
	};
}
public class E1203 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}