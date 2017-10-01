import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;


class MyGUI extends JFrame {
	BufferedImage image;

	public MyGUI( ) {
		setTitle("JPanel�� �̹����� paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��
		setSize(300, 200);
		setVisible(true); // ȭ�鿡 ���̱�, �������� ������ �� paint�� ȣ��
	}

	class MyPanel extends JPanel {
		// swing������ paint( ) ���� paintComponent( ) ����Ͽ� �׸��� ����
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // �׻� ȣ��
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