import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	int mouseX, mouseY, newX, newY;
	Graphics g; // �������� Graphics ��ü�� ���� ����

	public MyGUI( ) {

		setTitle("getGraphics( )�� Graphics ��ü ���� �� ���콺�� � �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setVisible(true); // �������� ȭ�鿡 ���� �Ŀ�
		// ������Ʈ�� ������ �� ���� ���¿��� getGraphics�� ȣ��� null ��ȯ
		g = this.getGraphics( ); // ��ġ �߿�! �������� Graphics ��ü�� ���
		g.setColor(Color.red); // �׸��� ���� �������� ����
		addMouseListener(new MouseAdapter( ) { // ���콺 �̺�Ʈ ó��
			public void mousePressed(MouseEvent e) { // ���콺�� ������ ȣ��
				mouseX = e.getX( ); // ���콺�� x�� ��ġ�� ���
				mouseY = e.getY( ); // ���콺�� y�� ��ġ�� ���
			}
		});

		// ���콺 ������ �̺�Ʈ ó��
		addMouseMotionListener(new MouseMotionAdapter( ) {
			// ���콺�� �����̸�
			public void mouseDragged(MouseEvent e) {
				newX = e.getX( ); // ���콺 ���� ��ġ �˾Ƴ���
				newY = e.getY( ); // mouseX = e.getPoint( ).y; ����
				g.drawLine(mouseX, mouseY, newX, newY); // ���� �߱�
				mouseX = newX; // ���콺�� x�� ��ġ�� ���
				mouseY = newY; // ���콺�� y�� ��ġ�� ���
			}
		});
	}
}

public class E1205 {
	public static void main(String[ ] args) {
		new MyGUI( );
	}
}