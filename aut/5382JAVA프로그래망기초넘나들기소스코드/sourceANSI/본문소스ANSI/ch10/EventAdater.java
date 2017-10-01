import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	private JLabel label, label2;

	public MyGUI( ) {
		initUI( );
	}

	public final void initUI( ) {
		label = new JLabel("�̺�Ʈ �߻� �ҽ�");
		final JTextArea ta = new JTextArea( );
		ta.setText("�� ���� �ȿ��� Ŭ���ϼ���!");

		ta.addMouseListener(new MouseAdapter( ) {
			public void mousePressed(MouseEvent e) {
				if (e.getButton( ) == MouseEvent.NOBUTTON) {
					ta.setText("No button clicked...");
				} else if (e.getButton( ) == MouseEvent.BUTTON1) {
					ta.setText("���ʹ�ư Ŭ��");
				} else if (e.getButton( ) == MouseEvent.BUTTON2) {
					ta.setText("��� ��ư Ŭ��");
				} else if (e.getButton( ) == MouseEvent.BUTTON3) {
					ta.setText("�����ʹ�ư Ŭ��");
				}

				label.setText("�̺�Ʈ �ҽ�: " + e.getSource( ).getClass( ).getName( ));
				System.out.println(e.getSource( ).getClass( ).getName( ));
				ta.append("��ǥ:(" + e.getX( ) + ", " + e.getY( ) + ")\n");
			}
		});

		setLayout(null); // ��ġ������ ����, ���� ��ġ�� ��ġ

		label.setSize(350, 150); // ���̺� ũ�� 350 x 150
		label.setLocation(20, 10); // ���̺� ��ġ (x, y)

		ta.setLocation(20, 20);
		ta.setSize(180, 50);

		add(label); // ���̱�
		add(ta);
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // ���̱�
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
			label.setText("��ǥ:(" + e.getX( ) + ", " + e.getY( ) + ")");
		}
	}
}

public class EventAdater {
	public static void main(String args[]) {
		new MyGUI( );
	}
}