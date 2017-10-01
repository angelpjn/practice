import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage; 

class MyGUI extends JFrame {
	BufferedImage image;

	public MyGUI( ) {
		setTitle("JPanel�� �̹����� paint");  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��
		setSize(100, 150);
		setVisible(true); // ȭ�鿡 ���̱�, �������� ������ �� paint�� ȣ��
	}

	class MyPanel extends JPanel {
		// swing������ paint( ) ���� paintComponent( ) ����Ͽ� �׸��� ����
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // �׻� ȣ��
			g.drawRect(10, 10, 50, 60);		
		}
	}
}

public class E1201 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}