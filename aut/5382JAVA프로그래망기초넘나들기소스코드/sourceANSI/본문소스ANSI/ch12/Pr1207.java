import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class MyGUI extends JFrame {
	// BMP, PNG ���� �̹��� �ε�, ImageIcon���� �ε� �Ұ�, �� ��ġ �߿�
	// ImageIcon���δ� gif, jpg ���� �̹��� �ε�
	URL imgURL = new File("c:/work/image/tmp.png").toURI( ).toURL( );
	Image image = new ImageIcon(imgURL).getImage( );

	public MyGUI( ) throws MalformedURLException {
		setTitle("JPanel�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��
		setSize(200, 150);
		setVisible(true); // ȭ�鿡 ���̱�, �������� ������ �� paint�� ȣ��
	}

	class MyPanel extends JPanel {
		// ImageIcon���δ� gif, jpg ���� �̹��� �ε�
		ImageIcon icon = new ImageIcon("c:/work/image/tulip.jpg");
		Image image2 = icon.getImage( ); // �̹��� ��ü
		// swing������ paint( ) ���� paintComponent( ) ����Ͽ� �׸��� ����
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // �׻� ȣ��
			g.drawImage(image, 10, 7, this); // (10,7) ��ġ�� �̹��� �׸���
			g.drawImage(image2, 100, 7, this); // (10,7) ��ġ�� �̹��� �׸���
		}
	}
}

public class Pr1207 {
	public static void main(String[ ] args) throws MalformedURLException {
		new MyGUI( );
	}
}