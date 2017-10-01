import java.awt.*;
import javax.swing.*;

class MyGUI extends JFrame {
	public MyGUI( ) {
		setTitle("JPanel에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리
		setSize(300, 200);
		setVisible(true); // 화면에 보이기, 프레임이 보여질 때 paint가 호출
	}

	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("c:/work/image/flower.jpg");
		Image image = icon.getImage( ); // 이미지 객체

		// swing에서는 paint( ) 보다 paintComponent( ) 사용하여 그리기 권장
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 항상 호출
			g.drawImage(image, 10, 7, this); // (10,7) 위치에 이미지 그리기
		}
	}
}

public class E1207 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}