import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	int mouseX, mouseY, newX, newY;
	Graphics g; // 프레임의 Graphics 객체를 위한 변수

	public MyGUI( ) {

		setTitle("getGraphics( )로 Graphics 객체 얻은 후 마우스로 곡선 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setVisible(true); // 프레임을 화면에 보인 후에
		// 컴포넌트가 보여질 수 없는 상태에서 getGraphics를 호출시 null 반환
		g = this.getGraphics( ); // 위치 중요! 프레임의 Graphics 객체를 얻기
		g.setColor(Color.red); // 그리기 색을 빨강으로 지정
		addMouseListener(new MouseAdapter( ) { // 마우스 이벤트 처리
			public void mousePressed(MouseEvent e) { // 마우스를 누르면 호출
				mouseX = e.getX( ); // 마우스의 x축 위치를 기억
				mouseY = e.getY( ); // 마우스의 y축 위치를 기억
			}
		});

		// 마우스 움직임 이벤트 처리
		addMouseMotionListener(new MouseMotionAdapter( ) {
			// 마우스가 움직이면
			public void mouseDragged(MouseEvent e) {
				newX = e.getX( ); // 마우스 현재 위치 알아내기
				newY = e.getY( ); // mouseX = e.getPoint( ).y; 동일
				g.drawLine(mouseX, mouseY, newX, newY); // 직선 긋기
				mouseX = newX; // 마우스의 x축 위치를 기억
				mouseY = newY; // 마우스의 y축 위치를 기억
			}
		});
	}
}

public class E1205 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}