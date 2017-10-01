import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	private JLabel label, label2;

	public MyGUI( ) {
		initUI( );
	}

	public final void initUI( ) {
		label = new JLabel("이벤트 발생 소스");
		final JTextArea ta = new JTextArea( );
		ta.setText("이 영역 안에서 클릭하세요!");

		ta.addMouseListener(new MouseAdapter( ) {
			public void mousePressed(MouseEvent e) {
				if (e.getButton( ) == MouseEvent.NOBUTTON) {
					ta.setText("No button clicked...");
				} else if (e.getButton( ) == MouseEvent.BUTTON1) {
					ta.setText("왼쪽버튼 클릭");
				} else if (e.getButton( ) == MouseEvent.BUTTON2) {
					ta.setText("가운데 버튼 클릭");
				} else if (e.getButton( ) == MouseEvent.BUTTON3) {
					ta.setText("오른쪽버튼 클릭");
				}

				label.setText("이벤트 소스: " + e.getSource( ).getClass( ).getName( ));
				System.out.println(e.getSource( ).getClass( ).getName( ));
				ta.append("좌표:(" + e.getX( ) + ", " + e.getY( ) + ")\n");
			}
		});

		setLayout(null); // 배치관리자 삭제, 절대 위치로 배치

		label.setSize(350, 150); // 레이블 크기 350 x 150
		label.setLocation(20, 10); // 레이블 위치 (x, y)

		ta.setLocation(20, 20);
		ta.setSize(180, 50);

		add(label); // 붙이기
		add(ta);
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // 보이기
	}

	class MyMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			label.setText("Mouse Clicked: (" + e.getX( ) + ", " + e.getY( ) + ")");
		}

		public void mousePressed(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
		public void mouseEntered(MouseEvent e) { }
		public void mouseExited(MouseEvent e) { }
	}

	class MyAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			label.setText("좌표:(" + e.getX( ) + ", " + e.getY( ) + ")");
		}
	}
}

public class EventAdater {
	public static void main(String args[]) {
		new MyGUI( );
	}
}