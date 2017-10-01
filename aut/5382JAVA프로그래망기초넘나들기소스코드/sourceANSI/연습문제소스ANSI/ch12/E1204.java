import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
class MyGUI extends JFrame {
	public MyGUI( ) {
		setTitle("JPanel에 이미지로 paint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리

		this.addMouseListener(new MouseAdapter( ) {
			public void mouseClicked(MouseEvent e) {
				// clickPoint = e.getPoint( );
				repaint( ); // 다시 그리기, 자동으로 paint( )가 호출
			}
		});
		
		setSize(300, 150);
		setVisible(true); // 화면에 보이기, 프레임이 보여질 때 paint가 호출
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