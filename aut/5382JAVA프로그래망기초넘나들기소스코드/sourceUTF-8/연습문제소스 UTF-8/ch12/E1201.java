import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage; 

class MyGUI extends JFrame {
	BufferedImage image;

	public MyGUI( ) {
		setTitle("JPanel에 이미지로 paint");  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리
		setSize(100, 150);
		setVisible(true); // 화면에 보이기, 프레임이 보여질 때 paint가 호출
	}

	class MyPanel extends JPanel {
		// swing에서는 paint( ) 보다 paintComponent( ) 사용하여 그리기 권장
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 항상 호출
			g.drawRect(10, 10, 50, 60);		
		}
	}
}

public class E1201 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}