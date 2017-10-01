import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

class MyGUI extends JFrame {
	// BMP, PNG 파일 이미지 로딩, ImageIcon으로 로딩 불가, 이 위치 중요
	// ImageIcon으로는 gif, jpg 파일 이미지 로딩
	URL imgURL = new File("c:/work/image/tmp.png").toURI( ).toURL( );
	Image image = new ImageIcon(imgURL).getImage( );

	public MyGUI( ) throws MalformedURLException {
		setTitle("JPanel에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setContentPane(new MyPanel( )); // 새 패널 이용하여 그래픽 처리
		add(new MyPanel( )); // 위 문장과 동일, 새 패널 이용하여 그래픽 처리
		setSize(200, 150);
		setVisible(true); // 화면에 보이기, 프레임이 보여질 때 paint가 호출
	}

	class MyPanel extends JPanel {
		// ImageIcon으로는 gif, jpg 파일 이미지 로딩
		ImageIcon icon = new ImageIcon("c:/work/image/tulip.jpg");
		Image image2 = icon.getImage( ); // 이미지 객체
		// swing에서는 paint( ) 보다 paintComponent( ) 사용하여 그리기 권장
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 항상 호출
			g.drawImage(image, 10, 7, this); // (10,7) 위치에 이미지 그리기
			g.drawImage(image2, 100, 7, this); // (10,7) 위치에 이미지 그리기
		}
	}
}

public class Pr1207 {
	public static void main(String[ ] args) throws MalformedURLException {
		new MyGUI( );
	}
}