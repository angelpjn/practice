import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame {
	JLabel label = new JLabel("Mouse position");

	public MyFrame( ) {
		setTitle("Mouse Event Demo");
		JTextField point = new JTextField(10);
		JPanel panel = new JPanel( );
		Container c = getContentPane( );
		c.add(panel);
		setLayout(new FlowLayout( ));

		// 리스너 인터페이스를 사용하면 해당하는 모든 메서드도 구현해야함
		label.addMouseListener(new MyMouseListener( ));
		label.addMouseMotionListener(new MyMouseMotionListener( ));

		// 어댑터를 사용하면 필요한 메서드만 구현하므로 효율적임
		label.addMouseListener(new MouseAdapter( ) {
			public void mouseClicked(MouseEvent e) {
				point.setText("X:" + e.getX( ) + "Y:" + e.getY( ));
			}
		});

		add(label);
		add(point);
		setResizable(false); // 창 크기 변경 X
		setSize(300, 200);
		setVisible(true); // 보이기
	}
// 마우스 이벤트를 받기 위한 리스너 구현
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX( ); // 마우스 클릭 좌표 x
			int y = e.getY( ); // 마우스 클릭 좌표 y
			label.setLocation(x, y); // 레이블의 위치를 (x,y)로 이동
			label.setText("X:" + e.getX( ) + "Y:" + e.getY( ));
		}

		public void mouseEntered(MouseEvent e) { }
		public void mouseExited(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }	
		public void mouseClicked(MouseEvent e) {
		}
	}

	// 마우스 움직임(이동) 이벤트를 받기 위한 리스너 구현
	class MyMouseMotionListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "마우스 드래그");
		}

		public void mouseMoved(MouseEvent e) { }
	}
}

public class MyFrame16 {
	public static void main(String[] args) {
		new MyFrame( );
	}
}