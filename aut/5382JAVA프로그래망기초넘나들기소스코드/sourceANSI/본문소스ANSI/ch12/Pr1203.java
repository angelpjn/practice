import java.awt.*;
import javax.swing.*;

class MyGUI extends JFrame {

	public MyGUI( ) {
		setTitle("Hello World Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리                add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리

		setSize(300, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 항상 호출
			g.drawRect(10, 10, 80, 80);
			g.drawString("Study Java!", 100, 100);

			System.out.println("Inside paintComponent");
			int width = getWidth( ) / 4; // 폭 축소
			int height = getHeight( ) / 4; // 높이 축소
			g.setColor(Color.RED);
			g.drawOval(100, 10, width, height);
		}
	}
}

public class Pr1203 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}