import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


class MyGUI extends JFrame {
	BufferedImage image;

	public MyGUI( ) {
		setTitle("JPanel에 이미지로 paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리
		setSize(300, 200);
		setVisible(true); // 화면에 보이기, 프레임이 보여질 때 paint가 호출
	}

	class MyPanel extends JPanel {
		// swing에서는 paint( ) 보다 paintComponent( ) 사용하여 그리기 권장
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 항상 호출
			Graphics2D g2d = (Graphics2D) g; 

			g2d.setPaint(Color.GREEN);
			g2d.fill(new Ellipse2D.Double(5, 30, 65, 100));

			// draw 2D rectangle in red
			g2d.setPaint(Color.RED);
			g2d.setStroke(new BasicStroke(10.0f));
			g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

			int w = getWidth( ) / 2;
			int h = getHeight( ) / 2;
			g2d.setPaint(Color.DARK_GRAY);
			g2d.setStroke(new BasicStroke(0)); // thick
			g2d.drawLine(70, 30, w, h);
		}
	}
}

public class E1206 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}