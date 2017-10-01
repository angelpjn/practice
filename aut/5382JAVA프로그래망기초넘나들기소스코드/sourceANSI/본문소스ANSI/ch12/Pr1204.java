import java.awt.*;
import javax.swing.J*;

class MyFrame extends JFrame {
	public MyFrame( ) {
		setTitle("graphic �׸���");
		setContentPane(new MyPanel( ));  // �� �г� �̿��Ͽ� �׷��� ó��

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		int[ ] x = { 200, 220, 250 };
		int[ ] y = { 10, 50, 50 };
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.PINK);
			g.fillOval(10, 10, 50, 50); // (10,10)���� (50,50)�� �簢���� �����ϴ� Ÿ��
			g.drawLine(65, 10, 80, 50); // (65,10)���� (80,50)������ ��
			g.drawRect(85, 10, 30, 40); // (85,10)���� (30,40) ũ���� �簢��
			g.fillRect(120, 10, 40, 45); // �������� ĥ�� �簢��
			g.fillArc(160, 10, 30, 40, 0, 275); // ���� 0������ 275�� ��ŭ ��ȣ �׸���
			g.fillPolygon(x, y, 3); // �ٰ���
		}
	}
}

public class Pr1204 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}