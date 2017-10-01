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

		// ������ �������̽��� ����ϸ� �ش��ϴ� ��� �޼��嵵 �����ؾ���
		label.addMouseListener(new MyMouseListener( ));
		label.addMouseMotionListener(new MyMouseMotionListener( ));

		// ����͸� ����ϸ� �ʿ��� �޼��常 �����ϹǷ� ȿ������
		label.addMouseListener(new MouseAdapter( ) {
			public void mouseClicked(MouseEvent e) {
				point.setText("X:" + e.getX( ) + "Y:" + e.getY( ));
			}
		});

		add(label);
		add(point);
		setResizable(false); // â ũ�� ���� X
		setSize(300, 200);
		setVisible(true); // ���̱�
	}
// ���콺 �̺�Ʈ�� �ޱ� ���� ������ ����
	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX( ); // ���콺 Ŭ�� ��ǥ x
			int y = e.getY( ); // ���콺 Ŭ�� ��ǥ y
			label.setLocation(x, y); // ���̺��� ��ġ�� (x,y)�� �̵�
			label.setText("X:" + e.getX( ) + "Y:" + e.getY( ));
		}

		public void mouseEntered(MouseEvent e) { }
		public void mouseExited(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }	
		public void mouseClicked(MouseEvent e) {
		}
	}

	// ���콺 ������(�̵�) �̺�Ʈ�� �ޱ� ���� ������ ����
	class MyMouseMotionListener implements MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			JOptionPane.showMessageDialog(null, "���콺 �巡��");
		}

		public void mouseMoved(MouseEvent e) { }
	}
}

public class MyFrame16 {
	public static void main(String[] args) {
		new MyFrame( );
	}
}