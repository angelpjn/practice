import java.awt.*;
import javax.swing.*;

class MyGUI extends JFrame {
	public MyGUI( ) {
		setTitle("JPanel�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��
		setSize(100, 150);
		setVisible(true); // ȭ�鿡 ���̱�, �������� ������ �� paint�� ȣ��
	}

	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("c:/work/image/tulip.jpg");
		Image image = icon.getImage( ); // �̹��� ��ü

		// swing������ paint( ) ���� paintComponent( ) ����Ͽ� �׸��� ����
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // �׻� ȣ��
			g.drawImage(image, 10, 7, this); // (10,7) ��ġ�� �̹��� �׸���
		}
	}
}

public class Pr1206 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}