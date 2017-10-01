import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

class MyGUI extends JFrame {
	BufferedImage image;

	public MyGUI( ) {
		setTitle("JPanel에 이미지로 paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			image = ImageIO.read(new File("c:/work/image/sunset.jpg"));
		} catch (IOException e) {
			e.printStackTrace( );
		}

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리
		setSize(300, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 항상 호출
			g.drawImage(image, 10, 10, null);
			g.drawRect(170, 10, 50, 60);
			repaint( ); // repaint( )->update( )->(usually calls)-> paint( ), 다시 그리기
		}
	}
}

public class Pr1202 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}