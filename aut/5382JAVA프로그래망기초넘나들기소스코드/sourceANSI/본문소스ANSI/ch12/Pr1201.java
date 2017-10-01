import java.awt.*;
import javax.swing.*;

class MyGUI extends JFrame {
	public MyGUI( ) { // MyGUI 클래스에 대한 생성자(객체 생성 용도)
		setTitle("JLabel Demo"); // 타이틀
		setLayout(new FlowLayout( )); // 컴포넌트 배치 방법

		setSize(250, 150); // 윈도우 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 종료
		setVisible(true); // 화면에 보이기, 프레임이 보여질 때 paint가 호출
	}

	// 컴포넌트가 다시 그려질 필요가 있을 때 자동으로 호출된다
	// paint(Graphics g)에 원하는 도형이나 그림 코드 구현
	public void paint(Graphics g) {
		g.drawLine(20, 40, 50, 70); // 선을 그린다.
		g.drawRect(60, 40, 60, 40); // 사각형을 그린다.
		g.drawString("Java!", 140, 50); // 문자열을 그린다.
	}
}

public class Pr1201 {
	public static void main(String[ ] args) {
		new MyGUI( ); // 프레임 생성
	}
}