import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class MyGUI extends JFrame {
	BufferedImage image;

	public MyGUI( ) {
		setTitle("JPanel�� �̹����� paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			image = ImageIO.read(new File("c:/work/image/sunset.jpg"));
		} catch (IOException e) {
			e.printStackTrace( );
		}

		// setContentPane(new MyPanel( )); // �� �г� �̿��Ͽ� �׷��� ó��
		add(new MyPanel( )); // �� ����� ����, �� �г� �̿��Ͽ� �׷��� ó��
		setSize(300, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // �׻� ȣ��
			g.drawImage(image, 10, 10, null);
			g.drawRect(170, 10, 50, 60);
			repaint( ); // repaint( )->update( )->(usually calls)-> paint( ), �ٽ� �׸���
		}
	}
}

public class Pr1202 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}