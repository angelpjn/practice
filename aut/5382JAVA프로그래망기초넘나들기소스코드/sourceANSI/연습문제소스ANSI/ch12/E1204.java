import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
class MyGUI extends JFrame {
	public MyGUI( ) {
		setTitle("JPanel�� �̹����� paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��

		this.addMouseListener(new MouseAdapter( ) {
			public void mouseClicked(MouseEvent e) {
				// clickPoint = e.getPoint( );
				repaint( ); // �ٽ� �׸���, �ڵ����� paint( )�� ȣ��
			}
		});
		
		setSize(300, 150);
		setVisible(true); // ȭ�鿡 ���̱�, �������� ������ �� paint�� ȣ��
	}

	class MyPanel extends JPanel {
		public void paint(Graphics g) {
			g.setColor(Color.GREEN);
			g.drawRect(0, 0, getSize( ).width - 1, getSize( ).height - 1);
			// if (clickPoint != null)
			// g.fillOval(clickPoint.x - RADIUS, clickPoint.y - RADIUS,
			// RADIUS * 2, RADIUS * 2);
		}
	}
}

public class E1204 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}