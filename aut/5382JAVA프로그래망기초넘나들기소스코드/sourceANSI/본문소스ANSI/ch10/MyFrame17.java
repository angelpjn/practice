import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyGUI extends JFrame {
	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(20, 30);
	String s;
	public MyGUI( ) {
		setTitle("Key Event Demo");
		JPanel panell = new JPanel(new FlowLayout( ));
		JPanel panel2 = new JPanel(new FlowLayout( ));

		tf.addKeyListener(new MyKeyListener( ));  // ������ ��� �� ȣ��
		tf.addKeyListener(new MyKeyAdapter( )); // ����� ��� �� ȣ��

		panell.add(tf);
		panel2.add(ta);
		add(panell, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);

		setBounds(100, 150, 400, 200);
		setResizable(false); // â ũ�� ���� X
		setVisible(true); // ���̱�
	}

	class MyKeyListener implements KeyListener {
		public void keyTyped(KeyEvent e) { // Ű�� ���� ����
			char c = e.getKeyChar( );
			s += "\n Key Type = " + String.valueOf(c);
			System.out.println(s);
			ta.setText(s);
		}

		public void keyPressed(KeyEvent e) { // Ű ��������
			int c = e.getKeyCode( );
			s += "\n Key Pressed = " + String.valueOf(c);
			System.out.println(s);
			ta.setText(s);
		}

		// ����Ű�� ���� ���� �����ڵ� Ű(���� Ű)�� �Էµ� ��쿡��
		public void keyReleased(KeyEvent e) {
			int c = e.getKeyCode( );
			s += "\n Released = " + String.valueOf(c);
			System.out.println(String.valueOf(c));
			ta.setText(s);
		}
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode( );
			String text = tf.getText( ); // �Էµ� �ڵ� ������
			switch (keyCode) {
			case KeyEvent.VK_ENTER: // ���� Ű
				ta.setText(text); break;
			case KeyEvent.VK_LEFT: // ���� ȭ��ǥ Ű
				tf.setLocation(tf.getX( ) - 10, tf.getY( )); 	break;
			case KeyEvent.VK_RIGHT: // ������ ȭ��ǥ Ű
				tf.setLocation(tf.getX( ) + 10, tf.getY( )); 	break;
			}
		}
	}
}

public class MyFrame17 {
	public static void main(String[] args) {
		new MyGUI( );
	}
}