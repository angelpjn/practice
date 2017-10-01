import java.awt.*;
import javax.swing.J*;

class MyFrame extends JFrame {
	public MyFrame( ) {
		setTitle("graphic 그리기");
		setContentPane(new MyPanel( ));  // 새 패널 이용하여 그래픽 처리

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
			g.fillOval(10, 10, 50, 50); // (10,10)에서 (50,50)의 사각형에 내접하는 타원
			g.drawLine(65, 10, 80, 50); // (65,10)에서 (80,50)까지의 선
			g.drawRect(85, 10, 30, 40); // (85,10)에서 (30,40) 크기의 사각형
			g.fillRect(120, 10, 40, 45); // 배경색으로 칠한 사각형
			g.fillArc(160, 10, 30, 40, 0, 275); // 각도 0도부터 275도 만큼 원호 그리기
			g.fillPolygon(x, y, 3); // 다각형
		}
	}
}

public class Pr1204 {
	public static void main(String[ ] args) {
		new MyFrame( );
	}
}